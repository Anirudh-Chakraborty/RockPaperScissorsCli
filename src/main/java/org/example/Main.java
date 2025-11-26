package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Main caller = new Main();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        caller.menu();

        boolean gameLife = true;
        //the users choice
        while (gameLife) {
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

    void menu(){
        System.out.println("Welcome to the RPS CLi Game");
        System.out.println("Make you choice and the computer will play against you");
        System.out.println("You will have to chose one of the following using numbers ");
        System.out.println();
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paper");
        System.out.println();
        System.out.println("4. Quit");

        System.out.println("Make a Choice 1/2/3");
    }

    void game(int choice){

        Random rand = new Random();
        int computerChoice = rand.nextInt(3)+1;
        System.out.println("The Computer Chose:");
        switch (computerChoice){
            case 1:
                System.out.println("Rock");
                break;
            case 2:
                System.out.println("Scissors");
                break;
            case 3:
                System.out.println("Paper");
                break;
        }



    }




}