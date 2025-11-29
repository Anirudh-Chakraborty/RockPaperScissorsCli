package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Main caller = new Main();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the RPS CLi Game");
        System.out.println("Make you choice and the computer will play against you");

        boolean gameLife = true;
        //the users choice
        while (gameLife) {
            caller.menu();
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    caller.game(choice);
                } else if (choice == 4) {
                    System.out.println("Quitting game");
                    gameLife = false;
                } else {
                    System.out.println("Chose one of the above numbers");
                }
            } else {
                System.out.println("Chose one of the above numbers");
                sc.next();
            }
        }
    }

    void menu() {
        System.out.println();
        System.out.println("Make a Choice 1/2/3 to play");
        System.out.println();
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paper");
        System.out.println();
        System.out.println("4. Quit");

    }

    void game(int choice) {

        // computer making choices
        Random rand = new Random();
        int computerChoice = rand.nextInt(3) + 1;

        System.out.println();
        switch (choice) {

            case 1:
                System.out.println("You Chose Rock");
                break;

            case 2:
                System.out.println("You Chose Scissors");
                break;

            case 3:
                System.out.println("You Chose Paper");
                break;

        }
        switch (computerChoice) {

            case 1:
                System.out.println("Computer Chose Rock");
                break;

            case 2:
                System.out.println("Computer Chose Scissors");
                break;

            case 3:
                System.out.println("Computer Chose Paper");
                break;

        }
        caller.play(choice, computerChoice);

    }

    void play(int choice, int computerChoice) {
        //1 --> Rock
        //2 --> Scissors
        //3 --> Paper

        //CompScore Card
        int computerScore = 0;


        // 1 beat 2
        // 2 beat 3
        // 3 beat one
        if ((computerChoice == 1 && choice == 2) // rock and scissors
                || (computerChoice == 2 && choice == 3) // scissors and paper
                || (computerChoice == 3 && choice == 1) // paper and rock
        ) {
            System.out.println("***----Computer wins----***");
            caller.compScroe(computerScore);
        } else if (choice == computerChoice) {
            System.out.println("Its a Draw");
        } else {
            System.out.println("----***Congo You won***----");
        }
    }

    int compScroe(int computerScore) {

        System.out.println();
    return 5;
    }

}
