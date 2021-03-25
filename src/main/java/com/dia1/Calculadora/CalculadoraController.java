package com.dia1.Calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")

public class CalculadoraController {
    
    	public static void main(String[] args) {
		SpringApplication.run(CalculadoraController.class, args);
	}

    @GetMapping("/suma")
    public String suma(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2){
        int result = num1 + num2; //Creo variable de resultado de la suma, para evitar un error
        return String.format("El resultado de %s + %s es igual a %s" ,Integer.toString(num1) ,Integer.toString(num2),Integer.toString(result));

    }
    
    @GetMapping("/resta")
    public String resta(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2){
        return String.format("El resultado de %s - %s es igual a %s" ,Integer.toString(num1), Integer.toString(num2), Integer.toString(num1 - num2));
    }
    
    @GetMapping("/multiplicacion")
    public String multiplicacion(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2){
        return String.format("El resultado de %s * %s es igual a %s" ,Integer.toString(num1), Integer.toString(num2), Integer.toString(num1 * num2));
    }
    
    @GetMapping("/division")
    public String division(
            @RequestParam("num1") float num1,
            @RequestParam("num2") float num2){
        return String.format("El resultado de %s - %s es igual a %s" ,Float.toString(num1), Float.toString(num2), Float.toString(num1 - num2));
    }
}