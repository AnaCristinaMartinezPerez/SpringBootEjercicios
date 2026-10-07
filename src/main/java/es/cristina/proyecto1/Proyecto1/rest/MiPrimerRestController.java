package es.cristina.proyecto1.Proyecto1.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Anotacion de la clase de java Controller para indicar a esta clase sera un controlador que
//maneja solicitudes web a la antigua con archivos html
//Recordatorio poner en el pom la dependencia del motor de plantilla adecuado con su version correspondiente
@Controller

public class MiPrimerRestController {


    //Anotación que define que el metodo saludo maneja las solicitudes get del siguiente endpoint en este
    //caso la ruta raíz y que va a devolver el mensaje Hola Spring Boot (endpoint es la ruta)
    //para comprobar que funciona, ejecutamos la clase y ponemos en el navegador localhost:8080, que es el puerto Tombcat
    @GetMapping("/")
    public String saludo(){
        //nombre del html
        return "index";
    }
}
