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
public class DoItBetter {
    public static void main(String[] args) {
 
    
    String name ;
    int languageNumber =0;
    
    
      
 Scanner inputReader = new Scanner(System.in);

    System.out.println("Hello there!");
    System.out.println("what is your name");
  name= inputReader.nextLine();
    System.out.println("hello "+ name +" .my name is Nasim");
     
 System.out.println("how many miles can you run ? ");
  int usermile=Integer.parseInt(inputReader.nextLine());
    int myNumbermile= usermile*2 +1 ;

  
  
  
  System.out.println(" wow ! but me I can run "+myNumbermile +" every day ");
  
  
  
 System.out.println(" how many hot dog can you eat every day?");
 int userHotdogNumber=Integer.parseInt(inputReader.nextLine());
 int myhotdogNumber=userHotdogNumber*2+1;
 System.out.println(" wow ! but me I can eat "+myhotdogNumber +"  hot dog every day ");
 
 

 System.out.println(" how may language you can speak?");  
 int userLanguageNumber= Integer.parseInt(inputReader.nextLine());
 int myLanguageNumber=userLanguageNumber*2+1;

  System.out.println(" wow ! but me I can talk "+myLanguageNumber+"  language number ");


    }
    
}
