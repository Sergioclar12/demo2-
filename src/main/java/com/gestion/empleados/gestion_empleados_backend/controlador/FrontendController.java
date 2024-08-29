package com.gestion.empleados.gestion_empleados_backend.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {

    @RequestMapping("/{path:[^\\.]*}")
    public String redirect() {
        // Redirige cualquier ruta no coincidente al archivo index.html de Angular
        return "forward:/index.html";
    }
}
