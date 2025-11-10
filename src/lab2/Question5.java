/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

import java.util.Random;

/**
 *
 * @author User
 */
public class Question5 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10000);
        String numInString = Integer.toString(num);
        int sum = 0;
        for(int i = 0;i < numInString.length();i++){
            sum += numInString.charAt(i) - '0';
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
