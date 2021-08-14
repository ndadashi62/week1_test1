package com.mthree.AssessmentWeek1;

import java.util.Scanner;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nasim
 */
public class DogGenetics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1: first we  ask the user for their dog name
        System.out.println("What is your dog's name?");
        String userInput = scanner.nextLine();

        //
        System.out.println("Well then, I have this highly reliable report on  " + userInput + " Esquire's prestigious background right here./n");

        // Sir Fluffy McFlufferkins Esquire is:
        System.out.println(userInput + " Esquire is:");

        //It should assign a random percentage to 5 dog breeds (that should add up to 100%!)
        int percentage = 100;
        Random randomizer = new Random();
        int randomDogType1 = randomizer.nextInt(percentage);
        percentage = percentage - randomDogType1;
               
        System.out.println(randomDogType1+"% GermsnShepered");
        
        

        int randomDogType2 = randomizer.nextInt(percentage);
        percentage = percentage - randomDogType2;
        System.out.println(randomDogType2+" % Boxer");

        int randomDogType3 = randomizer.nextInt(percentage);
          percentage = percentage - randomDogType3;
          System.out.println(randomDogType3+" % DobberMan");
        
        int randomDogType4 = randomizer.nextInt(percentage);
        percentage = percentage - randomDogType4;
        System.out.println(randomDogType4+" % Poodle");
        
        int randomDogType5 = randomizer.nextInt(percentage);
        System.out.println(randomDogType5+" % Maltipo");
        

        

      

        System.out.println("Wow, that's QUITE the dog!");

    }

}
