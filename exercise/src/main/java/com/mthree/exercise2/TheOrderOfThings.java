/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.exercise2;

/**
 *
 * @author nasim
 */
public class TheOrderOfThings {
    public static void main(String[] args) {

        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        
        
        //Technically they can all make sense, but sometimes there's a certain 
        //order that sounds better to the ears
        
        // I have changed the originall format like below 
        
        System.out.println(number + " " + opinion + " " + origin + " " + age + " " + shape
                 + " " + color + " " + size + " " + material + " " + noun + " " + purpose);
    }
}
