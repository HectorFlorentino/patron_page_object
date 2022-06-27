Feature: crear usuario en aplicacion Orange
  como usuario desde ingresar a Orange y crear un usuario

  Scenario: crear usuario exitoso

    Given que me encuentro en orange
    When ingreso credenciales usuario "Admin" y clave "admin123"
    And agregar los datos de empleado
      | firstName | lastName | photograph | nameLogin | passlogin |
      | hector    | lopez    | avatar.jpg | hector123 | admin123  |
    Then valido que el empleado se ha creado en forma correcta