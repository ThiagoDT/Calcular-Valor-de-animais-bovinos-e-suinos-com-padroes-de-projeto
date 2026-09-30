<h1>🐄🐖 Cálculo de Valor de Animais Bovinos e Suínos</h1>

Sistema desenvolvido para realizar o cálculo do valor de animais bovinos e suínos, considerando seus valores em arroba (@) e quilo (kg).

O projeto foi desenvolvido com foco na aplicação prática de Padrões de Projeto (Design Patterns), buscando organizar o código, facilitar sua manutenção e demonstrar a utilização de boas práticas de desenvolvimento de software.

<h2>📋 Sobre o projeto</h2>

O Calcular Valor de Animais Bovinos e Suínos é um projeto acadêmico voltado para o desenvolvimento de uma aplicação capaz de calcular o valor de animais utilizados na pecuária.

O sistema trabalha com diferentes tipos de animais e permite realizar cálculos relacionados ao seu peso e valor comercial, utilizando como referência unidades comuns na comercialização de animais:

Quilograma (kg)

Arroba (@)

Além da funcionalidade de cálculo, o projeto tem como objetivo demonstrar a aplicação de padrões de projeto de software, utilizando uma estrutura orientada a objetos para separar responsabilidades e tornar o código mais organizado.

<h2>🎯 Objetivos</h2>

O projeto possui os seguintes objetivos:

Desenvolver uma aplicação para cálculo do valor de animais;

Trabalhar com animais bovinos e suínos;

Realizar cálculos utilizando peso em quilogramas;

Trabalhar com valores baseados em arroba;

Aplicar conceitos de Programação Orientada a Objetos;

Demonstrar a utilização de padrões de projeto;

Melhorar a organização e reutilização do código;

Facilitar futuras alterações e extensões do sistema.

<h2>🐄🐖 Animais</h2>

O sistema é direcionado principalmente para dois grupos de animais:

Bovinos

Os bovinos podem ter seu valor calculado utilizando o peso do animal e o preço estabelecido para a arroba ou para o quilograma.

Suínos

Da mesma forma, o sistema permite trabalhar com suínos, considerando seu peso e os valores utilizados no cálculo.

<h2>💰 Cálculo por arroba</h2>

A arroba (@) é uma unidade tradicionalmente utilizada na comercialização de animais, especialmente no mercado de bovinos.

De forma geral, o cálculo pode considerar a conversão do peso do animal para arrobas e, posteriormente, aplicar o preço correspondente.

Exemplo conceitual:
```text
Peso do animal = 450 kg
Valor da arroba = R$ 300,00

Quantidade de arrobas = Peso / fator de conversão
Valor do animal = Quantidade de arrobas × valor da arroba
```

Os valores utilizados no exemplo acima são apenas ilustrativos.

<h2>⚖️ Cálculo por quilograma</h2>

O sistema também trabalha com o cálculo baseado no valor por quilograma.

Exemplo conceitual:
```text
Peso do animal = 450 kg
Valor por kg = R$ 10,00

Valor do animal = 450 × 10
Valor total = R$ 4.500,00
```

Os valores utilizados no exemplo acima são apenas ilustrativos.

<h2>🧩 Padrões de Projeto</h2>

Um dos principais objetivos do projeto é demonstrar a aplicação de padrões de projeto (Design Patterns) na construção do software.

A utilização desses padrões permite organizar melhor as responsabilidades das classes e reduzir o acoplamento entre os componentes da aplicação.

Entre os benefícios buscados estão:
<ul>
  <li>♻️ Reutilização de código;</li>
  <li>🧱 Melhor organização da estrutura do sistema;</li>
  <li>🔧 Facilidade de manutenção;</li>
  <li>📈 Facilidade para adicionar novos tipos de animais;</li>
  <li>🔌 Redução do acoplamento entre componentes;</li>
  <li>🧪 Maior facilidade para testes e evolução do sistema.</li>
</ul>
Os padrões de projeto específicos devem ser consultados diretamente na implementação da pasta Lista 6, evitando atribuir ao projeto padrões que não estejam efetivamente implementados.

<h2>🏗️ Estrutura do projeto</h2>

A estrutura principal disponibilizada no repositório é organizada da seguinte forma:
```text
Calcular-Valor-de-animais-bovinos-e-suinos-com-padroes-de-projeto/
│
├── Lista 6/
│   └── Arquivos do projeto
│
└── README.md
```

A pasta Lista 6 concentra a implementação utilizada no desenvolvimento da aplicação.

<h2>🚀 Como utilizar</h2>
<h3>1. Clonar o repositório</h3>

git clone https://github.com/ThiagoDT/Calcular-Valor-de-animais-bovinos-e-suinos-com-padroes-de-projeto.git

<h3>2. Acessar o projeto</h3>
cd Calcular-Valor-de-animais-bovinos-e-suinos-com-padroes-de-projeto

<h3>3. Acessar a implementação</h3>

Entre na pasta:

Lista 6

<h3>4. Executar</h3>

Abra os arquivos do projeto no ambiente de desenvolvimento compatível com a implementação e execute o programa a partir do arquivo principal.

Observação: o README original do repositório não especifica a linguagem, IDE ou comando de execução. Por isso, essas informações não foram presumidas nesta documentação.

<h2>📌 Funcionalidades</h2>

O projeto tem como foco:

Funcionalidade	Descrição
🐄 Bovinos	Cálculo do valor de animais bovinos
🐖 Suínos	Cálculo do valor de animais suínos
⚖️ Peso	Utilização do peso do animal nos cálculos
💰 Valor por kg	Cálculo baseado no preço por quilograma
🪙 Valor por arroba	Cálculo baseado no preço da arroba
🧩 Design Patterns	Aplicação de padrões de projeto
🏗️ Orientação a Objetos	Organização do sistema utilizando conceitos de POO
<h2>🧠 Conceitos utilizados</h2>

O projeto permite exercitar conceitos importantes de Engenharia de Software e Programação Orientada a Objetos, como:
<ul>
  <li>Classes e objetos;</li>
  <li>Encapsulamento;</li>
  <li>Abstração;</li>
  <li>Herança;</li>
  <li>Polimorfismo;</li>
  <li>Separação de responsabilidades;</li>
  <li>Reutilização de código;</li>
  <li>Padrões de projeto;</li>
  <li>Organização e manutenção de software.</li>
</ul>

<h2>🔮 Possíveis melhorias</h2>
O projeto pode ser expandido futuramente com funcionalidades como:
<ul>
  <li>Cadastro de diferentes raças;</li>
  <li>Cadastro de vários animais;</li>
  <li>Histórico de valores;</li>
  <li>Atualização automática dos preços;</li>
  <li>Integração com fontes externas de preços;</li>
  <li>Interface gráfica;</li>
  <li>Interface web;</li>
  <li>Persistência dos dados em banco de dados;</li>
  <li>Relatórios de valores dos animais;</li>
  <li>Exportação dos resultados para PDF ou planilhas;</li>
  <li>Inclusão de outros animais, como ovinos e caprinos;</li>
  <li>Testes automatizados.</li>
</ul>
<h2>📚 Finalidade acadêmica</h2>

Este projeto pode ser utilizado como material de estudo para demonstrar como conceitos de Programação Orientada a Objetos e Padrões de Projeto podem ser aplicados em um problema prático relacionado ao setor agropecuário.

A utilização de um problema simples — calcular o valor de animais — permite concentrar o estudo na organização da solução e na aplicação dos conceitos de desenvolvimento de software.

<h2>👨‍💻 Autor</h2>

ThiagoDT

Projeto disponível no GitHub:

ThiagoDT/Calcular-Valor-de-animais-bovinos-e-suinos-com-padroes-de-projeto

<h2>📄 Licença</h2>

Não foi identificada uma licença de código aberto especificada no repositório. Caso o projeto seja distribuído publicamente, recomenda-se adicionar um arquivo LICENSE com a licença escolhida.

<h2>⭐ Contribuição</h2>

Sugestões de melhorias, correções e novas funcionalidades podem ser incorporadas ao projeto por meio de contribuições no repositório.

<h2>📖 Resumo</h2>

O Calcular Valor de Animais Bovinos e Suínos é uma aplicação voltada ao cálculo do valor de animais utilizando referências de quilo e arroba, desenvolvida com foco na aplicação de Programação Orientada a Objetos e Padrões de Projeto.

O projeto combina um problema prático da área pecuária com conceitos de desenvolvimento de software, servindo como exemplo de aplicação de técnicas de organização, reutilização e manutenção de código.
