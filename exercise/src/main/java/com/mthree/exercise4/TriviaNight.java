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
public class TriviaNight {
    
      public static void main(String[] args) {
          
          
       Scanner inputReader = new Scanner(System.in);
          System.out.println("It's TRIVIA NIGHT! Are you ready?!");
          
          System.out.println("FIRST QUESTION!"); 
      
          System.out.println(" What is the Lowest Level Programming Language?\n1) Source Code\n2) Assembly Language \n3) c# \n4)Machine Code");
          
           int userFirstAnswer= Integer.parseInt(inputReader.nextLine());
           
           
         System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?\n1) Grace Hopper\n2) Alan Turing\n3) Charles Babbage\n4) Larry Page");
            int userSecondAnswer= Integer.parseInt(inputReader.nextLine());
               
               
               
            
            
           System.out.println("THIRD QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n2) The Battlestar Galactica\n\n3) The USS Enterprise\n4) The Millennium Falcon");
            int UserThirdAnswer= Integer.parseInt(inputReader.nextLine());
           
           
           
           if (userFirstAnswer==4 && userSecondAnswer==2 && UserThirdAnswer==3 ){
               
              System.out.println(" wow great you have 3 correct answers!"); 
               
          
           }
           else {
           System.out.println(" Oops! you have got the wrong answer"); 
           }
           
       
          
          
          
          

      
      
      
      }
      
    
    
}
