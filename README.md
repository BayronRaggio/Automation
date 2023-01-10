# Automation
# QA Automation

 Se creó proyecto "Automation" con Java y Selenium.
 Para hacer uso de Selenium se añadió la dependencia Maven "selenium-java" en su última versión "4.7.2" en POM.xml
 La automatización es realizada en Navegador Chrome en su versión 108, por lo tanto, el ChromeDriver descargado y utilizado es también, la versión 108.
 Para este proyecto se usó el patron de diseño Page Object Model (POM).
 Dado que se utilizó el patrón de diseño mencionado, el directorio de archivos se organizó de la siguiente manera, se crearon dos packages, llamados pages y testCases
 Dentro del package pages se crearon dos clases Java, específicamente FormPage.java y WebTablePage.java, que representan las vistas de la aplicación web.
 Dentro de FormPage.java y WebTablePage.java creé los constructores respectivos, locators para asignar id de los elementos y métodos correspondientes para realizar acciones en el navegador, ya sea, hacer clic, escribir en campos de busqueda, etc.
 Dentro del package testCase se crearon las clases Java asociadas a los casos de prueba creados: AddUser_TC1.java, DeleteUser_TC5.java, EditUser_TC2.java, FilterUser_TC4.java.
 Dentro de cada clase asociada a los caso de prueba se cargó el chromeDriver, se crearon objetos de las clases pages y se llamaron a los métodos correspondientes para pasar los valores mencionados en los casos de prueba.

# Los casos de prueba automatizados fueron:
 CP-00-01 (Agregar)
 CP-00-02 (Editar)
 CP-00-04 (Filtrar)
 CP-00-05 (Eliminar)

 Las pruebas fueron ejecutadas directamente con el IDE Eclipse, la automatización se genera al hacer clic derecho en el caso de prueba y clic en Run As - Java Aplication
