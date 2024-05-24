Feature: Get service artistas
  yo como usuario de la pagina web musixmatch
  quiero tener acceso a los servicios get
  para conseguir la informacion de mis artistas favoritos

  #author : francisco rojas

  @infoArtist @rest
  Scenario Outline: GET artist information by name
    Given the user is in the web page musixmatch
    When sent a GET petition to the resource "artist.search" with the artist name <name>
    Then it should obtain a answer code 200
    And it should be able to see the information of the first artist found by the name <name>
    Examples:
      | name            |
      | "Morat"         |
      | "Harry Styles"  |
      | "Diomedes Díaz" |