Feature: Gestión de familias

  Scenario Outline: Crear una familia
    Given el usuario está en la sección de "familias"
    When el usuario crea una nueva familia con los datos "<nombre_familia>", "<miembros>" y "<jefe_hogar>"
    Then el sistema debe crear la familia con un ID único y mostrar un mensaje de éxito

    Examples:
      | nombre_familia | miembros             | jefe_hogar   |
      | Familia Pérez  | 4                    | Juan Pérez   |
      | Familia Torres | 3                    | Ana Torres   |

  Scenario Outline: Ver detalle de una familia
    Given el usuario ha creado previamente una familia con ID "<id_familia>"
    When el usuario selecciona una familia con ID "<id_familia>"
    Then el sistema debe mostrar los detalles de esa familia, incluyendo miembros y jefe de hogar

    Examples:
      | id_familia |
      | 01         |
      | 02         |

  Scenario Outline: Error al crear una familia con datos inválidos
    Given el usuario está en la sección de crear familia
    When el usuario intenta crear una familia con datos incompletos o inválidos: "<nombre_familia>", "<miembros>", "<jefe_hogar>"
    Then el sistema debe retornar un error indicando los campos faltantes o incorrectos

    Examples:
      | nombre_familia | miembros | jefe_hogar |
      | Familia López  |          | Mario López |
      |                | 5        | Laura Díaz  |
      | Familia Ríos   | 2        |             |
