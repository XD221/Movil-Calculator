package com.example.calculadora.paquete_Calculadora;

import java.util.ArrayDeque;
import java.util.Deque;

public class CalculatorOperation {

    Deque<Double> stack;

    public CalculatorOperation(){
        stack = new ArrayDeque<Double>();
    }

    public void clear(){
        stack.clear();
    }

    public double calculate(double num, char character){
        Character letter = new Character(character);
        stack.add(num);
        Boolean first = true;
        if (stack.size() > 0){
            double result = 0;
            if(letter.equals('s')){
                for(double a : stack){
                    result += a;
                }
                stack.clear();
            }else if(letter.equals('r')){
                for(double a : stack){
                    if(first){
                        result = a;
                        first = false;
                    }else{
                        result -= a;
                    }
                }
                stack.clear();
            }else if(letter.equals('m')){
                for(double a : stack){
                    if(first){
                        result = a;
                        first = false;
                    }else{
                        result *= a;
                    }
                }
                stack.clear();
            }else if(letter.equals('d')){
                for(double a : stack){
                    if(first){
                        result = a;
                        first = false;
                    }else{
                        result = result / a;
                    }
                }
                stack.clear();
            }
            stack.add(result);
            return result;
        }
        return num;
    }
}