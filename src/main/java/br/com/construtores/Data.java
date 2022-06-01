package br.com.construtores;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

@Getter
@Setter
public class Data {

   private String data;

    public Data(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                '}';
    }

    public boolean valiteData(String data){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
            LocalDate date = LocalDate.parse(data, formatter);
            return true;
        }catch (DateTimeParseException e){
            return false;
        }
    }
}
