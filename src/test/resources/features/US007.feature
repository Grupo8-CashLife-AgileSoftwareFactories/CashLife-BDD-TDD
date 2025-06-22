Feature: Acceso a contenido de educación financiera

  Scenario Outline: Acceder a contenido de educación financiera
    Given el usuario está en la sección de educación financiera
    When el usuario selecciona un tema educativo sobre "<tema>"
    Then el sistema debe mostrar el contenido del tema educativo seleccionado

    Examples:
      | tema                 |
      | presupuesto familiar |
      | educación de deudas  |
      | inversiones básicas  |

  Scenario Outline: Ver detalles de un tema específico de educación financiera
    Given el usuario está en la sección de educación financiera
    When el usuario selecciona el tema "<tema_detalle>"
    Then el sistema debe mostrar los detalles de ese tema

    Examples:
      | tema_detalle                  |
      | Cómo ahorrar para emergencias |
      | Estrategias de ahorro mensual |
      | Planificación de gastos       |

  Scenario Outline: Error al intentar acceder a un tema de educación financiera inexistente
    Given el usuario ha intentado acceder a un tema educativo con ID "<id_inexistente>"
    When el sistema no encuentra el ID
    Then el sistema debe retornar un error indicando que el tema no existe

    Examples:
      | id_inexistente |
      | 01             |
      | 99             |
      | 404            |