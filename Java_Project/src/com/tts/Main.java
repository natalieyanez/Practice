package com.tts;

// this is is a single comment line

/*
*
*
*
*
*
 */

//below is a class definition, or simply a class
//it is the blueprint for objects in java
// everything in java is in a class
//public is a
public class Main {



    //this variable is private! Other classes can't access it!
    //static means you can call this data directly from the class
    //this means you do not have to create an instance
    private static int myInt =4;

    // the syntax for variables is as follows
    //type variableName/Reference = value
    // these variables belong to the instances of the class
    public int myOtherInt = 5;
    public float myFloat;
    public double myDouble;
    public long myLong;
    public String myString;
    public boolean myBool;
    public char myChar;
    public byte myByte;


    //this is my main method
    //this servers as my "entry point"
    // my interpreter will look for this method to have access to my program
    // void means that this method does not return anything meaningful
    //  but does indeed return void as a "thing" that "thing just means nothing
    //void is a dedicated method to return nothing
    public static void main(String[] args) {


        // this variable does not have an access modifier(public/private)
        // this variable is already public due to it being inside of the main method
        //however, this is locally scoped so it only exist inside of the main methods
        // don't give access modifiers to local variables
        int y =5;



        //System,out,println() is referring to a function
        // these functions are going to be referred to as methods going forward
        //strictly speaking, methods are functions that live on functions
        // this method is similar to
        System.out.println("Hello World");

        // typing out will autocomplete a system out
        System.out.println(myInt);

        //below is a practice known as concatenation
        //it allows you to interpret
        System.out.println("here is the value of my Int " + myInt);



        //here we are creating an instance
        //Main() is calling the constructor which gives us a new instance
        Main myMain = new Main();
        System.out.println(myMain.myOtherInt);

        System.out.print("I am in a simply print method");
        System.out.print("I am in a simply print method\n");


        //this is similar
        // \n is
        // it allows you to be more expressive and neat with your print outs
        System.out.printf("I am in a formatted method\n");
        System.out.printf("I am in a formatted method " +
                "and here is the value of myInt:%d\n%d %d %d %d", myInt, 1, 2, 3, 4, 5);


        System.out.println(myMain.myOtherInt);
    }

}
