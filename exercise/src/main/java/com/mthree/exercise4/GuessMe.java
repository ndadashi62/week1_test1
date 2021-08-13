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
public class GuessMe {
    
    public static void main(String[] args) {
    
    int  myInteger= 11 ; 
    
    Scanner inputReader = new Scanner(System.in);
    
    System.out.println("please pick a number ");
    int userInteger= Integer.parseInt(inputReader.nextLine());
    
    if (userInteger==myInteger){
        System.out.println("Wow, nice guess! That was it! ");
    }
    
    if (userInteger<myInteger){
        System.out.println("Ha, nice try - too low! I chose 11.");
    }
    
     if (userInteger>myInteger){
        System.out.println("Too bad, way too high. I chose 11");
    }
    
    
    
    
    
    }
    
}
