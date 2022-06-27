Feature: Login aplicativo ORANGEHRM
  como usuario deseo hacer el login

  Scenario: Login exitoso Orange

    Given que me encuentro en orange
    When ingreso credenciales usuario "Admin" y clave "admin123"
    Then valido el ingreso exitoso
