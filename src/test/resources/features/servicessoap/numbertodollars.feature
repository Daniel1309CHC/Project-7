Feature: Convertir un número en dolares
  Como usuario del sistema
  Quiero convertir un número en dolares
  Para obtener una representación textual del valor en dólares

  #autor: Daniel Chaparro Cano

  Background:
    Given que el usuario tiene acceso al servicio SOAP de conversión de números a palabras para dólares
  @soap
  @soapDolar
  Scenario: Convertir un número dolares exitosamente
    When el usuario envía una solicitud Post al servicio SOAP con el valor de 12345.67
    Then el código de respuesta de estado debería ser 200
    And en la respuesta debería contener "twelve thousand three hundred and forty five dollars and sixty seven cents"