package com.example.rockpaperscissors;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Random Rand = new Random();
        int computerScore = 0;
        int userScore = 0;
        int counter = 0;

        System.out.println("Hello, Are you ready to play Rock Paper Scissors? ");
        System.out.println("Let the game begin!! ");
        System.out.println("Enter Username ");
        String username = Scan.nextLine();

        while (counter == 0) {
            int computerChoice = 1 + Rand.nextInt(3);

            System.out.println("Press 1 for Rock ");
            System.out.println("Press 2 for Paper ");
            System.out.println("Press 3 for Scissors");

            int userChoice = Scan.nextInt();

            if (userChoice == computerChoice) {
                System.out.println("Deuce! No points given ");

            } else if (userChoice == 1) {
                if (computerChoice == 3) {
                    System.out.println("You chose Rock ");
                    System.out.println("Computer chose Scissors ");
                    System.out.println("You win " + username + " 1 point to you ");
                    userScore++;
                    System.out.println(username + ": " + userScore);
                    System.out.println("Computer: " + computerScore);

                } else if (computerChoice == 2) {
                    System.out.println("You chose Rock ");
                    System.out.println("Computer chose Paper ");
                    System.out.println("You lost " + username + " Better luck next time ");
                    computerScore++;
                    System.out.println(username + ": " + userScore);
                    System.out.println("Computer: " + computerScore);
                }

            }
            else if (userChoice == 2) {
                if (computerChoice == 1) {
                    System.out.println("You chose Paper ");
                    System.out.println("Computer chose Rock ");
                    System.out.println("You won " + username + " 1 point to you ");
                    userScore++;
                    System.out.println(username + ": " + userScore);
                    System.out.println("Computer: " + computerScore);

                } else if (computerChoice == 3) {
                    System.out.println("You chose Paper ");
                    System.out.println("Computer chose Scissors ");
                    System.out.println("You lost " + username + " Better luck next time ");
                    computerScore++;
                    System.out.println(username + ": " + userScore);
                    System.out.println("Computer: " + computerScore);

                }

            }
            else if (userChoice == 3){
                if (computerChoice == 2) {
                    System.out.println("You chose Scissors ");
                    System.out.println("Computer chose Paper ");
                    System.out.println("You won " + username + " 1 point to you ");
                    userScore++;
                    System.out.println(username + ": " + userScore);
                    System.out.println("Computer: " + computerScore);

                } else if (computerChoice == 1) {
                    System.out.println("You chose Scissors ");
                    System.out.println("Computer chose Rock ");
                    System.out.println("You lost " + username + " Better luck next time ");
                    computerScore++;
                    System.out.println(username + ": " + userScore);
                    System.out.println("Computer: " + computerScore);
                }
                }


                if (userScore == 5) {
                    System.out.println("YOU ARE THE ULTIMATE WINNER OF THIS GAME!! ");
                    System.out.println("CONGRATULATIONS!!!");
                    counter++;

                }
                if (computerScore == 5) {
                    System.out.println("Unfortunately you lost this game ");
                    System.out.println("Next match is yours for the win");
                    counter++;
                }

            }
        }

    }

