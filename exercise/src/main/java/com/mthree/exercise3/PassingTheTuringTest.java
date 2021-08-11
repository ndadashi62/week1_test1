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
public class PassingTheTuringTest {
    
    public static void main(String[] args) {

    String name;
    String color;
    String food ;
    int number = 11;
    int a =4;
    int b=3 ;
    int c=7;


    Scanner inputReader = new Scanner(System.in);

    System.out.println("Hello there!");
    System.out.println("what is your name");
  name= inputReader.nextLine();
    System.out.println("hello "+ name +" .my name is Nasim");

    System.out.println("what is your favaroite color");
    color = inputReader.nextLine();
    System.out.println("huh ! "+ color+" mine is pale pink");

    System.out.println("what is your favorite food ");
    food= inputReader.nextLine();
    System.out.println("cool I like  "+food+" too ,for me it is always fish");



    System.out.println("what is your favorite number ");
   Integer.parseInt( inputReader.nextLine()) ;
    System.out.println(" great. I think  my lucky number is 11");

    System.out.println("did you know "+a+"+"+b+"equal"+c);
    System.out.println("that is also a cool number ");
    System.out.println("well, thank you for talking "+ name+"!");



}
    
}
