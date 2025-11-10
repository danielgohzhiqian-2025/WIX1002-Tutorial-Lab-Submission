/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in gram: ");
        double gram = sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initTemp = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = sc.nextDouble();
        double initTempCelcius = convertToCelcius(initTemp);
        double finalTempCelcius = convertToCelcius(finalTemp);
        double weightInKg = gram /1000;
        double energyInJoule = weightInKg *(finalTempCelcius - initTempCelcius) * 4184;
        System.out.println("The energy needed is " + energyInJoule);
    }
    
    public static double convertToCelcius(double fahrenheit){
        double celcius = (fahrenheit - 32)/1.8;
        double solution = Math.round(celcius * 100.0)/100.0;
        return solution;
    }
    
}
