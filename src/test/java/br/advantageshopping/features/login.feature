#encoding: utf-8
Feature: Realizar login com sucesso e adicionar produtos ao carrinho
  Eu como cliente
  Quero logar no site Advantage Online Shopping
  para adicionar produtos ao carrinho
  e fazer logout

  Scenario: Realizar login com sucesso e adicionar produtos ao carrinho
    Given Navego para a pagina inical do site Advantage
    And seleciono usuario
    And digito meu usuario 
    And digito minha senha 
    And clico em logar
    And seleciono a categoria tablets
    And seleciono o primeiro tablet
    And adiciono tablet ao carrinho
    And seleciono o usuario atual
    When realizo logout
    Then valido a mensagem final

