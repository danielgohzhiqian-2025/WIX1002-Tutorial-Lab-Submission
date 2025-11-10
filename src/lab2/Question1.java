/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit");
        double fahrenheit = sc.nextDouble();
        System.out.println(convertToCelcius(fahrenheit));
    }
    
    public static double convertToCelcius(double fahrenheit){
        double celcius = (fahrenheit - 32)/1.8;
        double solution = Math.round(celcius * 100.0)/100.0;
        return solution;
    }
    
}
