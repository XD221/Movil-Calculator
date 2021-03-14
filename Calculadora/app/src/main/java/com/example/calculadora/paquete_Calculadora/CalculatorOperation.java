package com.example.calculadora.paquete_Calculadora;

public class CalculatorOperation {
    public double suma(double valor1, double valor2){
        return valor1 + valor2;
    }

    public double resta(double valor1, double valor2){
        return valor1 - valor2;
    }

    public double multi(double valor1, double valor2){
        return valor1 * valor2;
    }

    public double division(double valor1, double valor2){
        if(valor1 != 0){
            return (valor1 / valor2);
        }else{
            return 0;
        }
    }
}