### 🖖🏻 Olá, terráqueos

#### 👩🏻‍💻 Esse repositório tem as seguintes funcionalidades:

🐫 treinar os conceitos já aprendidos de POO;

🐫 compreender melhor o conceito de Composição que ainda é confuso para mim;

🐫 aprender mais sobre interfaces através de pequenos exercícios;

🐫 aplicar alguns designs patterns junto com POO;

🐫 treinar para testes técnicos em Java;

### 🧠 Bônus de aprendizagem:

👩‍🎓 aproveitando para aprender sobre Collections

👩‍🎓 aplicando estruturas de dados (estudando no momento)

👩‍🎓 aprendendo sobre Maven, Java 8 e arquivos em Java e comandos do Git

### 🧗‍♀️ Avisos:

🥁 Você pode baixar tranquilamente esse repositório e rodar na sua máquina, porque exclui a pasta "ide" do repositório local que é gerada quando crio projetos usando a IDE 
IntelliJ.

🥁 Para rodar precisa apenas ter a JVM instalada no seu pc e uma IDE que tenha suporte para a Java, como, [VsCode](https://code.visualstudio.com/), [Intellij](https://www.jetbrains.com/pt-br/idea/),
[Eclipse](https://www.eclipse.org/downloads/), [NetBeans](https://netbeans.apache.org/download/index.html) e outras.

🥁 Eu utilizo bastante o Lombok nos meus projetos Java para não ter que criar os getters e setters na mão
e também não deixar poluído visualmente a IDE com muitas linhas de código, por isso se não
tiver o Lombok na sua IDE, você terá duas opções: Criar os getters e setters das classes ou instalar o Lombok.

🥁 No Eclipse você instalar o Lombok dessa maneira --> [Instalando Lombok no Eclipse](https://dicasdejava.com.br/como-configurar-o-lombok-no-eclipse/). No Intellij você instala dessa forma --> [Instalando Lombok no Intellij](https://dicasdejava.com.br/como-configurar-o-lombok-no-intellij-idea/)


### ⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️ Desafio Lanchonete Quase Três Lanches ⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️⚠️

☑️ Estava procurando exercícios com especificações já definidas pela internet e achei alguns desafios de POO no site [Computer Science](https://www.computersciencemaster.com.br/exercicios/) e resolvi fazer o desafio Lanchonete Quase Três Lanches.

#### 📢 Descrição: 
A lanchonete “Quase Três Lanches” está em fase de crescimento em seu delivery e atendimento e pretende expandir seu funcionamento. Porém, os donos sempre operaram utilizando planilhas do Excel e ferramentas bastante simples, sendo assim, nenhum sistema personalizado foi criado e você pretende automatizar o trabalho desse estabelecimento. Na entrevista com os donos do estabelecimento você começou a questioná-los sobre o funcionamento do estabelecimento. Alguns detalhes foram surgindo durante a conversa:

1. A lanchonete possui 3 principais itens de venda: pizzas, lanches e salgadinhos. Inicialmente, o sistema será testado para controlar as vendas desses 3 itens apenas.
2. Todos os itens vendidos devem conter: **preço de venda, data de validade e peso.**
3. O sistema da nossa lanchonete deverá criar um pedido, esse pedido será composto pelo nome do cliente, itens que foram consumidos e taxa de serviço.
4. O sistema deve permitir gerar a nota fiscal para entregar ao cliente.
5. O vendedor poderá inserir o valor recebido em dinheiro e o sistema calcula e mostra o troco do cliente na tela.

Para o seu cliente, é imprescindivel que o sistema tenha algumas funções. O dono descreveu essas funções dizendo:   “Gostaríamos de oferecer em nosso cardápio virtual, pizzas com diferentes recheios bordas e molhos. Também queremos oferecer opções para o cliente escolher qual o tipo de recheio, bordas recheadas ou não e o molho que vai ser usado.”   “Os pedidos de lanches precisam conter algumas informações essenciais, são elas: tipo do pão, recheio e molhos obrigatoriamente.”    “Os salgadinhos possuem grande saída, queremos controlar sua venda. Gostariamos que os pedidos contivessem: o tipo (frito ou assado), massa e recheio.”

### 💡💡💡💡💡💡💡💡 Minha Resolução 💡💡💡💡💡💡💡

🏷️ [Minha Solução](https://github.com/srtapoe/exercitando-poo/tree/master/src/main/java/br/com/lanchonete)

☢️ Minha solução coloquei Enums, porque achei mais fácil do que ter que escrever N opções para cada item. Optei também por uso de interface nos pedidos. A solução tem alguns bugs, como no menu que está saltando a opção do nome do cliente, assim como a da opção do Molho da Pizza que fiz um menu a parte e para isso terei que refazer ambos os menus. Refatorarei em breve para diminuir a alta complexidade e integrar o JavaX no sisteminha para ter uma interface mais amigável.


### 🎓 Material de Apoio:

📔 [Comandos Git](https://comandosgit.github.io/)

📔 [Desbravando Java e Orientação a Objetos](https://www.amazon.com.br/Desbravando-Orienta%C3%A7%C3%A3o-Objetos-Iniciante-Linguagem/dp/8555190584)

📔 [Design Patterns com Java: Projeto orientado a objetos guiado por padrões](https://www.amazon.com.br/Design-Patterns-com-Java-orientado-ebook/dp/B00VAALPB2)

📔 [Explorando APIS e bibliotecas Java](https://www.amazon.com.br/Explorando-Bibliotecas-Java-Threads-JavaFx/dp/8555190495)

📔 [Java 8 Prático](https://www.amazon.com.br/Java-Pr%C3%A1tico-Lambdas-recursos-linguagem-ebook/dp/B00VAB1VP6)
