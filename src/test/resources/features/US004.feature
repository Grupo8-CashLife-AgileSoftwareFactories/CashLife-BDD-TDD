Feature: Notificación de gastos

  Scenario Outline: Recibir notificación cuando los gastos superan el umbral
    Given el usuario ha configurado un umbral de gastos de <umbral> en su perfil
    When el usuario realiza una transacción de <monto_transaccion> que supera ese umbral
    Then el sistema enviará una notificación indicando "Tus gastos han superado el límite"

    Examples:
      | umbral | monto_transaccion |
      | 500    | 600               |
      | 1000   | 1200              |


