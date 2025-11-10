/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double interest = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int month = sc.nextInt();
        double totalInterest = 0;
        double monthlyPayment = (principal * (interest /1200)) / (1 - Math.pow(1+(interest /1200), month *-1));
        System.out.printf("%-12s %-18s %-18s %-18s %-18s %-18s \n","Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest" );
        for(int i = 1;i <= month;i++){
            double principlePortion = monthlyPayment * Math.pow((1+(interest /1200)), -1 * (1+12-i));
            double interestDue = monthlyPayment - principlePortion;
            double remainingPrinciple = (interestDue / (interest /1200)) - principlePortion;
            totalInterest += interestDue;
            System.out.printf("%-12d %-18.2f %-18.2f %-18.2f %-18.2f %-18.2f \n",i, monthlyPayment, principlePortion, interestDue, remainingPrinciple, totalInterest );
        }
        
        
        
        
    }
    
}
