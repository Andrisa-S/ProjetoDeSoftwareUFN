# Arquitetura de Software

## O que é?
- Como vou estruturar essas classes até eu conseguir fazer o que eu quero;
- A estrutura do sistema, seus componentes, suas interações e as decisões do projeto que define seu funcionamento;
- Sommerville enfatiza uma organização de componentes com responsabilidades externas.

- **Arquitetura** = "como o sistema é organizado por dentro"

### Segundo Pressman:
- Facilita comunicação entre equipe -> padronização do projeto;
- Define decisões críticas desde o início -> nasce logo após os requisitos;
- Reduz riscos do projeto;
- Serve como modelo do sistema.

  #### Trabalhar utilizando padrão está muito vinculada a qualidade do produto

### Segundo Sommerville impacta diretamente:
- Desempenho;
- Segurança;
- Disponibilidade;
- Manutenção.

  #### Não haverá nenhuma classe muito extensa.

## Quando ela aparece?
- A Arquitetura surge logo após os requisitos:
  - Requisitos -> Arquitetura -> Projeto detalhado -> Implementação
- **Importante**:
  - Arquitetura não é código;
  - É uma abstração de alto nível.

## Decisões Arquiteturais
1) Existe uma arquitetura de aplicação genérica que possa agir como um template  para o sistema que está sendo projetado?
2) Como o sistema será distribuíido enrte os núcleos ou processadores do hardware?
3) Quais os padrões ou estilos de arquitetura poderiam ser utilizados?
4) Qual será a abordagem fundamental utilizada para estruturar o sistema?
5) Qual estratégia será utilizada para controlar a operação dos componentes do sistema?
6) Como os componentes estruturais no sistema serão decompostos em subcomponentes?
7) Qual a melhor organização de arquitetura para entregar......
8) .......

## Visões de Arquitetura
- Tipos de visões:
  - Visão lógica
    - Funcionalidades
    - ..
  - Visão de Processo
    - Execução e concorrência
    - Mostra como, no tempo de execução, o sistema é comporto de processos que interagem. Essa visão é útil para fazer julgamentos sobre características não funcionais do sistema, como o desempenho e a disponibilidade.
  - Visão de Desenvolvimento
    - Organização de código
    - ...
  - Visão Física
    - Infraestrutura/hardware
    - ...

## Arquitetura em Camadas
- **O que são?**
  - Um padrão geral de organização so sistema
  - Organiza o sistema em camadas, com funcionalidade associada a cada uma. Uma camada fornece serviços para a camada acima dela, então as camadas nos níveis inferiores representam os serviços essenciais que tendem a ser utilizados em todos os sistema.

- **Quando é utilizado?**
  - Utilizado quando se cria novos recursos em uma de sistemas existentes. Quando o desenvolvimento é distribuído por vários times, cada um deles responsável por uma camada de funcionalidade;
  - Quando há necessidade de segurança de informação Security em múltiplos níveis.

- **Vantagens:**
  - Permite a substituição de camadas inferiores...

- **Desvantagens:**
  - Na prática, muitas vezes é difícil proporcionar uma separação clara entre as camadas, de modo que camadas dos níveis mais altos podem ter de interagir com as dos níveis mais baixos em vez das imediatamente inferiores a elas. O desempenho pode ser um problema por causa dos múltiplos níveis de interpretação de uma requisição de serviço à medida que essa requisição é processada em cada camada.

- Camadas:
  - Camada central
    - Camada de utilização
      - Camada de aplicação
        - Camada da interface do usuário

## Arquitetura de repositório/centralizada em dados
- Armazenamento de dados (repositório ou quadro-negro)
  - Software cliente
  - Software cliente
  - Software cliente

- Todos os dados em um sistema são gerenciados em um repositório central que é acessível a todos os componentes do sistema. Os componentes não interagem diretamente, apenas por meio de repositório.

- **Quando é utilizado?**
  - Esse padrão deve ser usado em um sistema no qual...

- **Vantagens:**
  - Os componentes podem ser independentes; eles não precisam saber da existência dos outros componentes. As mudanças feitas por um componente podem ser propagadas...

- **Desvantagens:**
  - O repositório é um único ponto de falha, então os problemas no repositório afetam o sistema inteiro. Pode haver ineficiências em organizar a toda comunicação por meio do repositório. Pode ser difícil distribuir o repositório por vários computadores.

## Arquitetura Cliente-Servidor
- Clientes conectados à Internet; Internet conectada nos servidores - diferentes itens em servidores diferentes, cliente acessa um tipo específico de conteúdo em um servidor específico, assim evita acessartodo o servidor para ver uma fração de dados;
- Um sistema que segur=e padrão cliente-servidor é organizado como um conjunto de serviços e servidores associados a de clientes que acessam e usam esser serviços. Os principais componentes:
  1) Um conjunto de servidores que oferecem serviço para outros componentes;
  2) Um conjunto de clientes que demanda os serviços oferecidos pelos servidores;
  3) Uma rede que permite que os clientes acessem esses serviços.
- Em uma arquitetura cliente-servidor........

- **Quando é utilizado?**
  - Utilizado quando os dados em um banco...

- **Vantagem:**
  - A principal vantagem desse modelo é que os servidores podem ser distribuídos pela rede....

- **Desvantagens:**
  - .............

## Arquitetura Duto e Filtro
