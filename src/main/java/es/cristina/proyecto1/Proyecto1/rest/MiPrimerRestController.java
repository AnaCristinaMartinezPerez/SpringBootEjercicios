package es.cristina.proyecto1.Proyecto1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotacion de la clase de java RestController que indica que esta clase (MiPrimerRestController) será un controlador que
//maneja solicitudes web
@RestController
public class MiPrimerRestController {


    //Anotación que define que el metodo saludo maneja las solicitudes get del siguiente endpoint en este
    //caso la ruta raíz y que va a devolver el mensaje Hola Spring Boot (endpoint es la ruta)
    //para comprobar que funciona, ejecutamos la clase y ponemos en el navegador localhost:8080, que es el puerto Tombcat
    @GetMapping("/")
    public String saludo(){
        return "Hola Spring Boot";
    }
}
