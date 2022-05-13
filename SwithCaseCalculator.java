/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sprintech.javafundamentals;

import java.util.Scanner;

/**
 *
 * @author Ayub
 */
public class SwithCaseCalculator {
    
     public static void main(String[] agrs){
    
        char operator;
        Double result;
        Double number1;
        Double number2;
        
        //create an object of Scanner class
        Scanner input = new Scanner(System.in);
        
        //Ask the user to Enter The First Number:
        System.out.println("Enter a Number: ");
        number1 = input.nextDouble();
        
        //Ask the user choose an Operator:
        System.out.println("Choose an Operator: +, -, *, or /: ");
        operator = input.next().charAt(0);
        
        //Ask the user Enter The First Number:
        System.out.println("Enter the Second Number: ");
        number2 = input.nextDouble();
        System.out.println();
    
        switch(operator){        
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
    }
    
    }
    
}
