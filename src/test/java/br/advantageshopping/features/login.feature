#encoding: utf-8
Feature: Realizar login com sucesso
  Eu como cliente
  Quero logar no site Advantage Online Shopping
  para realizar compras

  Scenario: Realizar login com sucesso
    Given Navego para a pagina inical do site Advantage
    And seleciono usuario
    And digito meu usuario 
    And digito minha senha 
    When clico em logar
    Then valido mensagem final

