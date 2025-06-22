Feature: Visualización de reportes de inflación anual

  Scenario Outline: Ver reporte de inflación anual
    Given el usuario está en la sección de "Reporte de inflación"
    When el usuario selecciona "Ver reporte anual" para el año <año>
    Then el sistema mostrará el gráfico de inflación anual con los datos correspondientes

    Examples:
      | año  |
      | 2022 |
      | 2023 |
      | 2024 |

  Scenario Outline: Comparar inflación con años anteriores
    Given el usuario está en la sección de "Reporte de inflación"
    When el usuario selecciona la opción "Comparar con años anteriores" para el año <año_actual>
    Then el sistema mostrará una comparación visual de la inflación actual con los años anteriores

    Examples:
      | año_actual |
      | 2023       |
      | 2024       |
