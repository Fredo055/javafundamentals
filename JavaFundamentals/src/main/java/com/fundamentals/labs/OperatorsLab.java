package com.fundamentals.labs;

import java.util.Scanner;

public class OperatorsLab {

    public void demo1 () {
        double total = (10 + 32) * 12/3;
        int two = 10 + 32 * 12/3;
        System.out.println(two);
        System.out.println(total);
    } // end of method

    public void demoTwo(int bob, int bravo) {
        bob += bravo;
        System.out.println("= operator" + bob);
        bob *= bravo;
        System.out.println("*= operator" + bob);
        bob %= bravo;
        System.out.println("%= operator" + bob);
    } // end of method


    public void Scanner() {
        int localVarible = 5, num1, total;
        System.out.println("Enter integers");
        Scanner userInput = new Scanner(System.in);
        num1 = userInput.nextInt();
        total = num1 % localVarible;
        total = num1 % localVarible;
        System.out.println(" User value % " + total);


    }  // end method



}
