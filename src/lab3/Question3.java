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
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sales volume: ");
        int sales = sc.nextInt();
        double totalCommition =0;
        if(sales <= 100 && sales >=0){
            totalCommition = sales * 5.0/100;
        }else if (sales <= 500 ){
            totalCommition = sales * 7.5/100;
        }else if (sales <= 1000 ){
            totalCommition = sales * 10.0/100;
        }else if (sales > 1000 ){
            totalCommition = sales * 12.5/100;
        }else{
            System.out.println("Enter a correct value");
        }
        System.out.printf("The total commition: %.2f\n", totalCommition);
    }
    
}
