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
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price of car: ");
        double price = sc.nextDouble();
        System.out.print("Down payment: ");
        double downPayment = sc.nextDouble();
        System.out.print("Intrest Rate in %: ");
        int interest = sc.nextInt();
        System.out.print("Loan duration in year: ");
        int year = sc.nextInt();
        double monthlyPayment = findMonthlyPayment(price, downPayment, interest, year);
        System.out.printf("Monthly Payment : %.2f\n", monthlyPayment);
        
        
    }
    
    public static double findMonthlyPayment(double price, double downPayment, int interest, int year){
        double monthlyPayment = (price - downPayment)*(1+ interest*year/100.0)/ (year*12);
        return monthlyPayment;
    }
    
}
