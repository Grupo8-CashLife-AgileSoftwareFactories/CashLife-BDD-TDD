Feature: Gestión de planes financieros

  Scenario Outline: Crear un plan financiero exitoso
    Given el usuario ha accedido a la sección de planes
    When el usuario crea un nuevo plan financiero con los datos "<nombre_plan>", "<monto_objetivo>" y "<fecha_limite>"
    Then el sistema crea el plan con un ID único y muestra un mensaje de éxito

    Examples:
      | nombre_plan          | monto_objetivo     | fecha_limite |
      | Ahorro Universitario | 5000               | 2025-12-31   |
      | Viaje Familiar       | 3000               | 2024-08-15   |

  Scenario Outline: Ver detalle de un plan financiero
    Given el usuario tiene un plan financiero previamente creado con el ID "<id_plan>"
    When el usuario selecciona el plan con ID "<id_plan>"
    Then el sistema debe mostrar los detalles del plan seleccionado

    Examples:
      | id_plan |
      | 01      |
      | 02      |

  Scenario Outline: Error al crear un plan financiero con datos inválidos
    Given el usuario se encuentra en la sección de crear plan
    When el usuario intenta crear un plan con datos incompletos: "<nombre_plan>", "<monto_objetivo>", "<fecha_limite>"
    Then el sistema debe retornar un error indicando los campos faltantes o incorrectos

    Examples:
      | nombre_plan     | monto_objetivo | fecha_limite |
      |                 | 4000           | 2025-12-31   |
      | Fondo de retiro |                | 2024-09-30   |
      | Emergencias     | 2000           |              |
