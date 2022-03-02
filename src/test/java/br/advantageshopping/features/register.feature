#encoding: utf-8
Feature: Realizar cadastro com sucesso
  Eu como cliente
  Quero me cadastrar no site Advantage Online Shopping
  para realizar compras

  Scenario Outline: Realizar cadastro com sucesso
    Given Navego para a pagina inical do site Advantage
    And seleciono usuario
    And clico em criar nova conta
    And digito username 
    And digito email valido "<email>"
    And digito senha
    And confirmo senha
    And digito primeiro nome "<primeiroNome>"
    And digito ultimo nome "<ultimoNome>"
    And digito numero de telefone "<numeroTel>"
    And seleciono pais "<pais>"
    And digito cidade "<cidade>"
    And digito endereco "<endereco>"
    And digito estado "<estado>"
    And digito codigo postal "<codigoPostal>"
    And seleciono aceitar condicoes
    When clico em registrar
    Then valido mensagem final

    Examples: 
      | email       | senha  | primeiroNome  | ultimoNome | numeroTel     | pais   | cidade    | endereco        | estado    | codigoPostal |        
      | gab@test.com| Gab1234| Gabriel       | Soares     | 5511981630754 | Brazil | Sao Paulo | Rua Caramuru    | Sao Paulo |     08130310 |
