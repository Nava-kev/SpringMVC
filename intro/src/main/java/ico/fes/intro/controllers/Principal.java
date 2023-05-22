package ico.fes.intro.controllers;

import ico.fes.intro.model.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Principal {
    @GetMapping("/inicio")
    public String getInicio(Model model){
        Empleados emp = new Empleados("Pedro","22 de Marzo de 2022",15,3456,"Ventas");
        model.addAttribute("empleado",emp);

     return "index";
    }
}
