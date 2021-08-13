/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.exercise4;
import java.util.Scanner;

/**
 *
 * @author nasim
 */
public class YourLifeInMovies {
     public static void main(String[] args) {
         Scanner inputReader = new Scanner(System.in);
         
         System.out.println("Hey, let's play a game! What's your name?");
        String userName=  (inputReader.nextLine());
      
        System.out.println("Ok,"+userName+", when were you born? 1980");
         int userBirthdate= Integer.parseInt(inputReader.nextLine());
         
        System.out.println("well "+userName+" ...");
        
        
       
        
        if (userBirthdate <2005){
         System.out.println("Did you know that Pixar's 'Up' came out over "
                 + "a decade ago?");
        }
        
         if (userBirthdate <1995){
         System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }

         
         if (userBirthdate <1985){
            System.out.println("Also, Space Jam came out not last decade but the one before THAT.");
        }
         
         
       if (userBirthdate <1975){
           System.out.println("the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
       if(userBirthdate <1965){
           
           System.out.println("the MASH TV series has been around for almost half a century!");
       }
       
       
         
        
        
        
        
        
        
        
        
     }
    
    
    
}
