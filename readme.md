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
* o algoritmo para criação de um objeto complexo deve ser independente das partes que compõem o objeto e de como elas são montadas;
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

## Factory Method ou Virtual Constructor
### Objetivo
Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar. O Factory Method permite adiar a instanciação para subclasses.

### Aplicabilidade
Use o padrão Factory Method quando: 
* uma classe não pode antecipar a classe de objetos que deve criar;
* uma classe quer que suas subclasses especifiquem os objetos que criam;
* classes delegam responsabilidade para uma dentre várias subclasses auxiliares, e você quer localizar o conhecimento de qual subclasse auxiliar que é a delegada.

### Consequências
O Factory Method elimina a necessidade de anexar classes específicas das aplicações no código. O código lida somente com a interface de Product; portanto, ele pode trabalhar com quaisquer classes ConcreteProduct definidas pelo usuário.
Uma desvantagem em potencial dos métodos-fábrica é que os clientes podem ter que fornecer subclasses da classe Creator somente para criar um objeto ConcreteProduct em particular. Usar subclasses é bom quando o cliente tem que fornecer subclasses a Creator de qualquer maneira, caso contrário, o cliente deve lidar com outro ponto de evolução.
Consequências adicionais do Factory Method: 
1. Fornece ganchos para subclasses. Criar objetos em uma classe com um método fábrica é sempre mais flexível do que criar um objeto diretamente. Factory Method dá às subclasses um gancho para fornecer uma versão estendida de um objeto.
2. Conecta hierarquias de classes paralelas. Nos exemplos que consideramos até aqui o método-fábrica é somente chamado por Creators. Mas isto não precisa ser obrigatoriamente assim; os clientes podem achar os métodos-fábrica úteis, especialmente no caso de hierarquias de classe paralelas. Hierarquias de classe paralelas ocorrem quando uma classe delega alguma das suas responsabilidades para uma classe separada. Considere, por exemplo, figuras que podem ser manipuladas interativamente; ou seja, podem ser esticadas, movidas ou giradas usando o mouse. Implementar tais interações não é sempre fácil. Isso frequentemente requer armazenar e atualizar informação que registra o estado da manipulação num certo momento. Este estado é necessário somente durante a manipulação; portanto, não necessita ser mantido no objeto figura. Além disso, diferentes figuras se comportam de modo diferente quando são manipuladas pelo usuário. Por exemplo, esticar uma linha pode ter o efeito de mover um dos extremos, enquanto esticar um texto pode mudar o espaçamento de linhas. Com essas restrições, é melhor usar um objeto Manipulator separado, que implementa a interação e mantém o registro de qualquer estado específico da manipulação que for necessário. Diferentes figuras utilizarão diferentes subclasses Manipulator para tratar interações específicas. A hierarquia de classes Manipulator resultante é paralela (ao menos parcialmente) à hierarquia de classes de Figure. A classe Figure fornece um método fábrica CreateManipulator que permite aos clientes criar o correspondente Manipulator de uma Figure. As subclasses de Figure substituem esse método para retornar uma instância da subclasse Manipulator correta para elas. Como alternativa, a classe Figure pode implementar CreateManipulator para retornar por omissão uma instância de manipulator, e as subclasses de Figure podem simplesmente herdar essa instância por omissão. As classes Figure que fizerem assim não necessitarão de uma subclasse correspondente de Manipulator - por isso dizemos que as hierarquias são somente parcialmente paralelas. O método fábrica define a conexão entre as duas hierarquias de classes. Nele se localiza o conhecimento de quais classes trabalham juntas.

### Implementação
1. Duas variedades principais. As duas principais variações do padrão Factory Method são: o caso em que a classe Creator é abstrata e não fornece uma implementação para o método-fábrica que ela declara, e o caso quando o Creator é uma classe concreta e fornece uma implementação por omissão para o método-fábrica. Também é possível ter uma classe abstrata que define uma implementação por omissão, mas isto é menos comum. O primeiro caso exige subclasses para definir uma implementação porque não existe uma omissão razoável, assim contornando o dilema de ter que instanciar classes imprevisíveis. No segundo caso, o ConcretCreator usa o método fábrica principalmente por razões de flexibilidade. Está seguindo uma regra que diz: "criar objetos numa operação separada de modo que subclasses possam redefinir a maneira como eles são criados". Essa regra garante que projetistas de subclasses, caso necessário, possam mudar a classe de objetos que a classe ancestral instancia.
2. Métodos-fábrica parametrizados. Outra variante do padrão permite ao método-fábrica criar múltiplos tipos de produtos. O método-fábrica recebe um parâmetro que identifica o objeto a ser criado. Todos os objetos que o método-fábrica cria compartilharão a interface de Product. O framework de edição Unidraw usa esta abordagem para reconstruir objetos salvos em disco. Unidraw define uma classe Creator com método-fábrica Create que aceita um identificador de classe a ser instanciada. Quando Unidraw salva um objeto em disco, primeiro grava o identificador da classe, e então suas variáveis de instância. Quando reconstrói o objeto do disco, primeiro lê o identificador de classe. Depois que o idetificador de classe é lido, o framework chama Create, passando o identificador como o parâmetro. Create procura o construtor para a classe correspondente, utilizando-o para instanciar o objeto. Por último, Create chama a operação Read do objeto, a qual lê a informação restante do disco e inicia as variáveis de instância do objeto. Redefinir um método-fábrica parametrizado permite, fácil e seletivamente, estender ou mudar os produtos que um Creator produz. Você pode introduzir novos identificadores para novos tipos de produtos, ou pode associar identificadores existentes com diferentes produtos.
3. Variantes e tópicos específicos das linguagens. Diferentes linguagens levam a outras variantes interessantes, bem como a cuidados especiais. Programas em Smalltalk podem usar um método que retorna a classe do objeto a ser instanciado. Um método-fábrica Creator pode usar esse valor para criar um produto, e um ConcreteCreator pode armazenar ou mesmo computar esse valor. O resultado é uma associação ainda mais tardia para o tipo de ConcreteProduct a ser instanciado. Um exemplo de Document pode definir um método documentClass em Application. O método documentClass retorna a classe apropriada de Document para instanciar Documentos. A implementação de documentClass em MyApplication retorna a classe MyDocument. Uma abordagem ainda mais flexível próxima dos métodos-fábrica parametrizados é armazenar a classe a ser criada como uma variável de classe de Application. Desse modo não é necessário introduzir subclasses de Application para variar o produto.
4. Utilizando templates para evitar o uso de subclasses. Outro problema potencial com métodos-fábrica é que podem forçá-lo a introduzir subclasses somente para criar os objetos-produto apropriados. Uma maneira de contornar isso é fornecer uma subclasse template de Creator que é parametrizada pela classe Product.
5. Convenções de nomenclatura. É uma boa prática convenções de nomenclatura que tornam claro que você está usando métodos-fábrica.

## Prototype
### Objetivo
Especificar os tipos de objetos a serem criados usando uma instância-protótipo e criar novos objetos pela cópia desse protótipo.

### Aplicabilidade
Use o padrão Prototype quando um sistema tiver que ser independente de como os seus produtos são criados, compostos e representados.
* quando as classes a instanciar forem especificadas em tempo de execução, por exemplo, por carga dinâmica;
* para evitar a construção de uma hierarquia de classes de fábricas paralelas à hierarquia de classes de produto;
* quando as instâncias de uma classe puderem ter uma dentre poucas combinações diferentes de estados. Pode ser mais conveniente instalar um número correspondente de protótipos e cloná-los, ao invés de instanciar a classe manualmente, cada vez com um estado apropriado.

### Consequências
Prototype oculta as classes de produtos concretas do cliente, desta forma reduzindo o número de nomes que os clientes necessitam saber. Além disso, esse padrão permite a um cliente trabalhar com classes específicas de uma aplicação sem necessidade de modificação.\
Os benefícios adicionais do padrão Prototype estão relacionados abaixo.
1. Acrescenta e remove produtos em tempo de execução. Prototype permite incorporar uma nova classe concreta de produto a um sistema, simplesmente registrando uma instância protótipo com o cliente. Isso é um pouco mais flexível do que outros padrões de criação, porque o cliente pode instalar e remover protótipos em tempo de execução.
2. Especifica novos objetos pela variação de valores. Sistemas altamente dinâmicos permitem definir novos comportamentos através da composição de objetos, por exemplo, pela especificação de valores para as variáveis de um objeto e não pela definição de novas classes. Você efetivamente define novos tipos de objetos pela instanciação de classes existentes e registrando as instâncias como protótipos dos objetos-clientes. Um cliente pode exibir um novo comportamento através da delegação de responsabilidades para o protótipo. Esse tipo de projeto permite aos usuários definir novas "classes" sem ter que programar. De fato, clonar um protótipo é semelhante a instanciar uma classe. O padrão Prototype pode reduzir grandemente o número de classes que um sistema necessita.
3. Especifica novos objetos pela variação da estrutura. Muitas aplicações constróem objetos com partes e subpartes. Por exemplo, editores para um projeto de circuitos que constroem circuitos a partir de subcircuitos. Por questões de conveniência, tais aplicações frequentemente permitem instanciar estruturas complexas, definidas pelo usuário, para, por exemplo, usar um subcircuito específico repetidas vezes. O padrão Prototype também suporta isso. Simplesmente adicionamos esse subcircuito como um protótipo à paleta dos elementos de circuitos disponíveis. Contanto que o objeto-circuito composto implemente um clone por replicação (deep copy), circuitos com diferentes estruturas podem ser protótipos.
4. Reduz o número de subclasses. O Factory Method frequentemente produz uma hierarquia de classes Creator paralela à hierarquia de classes do produto. O padrão Prototype permite clonar um protótipo em vez de pedir a um método fábrica para construir um novo objeto. Daí não necessitar de nenhuma hierarquia de classes Creator. Esse benefício se aplica primariamente a linguagens como C++, que não tratam as classes como objetos de primeira classe. As linguagens que assim o fazem, como Smalltalk e ObjectiveC, obtêm menos benefícios, uma vez que sempre se usa um objeto-classe como um criador. Objetos-classe já funcionam como protótipos nessas linguagens.
5. Configura dinamicamente uma aplicação com classes. Alguns ambientes de tempo de execução permitem carregar classes dinamicamente numa aplicação. O padrão Prototype é a chave para a exploração de tais possibilidades em uma linguagem como C++. Uma aplicação que quer criar instâncias de classes dinamicamente carregadas não será capáz de referenciar o seu construtor estaticamente. Em vez disso, o ambiente de tempo de execução cria uma instância de cada classe automaticamente, quando carregada, e registra a instância junto a um gerenciador de protótipo. Então, a aplicação pode solicitar ao gerenciador de protótipo instâncias de classes recém-carregadas, classes essas que originalmente não estavam "linkadas" ao programa.

### Implementação
Prototype é particularmente útil com linguagem estáticas como C++, na qual as classes não são objetos, e pouca ou nenhuma informação sobre tipos está disponível em tempo de execução. Ele é menos importante em linguagens como Smalltalk ou ObjectiveC, que fornecem o equivalente a um protótipo para a criação de instâncias de cada classe. Ao implementar protótipos levam-se em consideração os seguintes aspectos:
1. Usar um gerenciador de protótipos. Quando o número de protótipos em um sistema não é fixo (podem ser criados e destruídos dinamicamente), é importante manter um sistema de registro dos protótipos disponíveis. Os clientes não vão gerenciar os protótipos, mas farão sua armazenagem e recuperação pelo sistema de registros. Um cliente solicitará um protótipo ao sistema de registros antes de cloná-lo. Nós chamamos esse sistema de registro de gerenciador de protótipos. Um gerenciador de protótipos é uma memória associativa que retorna o protótipo correspondente a uma chave fornecida. Ele tem operações para registrar um protótipo com uma chave e para removê-lo do registro. Os clientes podem mudar ou mesmo pesquisar os registros em tempo de execução. Isso permite aos clientes estenderem e fazerem um inventário do sistema sem necessidade de escrever linhas de código.
2. Implementar a operação Clone. A parte mais difícil do padrão Prototype é a implementação correta da operação Clone. Ela é particularmente difícil quando as estruturas de objetos contêm referências circulares. A maioria das linguagens fornece algum suporte para a clonagem de objetos. Por exemplo, Smalltalk fornece uma implementação de copy que é herdade de Object. C++ fornece um construtor copy. Mas estes recursos não resolvem o problema shallow copy versus deep copy (cópia por referência versus cópia por replicação). Ou seja, clonar objetos significa clonar suas variáveis de instância, ou o clone e o original simplesmente compartilham as variáveis. Uma shallow copy é simples e, na maior parte das vezes, suficiente, e é o que o Smalltalk fornece por omissão. O construtor de cópias por omissão em C++ faz uma cópia membro a membro, o que significa que os apontadores serão compartilhados entre a cópia e o original. Porém, clonar protótipos com estruturas complexas normalmente exige uma cópia por replicação (deep copy), porque o clone e o original devem ser independentes. Portanto, você deve garantir que os componentes do clone são clones dos componentes do protótipo. A clonagem força a decidir o que, se for o caso, será compartilhado. Se os objetos no sistema fornecem operações de Salvar e Carregar, então você pode usá-las para fornecer uma implementação por omissão de Clone simplesmente salvando o objeto e carregando-o de volta imediatamente. A operação de Salvar salva o objeto em um buffer de memória, e a operação Carregar cria uma cópia por reconstrução do objeto a partir do buffer.
3. Iniciar clones. Enquanto alguns clientes ficam contentes com o clone tal como ele é, outros desejaram iniciar alguns ou todos os seus estados internos com valores de sua escolha. Você geralmente não pode passar esses valores para operação Clone porque o seu número variará entre as classes de protótipo. Alguns protótipos podem necessitar de múltiplos parâmetros de inicialização; outros não necessitarão de nenhum. Passar parâmetros para a operação Clone impede uma interface uniforme de clonagem. Pode ser que suas classes-protótipos já definam operações para (re)estabelecer estados-chave. Caso isso aconteça, os clientes podem usar essas operações imediatamente após a clonagem. Se isso não acontecer, então você pode ter que introduzir uma operação Initialize que recebe parâmetros de inicialização como argumentos e estabelece o estado interno do clone de acordo. Cuidado com as operações de clone que usam replicação (deep copying) - as cópias podem ter que ser deletadas (ou explicitamente, ou dentro de Initialize) antes de reinicializá-las.
