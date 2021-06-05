package ex01.Challenge1;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami
 */

//challenge 1: Write a version of the program that displays different greetings for different people.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                System.out.print("What is your name? ");
                String name = input.nextLine();
                System.out.print("What is your gender (F/M)? ");
                String gender = input.nextLine();

                if(gender.equals("M")) {
                    String name2 = "Hey Bro! " + name + ", nice to meet you!";
                    System.out.println(name2);
                } else {
                    String name2 = "Hey Girl! " + name + ", nice to meet you!";
                    System.out.println(name2);
                }

    }
}
