# Autor: Camilo
@stories
Feature: Automatizar la pagina de Amazon para reto tecnico en SQA


  @Scenario1

  Scenario: Seleccionar dos productos para agregarlos al carro de compras

    Given que me encuentro navegando por la pagina de Amazon para encontrar productos
    When encuentro dos productos los selecciono y los agrego al carro de compras
    Then debo validar en el carro de compras que los productos se encuentran agregados