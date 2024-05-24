Feature: Convertir un número en palabras
  Como usuario del sistema
  Quiero convertir un número en palabras
  Para obtener una representación textual del número

  #autor: Daniel Chaparro Cano

  Background:
    Given que el usuario tiene acceso al servicio SOAP de conversión de números a palabras
  @soap
  @soaptest
  Scenario: Convertir un número en palabras exitosamente
    When el usuario envía una solicitud post al servicio SOAP con el número 57829
    Then el código de respuesta de estado debería ser 200
    And en la respuesta deberia contener "fifty seven thousand eight hundred and twenty nine "

  @soap
  @soaptestMinus
  Scenario: Convertir un número en palabras con número negativo
    When el usuario envía una solicitud post al servicio SOAP con el número -1234
    Then el código de respuesta de estado debería ser 200
    And en la respuesta deberia contener "number too large"
