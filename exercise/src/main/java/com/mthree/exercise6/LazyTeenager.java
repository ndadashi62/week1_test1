/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.exercise6;
import java.util.Random;

/**
 *
 * @author nasim
 */
public class LazyTeenager {
    
     public static void main(String[] args) {
     
     
         Random rand =new Random();
         int chance;
         int timesTold=1;
          do {
                System.out.println("clean your room!"+timesTold+"x");
                  chance=rand.nextInt(100);
          if(chance<timesTold*10 ){
          System.out.println("fine I clean my room but I refuse to eat my peas!");
          break ; 
          
          
          }
          timesTold++;
                  if(timesTold>7)
                  {System.out.println("that's it .Iam doing it you are grounded and "
                          + "I am taking your job");
                 
                  break ; 
                  
                  
                  }
                  
     }while (true);
                 
              
         
}}   
         
         
     
     

