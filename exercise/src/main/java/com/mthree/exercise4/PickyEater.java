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
public class PickyEater {
    
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        
        
         System.out.println("what do you choose to eat for today ");
        String userChoose = userInput.nextLine();

        System.out.println("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(userInput.nextLine());

        System.out.println("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.nextLine();
       

        System.out.println("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.nextLine();

        System.out.println("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());

        System.out.println("Is it covered in chocolate? (y/n) ");
        String chocolatedCovered = userInput.nextLine();

        System.out.println("Does it have a funny name? (y/n) ");
        String funnyName = userInput.nextLine();

        System.out.println("Is it broccoli? (y/n) ");
        String isBroccoli = userInput.nextLine();
        
        
        
        
        
        if(userChoose==hasSpinach || userChoose==funnyName){
            System.out.println("\"There's no way he'll eat that!\"");
        }

        // Conditionals should go here! Here's the first one for FREE!

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");
            
        }
        
        if (timesFried>2 & timesFried<4){
            System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        }
        
       if (timesFried==2 & userChoose== cheeseCovered){
            System.out.println("Mmm. Yeah, he'll each fried cheesy doodles.\"");
        }
       
       
       
    }
    
}
