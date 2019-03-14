package com.uabc.edu.mx.demo;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CalendarController {
    private List<String> valores = new ArrayList<>();
    private List<Cita> cit= new ArrayList<>();

    @RequestMapping(path="/inicio")
        public String obtenerDatos() {
        return "inicio";

    }
    @PostMapping("/add")
        public String add (String asunto, String fecha, String hora, String doctores) {
        if(doctores.equals("doc1"))
            doctores = "Dr. Derek Shepherd";
        if(doctores.equals("doc2"))
            doctores= "Dra. Meredith Grey";
        if(doctores.equals("doc3"))
            doctores= "Dra. Cristina Yang";
        if(doctores.equals("doc4"))
            doctores="Dra. Callie Torres";
        Cita cita = new Cita();
        cita.setAsunto(asunto);
        cita.setDoctor(doctores);
        cita.setFecha(fecha);
        cita.setHora(hora);
        cit.add(cita);
        return "redirect:/inicio";

    }
    @RequestMapping(value = "/calendario")
        public String edo(Model model){
        model.addAttribute("citas",cit);

        String citasJSON = new Gson().toJson(cit);
        model.addAttribute("objetoJson", citasJSON);


        return "calendario";

        }






}
