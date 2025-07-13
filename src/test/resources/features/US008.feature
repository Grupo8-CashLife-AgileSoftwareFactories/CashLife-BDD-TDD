Feature: Reporte de inflación personalizado

  Scenario Outline: Ver el reporte de inflación personalizado para el usuario

    Given el usuario tiene un perfil activo y ha registrado sus gastos durante el año "<año>"
    When el usuario accede a su reporte de inflación
    Then el sistema muestra un gráfico del impacto de la inflación en su capacidad de ahorro

    Examples:
      | año  |
      | 2023 |
      | 2024 |

  Scenario Outline: Comparar la inflación personal con el promedio nacional

    Given el usuario tiene su reporte de inflación actualizado para el año "<año>"
    When el usuario selecciona la opción de comparar su inflación con la nacional
    Then el sistema muestra una comparación gráfica entre su inflación personal y la inflación promedio nacional

    Examples:
      | año  |
      | 2023 |
      | 2024 |

  Scenario Outline: Error al obtener el reporte de inflación del usuario

    Given el usuario tiene un ID válido "<id_usuario>" pero no tiene datos registrados de inflación
    When el sistema intenta obtener el reporte de inflación
    Then el sistema debe retornar un error indicando que no se tiene información suficiente

    Examples:
      | id_usuario |
      | U001       |
      | U099       |

