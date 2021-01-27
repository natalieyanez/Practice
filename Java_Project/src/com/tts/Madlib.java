package com.tts;


import java.util.Scanner;

//note that class names are always capitalized
public class Madlib {


    public static void main(String[] args) {

        //
        //1. Declare an integer variable "ageLimit" with a value of 19/
        //2. Then declare another variable "age" that we will use to store the user's age.
        //3. Finally, we'll need to ask the user to input their age.

        Scanner scanner = new Scanner(System.in);

        //in a statement, the left hand side is the declaration
        // the right hand side is the initialization

        //1.
        int ageLimit = 18;

        //2.
        int userAge;

        //3.
        System.out.println("Please input your age:");
        userAge = Integer.parseInt(scanner.nextLine());
        System.out.println(userAge);


        // If userAge is lesser than < ageLimit
        //then warn the user and stop the program
        //else continue the program
        if (userAge < ageLimit) {
            System.out.println("You are too young!");
            System.exit(0);
        } else {
            System.out.println("Access Granted!!");
        }

        scanner.close();

        System.out.println("Program running...");

    }

}

