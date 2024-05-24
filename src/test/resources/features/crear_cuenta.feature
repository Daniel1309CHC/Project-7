Feature: Crear una cuenta en alpha

  yo como usuario de la página web de venta de alpha
  quiero crear una cuenta
  para poder realizar compras y disfrutar de los beneficios


@InicioDeSesion
  Scenario: El usuario crea una cuenta nueva exitosamente
    Given que el usuario está en la página de inicio de alpha
    When el usuario selecciona crear cuenta
    And el usuario ingresa datos de registro válidos
    Then el usuario debería ver un mensaje de confirmación