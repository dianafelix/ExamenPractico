package com.uabc.edu.mx.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CalendarController {

    @RequestMapping(value="/inicio")
        public String obtenerDatos() {
        return "inicio";

    }
    @RequestMapping(value = "/calendario")
        public String edo(){
        return "calendario";

        }






}
