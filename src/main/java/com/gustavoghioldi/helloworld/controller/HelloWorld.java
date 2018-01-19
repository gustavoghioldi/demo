package com.gustavoghioldi.helloworld.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorld {
	
    @RequestMapping(value = "/saludar/{nombre}", method = RequestMethod.GET)
    public @ResponseBody String saludar(@PathVariable("nombre") String nombre) {
        return "Hola mundo!!! " + nombre;
    }
 
}
