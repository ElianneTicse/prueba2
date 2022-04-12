package com.example.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
/*Realiza una conexión de las vistas y los links*/
public class HomeController {
    /*Mapea hacia donde va la información*/
    @RequestMapping(value = {"/pat","/eli","/pati","tati"}) /*Enlazar varias rutas de html*/
    /*@ResponseBody solo necesario para retornar textos en htmls*/
    public String pgEli(){
        System.out.println("Esta es la pagina de Elianne");
        return "home"; /*cuando tenemos un html, solo poner el nombre del html en comillas*/
    }

    @RequestMapping(value = "/new1")
    @ResponseBody
    public String pgNew1(){
        System.out.println("new1 act!");
        return "Hola mundo";
    }

    @RequestMapping("")
    @ResponseBody
    public String welcome(){
        System.out.println("welcome");
        return "bienvenido";
    }


}
