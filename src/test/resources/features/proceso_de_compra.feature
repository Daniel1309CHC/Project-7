# language: es
# Author: Katherin Oquendo

Característica: Realizar adiciones al carrito
  Como usuario de la página https://bikinisalpha.co
  Quiero agregar productos al carrito de compras
  Para poder realizar mi pedido

  Antecedentes:

  @test1
  Esquema del escenario: Realizar compra de Bikinis
    Dado que el usuario se encuentra en la página de Bikinis Alpha
    Y navega a la sección de "Colecciones"
    Cuando selecciona los bikini para mujer eligiendo la talla con la cantidad deseada
    Y agrega el producto al carrito confirmando la compra
    Y llena el formulario de entrega y pago con el correo electronico <correoElectronico> y el nombre <nombre>
    Entonces deberia visualizar un mensaje con la informacion de su orden
    Ejemplos:
      | correoElectronico | nombre   |
      | "lia@gmail.com"  | "Lia" |


