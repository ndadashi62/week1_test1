/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.exercise4;

/**
 *
 * @author nasim
 */
public class SpaceRustlers {
    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        // if else says if aliens is graeter that spaceship then print vroom vroom , otehr wise 
        //print thre arent enough...

        //if we remove the else part so we wont see the there are not enough /... message 
        
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        
       if(aliens >cows){
       System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!\" if the aliens outnumber the cows,");
            
       } 
       else {
           System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!"); 
       }
        
        
    }
    
    
}
