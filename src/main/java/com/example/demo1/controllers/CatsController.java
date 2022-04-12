package com.example.demo1.controllers;

import com.example.demo1.entities.Gato;
import com.example.demo1.entities.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/cat1")
public class CatsController {

    //Si trabajamos con requestParam es necesario introducir las values ?id=5&name=Tati
    //Si queremos tener como opcional a un int, usar tipo Integer
    @RequestMapping(value = "/lista")
    public String listaGatos(@RequestParam("id") int idCat,
       /*Opcional*/          @RequestParam(name = "name", required = false) String nombreGato){
        System.out.println(nombreGato);
        System.out.println(idCat);
        return "listGatos";
    }
/*
    //Cuando usamos el PathVariable introducimos las values como ruta
    @RequestMapping(value = "/crear/{id}/{nameC}")
    public String crearGatos(@PathVariable("id") int id,
                             @PathVariable("nameC") String nombreGato){
        System.out.println(id);
        System.out.println(nombreGato);
        return "crearGatos";
    }
*/
    @RequestMapping(value = "/crear")
    public String crearGatos(){
        return "regGatos";
    }

    /*
    //Hacemos uso del metodo POST, al guardar o registrar un gatito
    //@RequestMapping(value="/register", method = RequestMethod.POST)
    @PostMapping(value="/register")
    public String registrarGato(@RequestParam("nombreGato") String nameC,
                                @RequestParam("dueñoGato") String ownerC,
                                @RequestParam("edadGato") int ageC){

        System.out.println("Nombre del Gato: " + nameC + "\n" +
                           "Duenio del Gato: " + ownerC + "\n" +
                           "Edad del Gato: " + ageC + "años");

        return "listGatos";
    }*/

    /*Usando databinding*/
    @PostMapping(value="/register")
    public String guardarGato(Gato gato){
        System.out.println("NombreGato: " + gato.getnGato() + "\n" +
                            "DueñoGato: " + gato.getnDuenio() + "\n" +
                            "EdadGato: " + gato.getEdadGato() + "\n" +
                            "RazaGato: " + gato.getRazaGato());
        return "listGatos";
    }



    @GetMapping("/mod")
    public String modelExample(Model model){
        model.addAttribute("msg","Hola amante de gatitos, este es un mensaje de bienvenida!!");
        model.addAttribute("nombre", "Mini");
        model.addAttribute("edad","15");
        return "listGatos";
    }
    /*
    @RequestMapping(value = "/elim")
    public String elimGatos(){
        return "elimGatos";
    }*/

    //Datos de un solo gatito
    @GetMapping("/gatito1")
    public String unGatito(Model model){
        Gato gato = new Gato("Luciana","Jose",1,"Cruzada");
        model.addAttribute(gato);
        return "gato1";
    }

    //Lista de Gatitos
    @GetMapping("/listaGatitos")
    public String listaGatitos(Model model){
        ArrayList<Gato> listaGatitos = new ArrayList<>();
        Gato gatito1 = new Gato("Tati","Eli",1,"Cruzada");
        Gato gatito2 = new Gato("Luciana","Jose",1,"Cruzada");
        Gato gatito3 = new Gato("Hannah","Jean",1,"Siamez");
        listaGatitos.add(gatito1);
        listaGatitos.add(gatito2);
        listaGatitos.add(gatito3);

        model.addAttribute("listaGatitos",listaGatitos);
        return "gatitos";
    }

    //ListaProdcComboBox
    @GetMapping("/listaProd")
    public String listaProductos(Model model, @RequestParam("zona") String zona){
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(101, "Ricocat"));
        listaProductos.add(new Producto(102, "Mimaskot Gatitos"));
        listaProductos.add(new Producto(103, "Whiskas"));
        listaProductos.add(new Producto(104, "Friskies"));
        model.addAttribute("listaProd",listaProductos);
        model.addAttribute("zona",zona);
        return "gatitos";

    }


}
