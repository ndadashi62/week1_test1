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

    public static void main(String[] args) {

        int tie = 0;
        int userWin = 0;
        int opponentWin = 0;
        // 1: // get the user input  
        Scanner scanner = new Scanner(System.in);
        Random randomizer = new Random();
        System.out.println("Hello , welcome to this game, let's play\n");
        String playAgain = "n";
        do {
            System.out.println("how many round do you want to play?");
            int round = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < round; i++) {
                System.out.println("your choice:");
                String myMove = scanner.nextLine();
                //2://verify that my move is valid
                if (myMove != "rock" && myMove != "paper" && myMove != "scissors") {
//                System.out.println("your move is not valid !");
//            } else {
                    //3// randomly generate the opponents move(0,1,2)
                    int randomNumber = randomizer.nextInt(3);
                    System.out.println(randomNumber);
                    String opponentMove = "";
                    if (randomNumber == 0) {
                        opponentMove = "rock";
                    } else if (randomNumber == 1) {
                        opponentMove = "paper";
                    } else {
                        opponentMove = "scissor";
                    }
                    System.out.println("opnent move:" + opponentMove);

                    //4: //calculate if the user won , lost or tied 
                    if (myMove == opponentMove) {
                        tie++;
                    } else if (myMove == "rock" && opponentMove == "scissors"
                            || myMove == "scissors" && opponentMove == "paper"
                            || myMove == "paper" && opponentMove == "rock") {
                        userWin++;
                    } else {
                        opponentWin++;
                    }

                }
            }
            if (userWin > opponentWin) {
                System.out.println("you Won");
            } else if (opponentWin > userWin) {
                System.out.println("you Lost");
            } else {
                System.out.println("Tie");
            }
            
            System.out.println("play again(y/n):");
            playAgain = scanner.nextLine();
            
        } while (playAgain == "y");
        
    }

}
