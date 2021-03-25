package com.dia1.Calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("calc1")

public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}
        
        @GetMapping("/{num1}/{num2}")
        public String nums( 
                @PathVariable("num1") int num1, 
                @PathVariable("num2") int num2){
            return "Números: " + num1 + " " + num2;
        }
        
         @GetMapping()
        public String nums2( 
                @RequestParam ("num1") int num1, 
                @RequestParam ("num2") int num2){
            return "Números: " + num1 + " " + num2;
        }
}
