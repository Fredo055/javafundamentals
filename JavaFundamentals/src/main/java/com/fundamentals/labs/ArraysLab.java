package com.fundamentals.labs;

public class ArraysLab {

    public void stringArray() {
        String[] iceCreamFlavor = new String[10];
        iceCreamFlavor[0] = "Butter pecan";
        iceCreamFlavor[1] = "Cookies and cream";
        iceCreamFlavor[2] = "Strawberry";
        iceCreamFlavor[3] = "Vanilla";
        iceCreamFlavor[4] = "Rocky road";
        iceCreamFlavor[5] = "Oreo";
        iceCreamFlavor[6] = "Mint chocolate chip";
        iceCreamFlavor[7] = "Cookie dough";
        iceCreamFlavor[8] = "Banana";
        iceCreamFlavor[9] = "Coconut";

        for (String s : iceCreamFlavor) {
            System.out.println(s);
        }
    }

    public void TwoDimensions() {
        int[][] myArray = {{26, 40}, {10, 28},
                {33, 28}, {30, 34}, {13, 19}, {24, 31},
                {6, 30}, {24, 31}, {26, 23}, {35, 32},
                {17, 24}, {40, 9}, {16, 23}, {23, 3},
                {3, 26}, {31, 21}};
        for (int i = 0; i < myArray.length; i++) {
            for (int k = 0; k < myArray[i].length; k++) {
                System.out.print("[" + i + "]" + "[" + k + "] = " +
                        myArray[i][k]);
            }}
    }}

