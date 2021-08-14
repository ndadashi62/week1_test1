/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mthree.AssessmentWeek1;

import java.util.Scanner;

/**
 *
 * @author nasim
 */
public class HealthyHearts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1: first we  ask the user for their dog name
        System.out.println("Hello there !");
        System.out.println("What is your age ?");

        int userAgeInput = Integer.parseInt(scanner.nextLine());

        int maxHeartrate = 220 - userAgeInput;
        int targetHeartRate = 50 - 85 * maxHeartrate / 100;

        System.out.println("your maximum heart rate should be  " + maxHeartrate + " per minute ");
        System.out.println("Your target HR Zone is " + targetHeartRate + "beats per minute.");

    }

}
