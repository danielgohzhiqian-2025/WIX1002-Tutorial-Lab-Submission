/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another integer number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);
        
        int result;
        if(operand == '+'){
            result = num1 + num2;
            System.out.println(num1 +" "+ operand +" "+ num2 + " = "+ result);
        }else if(operand == '-'){
            result = num1 - num2;
            System.out.println(num1 +" "+ operand +" "+ num2 + " = "+ result);
        }else if(operand == '*'){
            result = num1 * num2;
            System.out.println(num1 +" "+ operand +" "+ num2 + " = "+ result);
        }else if(operand == '/'){
            result = num1 / num2;
            System.out.println(num1 +" "+ operand +" "+ num2 + " = "+ result);
        }else if(operand == '%'){
            result = num1 % num2;
            System.out.println(num1 +" "+ operand +" "+ num2 + " = "+ result);
        }else{
            System.out.println("Please enter the correct operand");
        }
        
    }
    
}
