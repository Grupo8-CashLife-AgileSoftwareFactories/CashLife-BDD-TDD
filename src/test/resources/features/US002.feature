Feature: Registro de usuario

  @US002
  Scenario: Registro exitoso del joven independiente con credenciales validas
    Given el joven independiente "<tipo_usuario>" se encuentra en la sección de registro
    When el joven independiente "<tipo_usuario>" completa todos los campos correctamente con usuario "<user>" y contraseña "<pass>"
    Then el sistema almacenara los datos en la base de datos
    And mostrara el mensaje "Usted se registro correctamente"

  Scenario Outline: Registro exitoso del Jefe de Hogar con credenciales validas
    Given el Jefe de Hogar "<tipo_usuario>" se encuentra en la sección de registro
    When el Jefe de Hogar "<tipo_usuario>" rellene todos los datos correctamente con usuario "<user>" y contraseña "<pass>"
    Then el sistema almacenara los datos en la base de datos
    And mostrara el mensaje "Usted se registro correctamente"

    Examples:
      | tipo_usuario        | user   | pass     |
      | joven independiente | pablo  | pablo123 |
      | Jefe de Hogar       | pedro  | pedro123 |

