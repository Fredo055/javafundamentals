package com.fundamentals.labs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsLab {
    public void pizzaList() {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Margherita pizza");
        myList.add("BBQ Chicken Pizza");
        myList.add("Hawaiian pizza");
        myList.add("Veggie lover pizza");
        myList.add("Meat lovers pizza");
        myList.add("Chicago deep dish pizza");
        myList.add("California pizza");
        myList.add("Greek pizza");
        myList.add("Anchovy pizza");
        myList.add("Supreme Pizza");
        for (String pizzaList : myList) {
            System.out.println(pizzaList);
        }
    }

    public HashSet<Integer> exampleTwo(int count) {
        System.out.println("Example 2");

        HashSet<Integer> exampleTwoList = new HashSet<>();
        for (int i = 0; i < count; i++) {
            if (i % 5 == 0) {
                exampleTwoList.add(i);
            }

        }
        return exampleTwoList;
    }

    public void demoIsbnMap() {
        HashMap<Integer, String> bookList = new HashMap<>();
        bookList.put(743264746, "Einstein his life and the universe");
        bookList.put(316234494, "The 100");
        bookList.put(739432141, "Altered Carbon");
        bookList.put(1250773024, "Ender's Game");
        bookList.put(1616085460, "If the Allies had fallen");

        for (Map.Entry<Integer, String> ignored : bookList.entrySet()) {
            System.out.println(ignored.getKey() + " - " + ignored.getValue());
        }




    }



}
