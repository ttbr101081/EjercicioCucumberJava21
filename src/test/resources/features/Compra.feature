Feature: E2E


  @E2E
  Scenario: Compra
    Given Agregar dos productos al carrito "https://opencart.abstracta.us/index.php?route=common/home"
    When Visualizar el carrito "Use Gift Certificate  (0.00kg)"
    And Completar el Checkout como invitado Guest Checkout
    Then Finalizar la compra hasta la confirmación "Your order has been successfully processed!"