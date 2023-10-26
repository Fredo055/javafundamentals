package com.fundamentals;

import com.fundamentals.lessons.Lesson4;


public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello Java!");
        // houseExample();
        // houseReference();
        // basicStatements();
        lesson4Example();
    }


    public static void lesson4Example() {
        Lesson4 myLesson = new Lesson4();
        myLesson.demoStrings();
        myLesson.demoCharAt("Happy Day");
        String myJoin = myLesson.demoConcat();
        System.out.println(myJoin);
        myLesson.demoEquals("Somthing");
        myLesson.demoCase();
        System.out.println(myLesson.demoLength());
        System.out.println(myLesson.demoReplace());
        myLesson.demoStringBuilder("green", "Pasta");
        myLesson.demoChar();
        String myEscape = myLesson.demoEscapeSequence();
        System.out.println(myEscape);
    }




    // This is a single comment
    /*
    * This a multi-line comment
    * */



    public static void basicStatements() {
        System.out.println("This is my first sentence");
        System.out.println("I am new to Java");
        System.out.println("This Java Course is cool");
        System.out.println("I am learning stuff every day");
    }



    public static void houseExample() {
        House myHouse = new House();
        myHouse.foundationType = "Concrete";
        myHouse.doorColor = "Red";
        myHouse.roofStyle = "Shingle";
        myHouse.windowSize = 42;
        myHouse.doorFunction();
        System.out.println(myHouse.doorColor);
    }

        public static void houseReference() {
            House myHouse = new House();
            House otherHouse = new House();
            House yourHouse = otherHouse;

            myHouse.doorColor = "Red";
            otherHouse.doorColor = "Blue";
            System.out.println(myHouse.doorColor);
            System.out.println(otherHouse.doorColor);
            System.out.println(yourHouse.doorColor);
            yourHouse.doorColor = "Green";
            System.out.println(yourHouse.doorColor);
            System.out.println(otherHouse.doorColor);
        }
}