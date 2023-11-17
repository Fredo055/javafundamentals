package com.fundamentals.labs;

public class LoopingLab {


    public void whileLoop() {
        int count = 0;
        do {
            if (count == 5) {
                System.out.println("Five");
            } else if (count == 10) {
                System.out.println("Ten");
            } else if (count == 15) {
                System.out.println("Fifteen");
            } else {
                System.out.println(count);
            }
            count++;
        } while (count <= 25);
        System.out.println();
    }

    public void forLoop(int count) {
        for (int i = 0; i < count; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
