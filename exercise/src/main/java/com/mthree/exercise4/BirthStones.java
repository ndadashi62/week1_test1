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
public class BirthStones {
      public static void main(String[] args) {
          
         
 
    
    Scanner inputReader = new Scanner(System.in);
    
    System.out.println("What month's birthstone do you want to know?");
   int userMonthNumber=Integer.parseInt( inputReader.nextLine());
    
   
   
   if (userMonthNumber <1 || userMonthNumber >12){
   
   System.out.println ("I think you must be confused, -1 doesn't match a month.");
   }
  
     if ( userMonthNumber ==1 ){
          System.out.println("january  birthstone is Garnet");
          
          }
      if ( userMonthNumber ==2 ){
          System.out.println("February  birthstone is Amethyst");
          
          }
      if ( userMonthNumber ==3 ){
          System.out.println("March  birthstone is Aquamarine");
          
          }
    
    
     if ( userMonthNumber ==4 ){
          System.out.println("April  birthstone is Diamond");
          
          }
     
     if ( userMonthNumber ==5 ){
          System.out.println("May  birthstone is Emerald");
          
          }
     
    if ( userMonthNumber ==6 ){
          System.out.println("June   birthstone is Pearl");
          
          }
    
    
    if ( userMonthNumber ==7 ){
          System.out.println("July   birthstone is Ruby");
          
          }
      if ( userMonthNumber ==8 ){
          System.out.println("August   birthstone is Peridot");
          
          }
      
       if ( userMonthNumber ==9 ){
          System.out.println("September   birthstone is Sapphire");
          
          }
       
         
       if ( userMonthNumber ==10 ){
          System.out.println("Ocrober   birthstone is Opal");
          
          }
       
       
         if ( userMonthNumber ==11){
          System.out.println("November   birthstone is  Topaz");
          
          }
         
          if ( userMonthNumber ==12){
          System.out.println("November   birthstone is Turquoise ");
          
          
    
    
   }
   
   
    
}



}
