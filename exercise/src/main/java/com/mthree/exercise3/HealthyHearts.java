/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.exercise3;
import java.util.Scanner;

/**
 *
 * @author nasim
 */
public class HealthyHearts {
    
    public static void main (String[] arg){
    
        //asks the user for their age and then uses this value to 
        //calculate and display the healthy heart rate range 
        //they should use for exercising.
 //The maximum heart rate should be 220 - their age.
//  The target heart rate zone is 50 - 85% of the maximum.
int age = 0 ; 
int maxHeartrate= 220; 
int targetHeartRate=85*maxHeartrate/100;
int userheartRate=220-age ;

        Scanner inputReader = new Scanner(System.in);

    System.out.println("Hello there!");
    System.out.println("what is your age");
  Integer.parseInt(inputReader.nextLine());
  
    System.out.println("your heart rate is "+userheartRate+"  and max of healthy heart rate is "+maxHeartrate);
     




    }
    
    
    
}
