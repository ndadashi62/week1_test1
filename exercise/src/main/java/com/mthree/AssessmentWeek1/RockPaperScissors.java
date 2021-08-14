/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.AssessmentWeek1;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author nasim
 */
public class RockPaperScissors {
    
    public static void main (String[] args){
        
        
        
       // 1: // get the user input  
    Scanner scanner =new Scanner (System.in);
    Random randomizer = new Random();
    System.out.println("Hello , welcome to this game, let's play\nEnter your move\ntype in rock, paper or scissors ");
    String myMove= scanner.nextLine();
    
    
    
    
    //2://verify that my move is valid 
    if (myMove!="rock" && myMove!="paper" && myMove!="scissors"){
    System.out.println ("your move is not valid !");
    }
   
    else{
     //3// randomly generate the opponents move(0,1,2)
    for (int i=0; i<= 3; i++) {
    int randomNumber = randomizer.nextInt(3);
    System.out.println(randomNumber);
    String opponentMove= "";
    
    if ( randomNumber==0){
        opponentMove="rock"; 
    }
        
   else if ( randomNumber==1){
        opponentMove="paper"; 
    }
        
    else{
        opponentMove="scissor"; 
    }
    
    
    System.out.println("opnent move"+opponentMove);
    
   //4: //calculate if the user won , lost or tied 
    if (myMove==opponentMove){
    System.out.println("you tied !");
    }
    
    else if (myMove=="rock" && opponentMove=="scissors"   
            ||myMove== "scissors" && opponentMove=="paper"
            ||myMove== "paper" && opponentMove=="rock"
            )
    { System.out.println("you won !");
    }
            
            else {
                    System.out.println("you lost !") ;
                    }
               
            
            
            
            
           
        
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
    
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
  
    
    
    
    
    
}
