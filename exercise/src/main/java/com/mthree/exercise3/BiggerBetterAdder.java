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
public class BiggerBetterAdder {
    public static void main (String[] arg){
        
        
        
   String name ;
    int milesRun=0;
    int hotDogNumber=0; 
    int languageNumber =0;
    int myNumbermile= milesRun*2 +1 ;
    int myhotdogNumber= hotDogNumber*2+1;
    int mylanguageNumber= languageNumber*2+1;
    
     int numOne= 5 ;
    int numTwo=10 ; 
    int numThree=15;
    int sum=numOne+numTwo+numThree ; 
        System.out.println(numOne + " + "+ numTwo + " + "+ numThree +" = "+ sum ); 
    
    
      
 Scanner inputReader = new Scanner(System.in);

    System.out.println("Hello there!");
    System.out.println("what is your name");
  name= inputReader.nextLine();
    System.out.println("hello "+ name +" .my name is Nasim");
     
 System.out.println("how many miles"+milesRun+" can you run  ");
  Double.parseDouble(inputReader.nextLine());

  System.out.println(" wow ! but me I can run "+myNumbermile +" every day ");
  
  
  
 System.out.println(" how many hot dog "+hotDogNumber+" can you eat every day");
 Integer.parseInt(inputReader.nextLine());
 System.out.println(" wow ! but me I can eat "+myhotdogNumber +"  hot dog every day ");
 
 

 System.out.println(" how may "+languageNumber+"language you can speak");  
 Integer.parseInt(inputReader.nextLine());
  System.out.println(" wow ! but me I can talk "+mylanguageNumber+"  language number ");
        
    
    

    
    
    
    
    }
    
}
