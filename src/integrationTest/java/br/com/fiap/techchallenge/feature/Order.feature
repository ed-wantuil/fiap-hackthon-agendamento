Feature: Tests Api Customer

  Background:
    * url applicationUrl
    Given path '/'

  Scenario: Testando a atualizacao do pagamento
    And path "agendamentos"
    And request {"id": "2d0c39b6-1dba-4825-a7c7-9e8378950832", "paymentStatus": "PAID"}
    And header Content-Type = 'application/json'
    When method POST
    Then status 404
