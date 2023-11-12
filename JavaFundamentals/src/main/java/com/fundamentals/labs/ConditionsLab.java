package com.fundamentals.labs;

public class ConditionsLab {


        public void demoExampleOne(String slim1, String slim2) {
        System.out.println("Before if / else");
        if(slim1.equals(slim2)) {
            System.out.println("Both slim1 and slim2 are equal. ");

        } else {
            System.out.println("Both slim1 and slim2 are not equal. ");
        }

    }

    public String demoTwo(char grade) {
        switch (grade) {
            case 'E':
                System.out.println("Excellent Grade");
            case 'V':
                System.out.println("Very Good Grade");
            case 'G':
                System.out.println("Good Grade");
            case 'A':
                System.out.println("Average Grade");
            case 'F':
                System.out.println("Failed Grade");

            default:
                return "Not a valid grade";
        }
    }

    }


