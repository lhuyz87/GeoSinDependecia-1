# cp01: Central de procuración
@tag
Feature: Central de procuración

  @AsignarProcurador
  Scenario Outline: Asignar procurador
    Given que accedo al sistema Geolocalización Procurador Rimac con usuario "<usuario>" y password "<password>"
    When realizo la busqueda de la placa "<placa>"  con atención en estado Solicitado
    And selecciona opción Asignar procurador
    And selecciono  de la lista el procurador "<procurador>"
    And selecciono opción Asignar
    Then la atención  seleccionada debe cambiar de estado "<estado>" a En camino

    ###DATOS###@DataPrueba|1@02-AsignarProcurador
    Examples: 
      |0|usuario|password|placa|procurador|estado|
      |1|clegall@gmail.com|Test2019#|ABA300|PROCURADOR AUTO1|En camino|
      |2|clegall@gmail.com|Test2019#|ABA301|PROCURADOR AUTO2|En camino|
      |3|clegall@gmail.com|Test2019#|ABA302|PROCURADOR AUTO3|En camino|
      |4|clegall@gmail.com|Test2019#|ABA303|PROCURADOR AUTO4|En camino|
      |5|clegall@gmail.com|Test2019#|ABA304|PROCURADOR AUTO5|En camino|
