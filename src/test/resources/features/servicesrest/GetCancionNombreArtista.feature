Feature: Get service Songs
  yo como usuario de la pagina web musixmatch
  quiero tener acceso a los servicios get
  para conseguir la informacion de mis canciones favoritas


  @infoSong @rest
  Scenario Outline: GET song information by name and artist
    Given the user is in the web page musixmatch in the track search module
    When sent a GET petition to the resource "track.search" with the song name and artist name
      | songName   | artistName   |
      | <songName> | <artistName> |
    Then it should obtain an answer code 200
    And it should be able to see the information of the first song found by the name <songName>
    Examples:
      | songName          | artistName        |
      | "Bad"             | "Michael Jackson" |
      | "Besos En Guerra" | "Morat"           |
      | "Tusa"            | "Karol G"         |


