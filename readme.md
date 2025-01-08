# Design Patterns

## Abstract Factory
### Objetivo
Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

### Aplicabilidade
Use o padrão Abstract Factory quando:
* um sistema deve ser independente de como seus produtos são criados, compostos ou representados;
* um sistema deve ser configurado como um produto de uma família de múltiplos produtos;
* uma família de objetos-produto for projetada para ser usada em conjunto, e você necessita garantir esta restrição;
* você quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, não suas implementações.

### Consequências
O padrão Abstract Factory tem os seguintes benefícios e desvantagens:
1. Isola classes concretas. O padrão Abstract Factory ajuda a controlar as classes de objetos criadas por uma aplicação. Uma vez que a fábrica encapsula a responsabilidade e o processo de criar objetos-produto, isola os clientes das classes de implementação. Os clientes manipulam as instâncias através das suas interfaces abstratas. Nomes de classes-produto ficam isolados na implementação da fábrica concreta; eles não aparecem no código do cliente.
2. Torna fácil a troca de famílias de produtos. A classe de uma fábrica concreta aparece apenas uma vez numa aplicação, quando é instanciada. Isso facilita mudar a fábrica concreta que uma aplicação usa. Ela pode usar diferentes configurações de produtos simplesmente trocando a fábrica concreta. Uma vez que a fábrica abstrata cria uma família completa de produtos, toda família de produtos muda de uma só vez.
3. Promove a harmonia entre produtos. Quando objetos-produto numa família são projetados para trabalharem juntos, é importante que uma aplicação use objetos de uma família de cada vez. Abstract Factory facilita assegurar isso.
4. É difícil de suportar novos tipos de produtos. Estender fábricas abstratas para produzir novos tipos de Produtos não é fácil. Isso se deve ao fato de que a interface de Abstract Factory fixa o conjunto de produtos que podem ser criados. Suportar novos tipos de produto exige estender a interface da fábrica, o que envolve mudar a classe Abstract Factory e todas as suas subclasses.

### Implementação
A seguir, algumas técnicas úteis para implementar o padrão Abstract Factory.
1. Fábricas como singletons. Uma aplicação necessita somente de uma instância de uma Concrete Factory por família de produto. Assim, ela é normalmente melhor implementada como um Singleton.
2. Criando os produtos. Abstract Factory somente declara uma interface para criação de produtos. Fica a cargo das subclasses de Concrete Products criá-lo efetivamente. A maneira mais comum de fazer isso é definir um método-fábrica (Factory Method) para cada produto. Uma fábrica concreta especificará seus produtos redefinindo (overriding) o método fábrica para cada um. Embora esta implementação seja simples, exige uma nova subclasse de uma fábrica concreta para cada família de produtos, ainda que as famílias de produto tenham somente diferenças pequenas.\
Se muitas famílias de produtos são possíveis, a fábrica concreta pode ser implementada usando o padrão Prototype. A fábrica concreta é iniciada com uma instância prototípica de cada produto da família e cria um novo produto clonando o seu protótipo. A abordagem baseada no Prototype elimina a necessidade de uma nova classe de fábrica concreta para cada nova família de produtos.
3. Definindo fábricas extensíveis. Abstract Factory normalmente define uma operação diferente para cada tipo de produto que pode produzir. Os tipos de produtos estão codificados nas assinaturas das operações. O acréscimo de um novo tipo de produto exige a mudança da interface de Abstract Factory e de todas as classes que dependem dela. Um projeto mais flexível, mas menos segura, é acrescentar um parâmetro às operações que criam objetos. Este parâmetro especifica o tipo de objeto a ser criado. Ele poderia ser um identificador de classe, um inteiro, uma string ou qualquer outra coisa que identifica o tipo de produto. Com esta abordagem, Abstract Factory, somente necessita uma única operação "Make" com um parâmetro indicando o tipo de objeto a ser criado. Está é a técnica usada em Prototype e nas fábricas abstratas baseadas em classe. Você pode usá-la em linguagens com tipo estaticamente definidos somente quando todos os objetos têm a mesma classe abstrata de base ou quando os objetos-produto podem ser seguramente forçados a serem do tipo correto pelo cliente que os solicitou. Mas mesmo quando não é necessário forçar o tipo correto, permanece um problema inerente: todos os produtos são retornados ao cliente com a mesma interface abstrata, conforme especificado pelo tipo de retorno. O cliente não será capaz de diferenciar ou fazer hipóteses seguras sobre a classe de um produto. Se os clientes necessitam executar operações específicas às subclasses, elas não serão acessíveis através da interface abstrata. Embora o cliente possa executar um *downcast*, isso não é sempre viável ou segura, já que o *downcast* pode falhar. É o clássico compromisso para se obter uma interface altamente flexível e extensível.


## Builder
### Objetivo
Separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.

### Aplicabilidade
Use o padrão Builder quando:
* o algoritmo para criação de um objeto complexo deve ser independente das partes que compõem o objeto e de como elas são montadas.
* o processo de construção deve permitir diferentes representações para o objeto construído.

### Consequências
A seguir são apresentadas consequências-chave da utilização do padrão Builder:
1. Permite variar a representação interna de um produto. O objeto Builder fornece ao diretor uma interface abstrata para a construção do produto. A interface permite ao construtor ocultar a representação e a estrutura interna do produto. Ela também oculta como o produto é montado. Já que o produto é construído por meio de uma interface abstrata, tudo o que você tem que fazer para mudar sua representação interna é definir um novo tipo de construtor.
2. Isola o código para construção e representação. O padrão Builder melhora a modularidade pelo encapsulamento da forma como um objeto complexo é construído e representado. Os clientes nada necessitam saber sobre as classes que definem a estrutura interna do produto; tais classes não aparecem na interface de Builder. Cada ConcreteBuilder contém todo o código para criar e montar um tipo de produto específico. O código é escrito somente uma vez; então diferentes Directors podem reutilizá-lo para construir variantes de Product com o mesmo conjunto de partes.
3. Oferece um controle mais fino sobre o processo de construção. Ao contrário de padrões de criação que constroem produtos de uma só vez, o Builder constrói o produto passo a passo sob o controle do diretor. Somente quando o produto está terminado o diretor o recupera do construtor. Daí a interface de Builder refletir o processo de construção do produto mais explicitamente do que outros padrões de criação. Isso dá um controle mais fino sobre o processo de construção e, consequentemente, da estrutura interna do produto resultante.

### Implementação
Uma classe abstrata Builder define uma operação para cada componente que um diretor lhe pedir para criar. As operações não fazem nada por omissão. Uma classe ConcreteBuilder redefine as operações para os componentes que ela está interessada em criar.
Aqui estão outros tópicos de implementação a serem considerados:
1. Interface de montagem e construção. Os Builders constroem os seus produtos de uma forma gradual. Portanto, a interface da classe Builder deve ser geral o bastante para permitir a construção de produtos para todos os tipos de construtores concretos. Um tópico-chave de projeto diz respeito ao modelo para o processo de construção e montagem. Um modelo onde os resultados das solicitações de construção são simplesmente acrescentados ao produto é normalmente suficiente.
2. Por que não classes abstratas para produtos? Nos casos comuns, os produtos produzidos pelos construtores concretos diferem tão grandemente na sua representação que há pouco a ganhar ao dar a diferentes produtos uma classe-pai comum. Uma vez que o cliente em geral configura o diretor com o construtor concreto apropriado, o cliente está em posição de saber quais subclasses concretas de Builder estão em uso e pode tratar os seus produtos de acordo.
3. Métodos vazios como a omissão em Builder. Em C++, os métodos de construção são intencionalmente não-declarados como funções-membro. Em vez disso, eles são definidos como métodos vazios, permitindo aos clientes redefinirem somente as operações em que estão interessados.