package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Main caller = new Main();


    public static void main(String[] args) {
        caller.menu();
    }

    void menu(){
        System.out.println("Welcome to the RPS CLi Game");
        System.out.println("Make you choice and the computer will play against you");
        System.out.println("You will have to chose one of the following using numbers ");
        System.out.println("1. Rock");
        System.out.println("2. Scissors");
        System.out.println("3. Paper");

        System.out.println("Make a Choice 1/2/3");
    }





}