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


        Scanner inputReader = new Scanner(System.in);

    System.out.println("Hello there!");
    System.out.println("what is your age");
  int age =Integer.parseInt(inputReader.nextLine());
  int maxHeartrate= 220-age; 
int targetHeartRate=50-85*maxHeartrate/100;

  
  
    System.out.println("your maximum heart rate should be  "+maxHeartrate+" per minute ");
     System.out.println("Your target HR Zone is "+targetHeartRate+"beats per minute.");

     




    }
    
    
    
}
