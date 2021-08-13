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
public class KnockKnock {
    //Knock Knock! Guess who!! Marty McFly
//Hey! That's right! I'm back!
//.... from the Future.
    
    public static void main(String[] args) {
         
        System.out.println("Knock Knock! Guess who!! ");
        Scanner inputReader = new Scanner(System.in);
        String nameGuess = inputReader.nextLine();
        if(nameGuess.equals("nasim")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
    
}
