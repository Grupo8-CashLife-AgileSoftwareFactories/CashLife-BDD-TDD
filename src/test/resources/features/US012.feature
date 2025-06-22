Feature: Enviar consultas a un asesor

  Scenario Outline: Enviar consulta a un asesor desde el formulario
    Given el usuario está en la sección de "Consultas con asesor"
    When el usuario ingresa su consulta "<mensaje>" en el campo "mensaje" y selecciona "Enviar"
    Then el sistema confirmará que la consulta fue recibida
    And mostrará el mensaje "Su consulta ha sido enviada con éxito"

    Examples:
      | mensaje                                                   |
      | Necesito ayuda para planificar mi presupuesto             |
      | ¿Podría explicarme cómo funciona el reporte de inflación? |

  Scenario Outline: Error al enviar consulta con campos vacíos
    Given el usuario está en la sección de "Consultas con asesor"
    When el usuario deja el campo "mensaje" vacío o ingresa "<mensaje>"
    Then el sistema mostrará el mensaje "Por favor, ingrese su consulta"

    Examples:
      | mensaje |
      |         |
      |         |
