package com.fundamentals.labs;

public class NumbersLab {

    /* Example One */


    int myHexadecimal = 0x1D;
    int myBinary = 0b1_1101;
    int myOctal = 835;

    public void myExampleOne() {
        System.out.println(myHexadecimal);
        System.out.println(myBinary);
        System.out.println(myOctal);

    } //end method


    /* Example Two */

    byte myByte = 7;
    short myShort = 345;
    int myInt = 4444;

    public void myExampletwo() {
        int ExampleOne = (int) myByte;
        long ExampleTwo = (long) myShort;
        float ExampleThree = (float) myInt;
        System.out.println(ExampleOne);
        System.out.println(ExampleTwo);
        System.out.println(ExampleThree);

    } // end method


    /* ExampleThree */

    double myDouble = 70.99;
    float myFloat = 28.52f;
    long myLong = 8884L;


   public void ExampleThree() {
       long ExampleOne = (long) myDouble;
       int ExampleTwo = (int) myFloat;
       short ExampleThree = (short) myLong;
       System.out.println(ExampleOne);
       System.out.println(ExampleTwo);
       System.out.println(ExampleThree);

   } // end method
} // end class
