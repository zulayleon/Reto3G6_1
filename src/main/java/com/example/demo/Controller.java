/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lilia María Plaza
 */
@RestController
@RequestMapping("/saludar")

public class Controller {
  
     @GetMapping("/hola")
    public String saludar(){
       return "<h1>Hola Mundo G6</h1>";
       
    }           
}

