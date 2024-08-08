# language: es
# encoding : utf-8

Característica: como usuario de la pagina quiero navegar en ella para poder genear una orden de servicio

  @CompleteForm
  Esquema del escenario: Diligenciar formulario CURA Healthcare Service
    Dado quiero entrar a la pagina
    Y inicar sesion con el user "John Doe" y el password "ThisIsNotAPassword"
    Cuando llene los campos del formulario <facility><visitDate (Required)><comment>
    Entonces Validar que se guarde informacion

    Ejemplos:
      | facility                          | visitDate (Required) | comment        |
      | "Tokyo CURA Healthcare Center"    | "10"                 | "Mydate healt" |
      | "Hongkong CURA Healthcare Center" | "11"                 | "Mydate healt" |
      | "Seoul CURA Healthcare Center"    | "12"                 | "Mydate healt" |

