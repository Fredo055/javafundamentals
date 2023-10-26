package com.fundamentals.lessons;

/* All about Strings */
public class Lesson4 {

    // Field
    String myString = "This is a string of characters.";

    // Assign a new reference to the same string
    String secondString = myString;

    public void demoStrings() {
        // Concatenation is the joining of strings
        myString = myString + "that is joined by this string.";
        System.out.println(myString);
        System.out.println(secondString);
    }

    /* CharAt returns a single character based on the specified index. */
    public void demoCharAt(String value) {
        System.out.println(value.charAt(2));
    } // end method

    /* concat joins two strings together and performs concatenation */
    public String demoConcat() {
        return myString.concat(" that is joined by this method");
    }// end method

    /* equals compares this string to a specified object. The result is eithier true or false. */
    public void demoEquals(String msg) {
        String world = "World";
        System.out.println(world.equals(msg));

    } // end method

    /* toLowerCase and toUpperCase will create a new string and change
     * all its characters. */
    public void demoCase() {
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        //end method
    }

    /*length will return the size of the string. This included empty spaces. */
    public int demoLength() {
        return myString.length();
    } // end method

    /* replace(from, to) will replace all instances of the value in the from with to. */
    public String demoReplace() {
        String food = "i like pizza as much as i like ice cream.";
        return food.replace("like", "love");
    } // end method


    /* Strings builder allows you to join objects or
     * primitives together into a variable type array or list.*/
    public void demoStringBuilder(String color, String food) {
        StringBuilder builder1 = new StringBuilder();
        builder1.append("My favorite food is ").append(food);


        StringBuilder builder2 = new StringBuilder();
        builder2.append("My favorite color is ").append(color);

        StringBuilder builder3 = new StringBuilder();
        builder3.append(builder1).append(" & ").append(builder2);


        /* we have to call the toString method on the builder instance
         * in order to change their values back to a string*/
        String structure = builder3.toString();
        System.out.println(structure);
    } // end method


    /* A char is a single character data type*/
    public void demoChar() {
        char letter = 'J';
        char unicodeValue = '\u00a9';
        System.out.println(letter);
        System.out.println(unicodeValue);
    } // end method


    /* Escape Sequences allow tp escape character that are
    *  used in code, or other situations */
    public String demoEscapeSequence() {
        return "Today\'s class is going over Strings.\tIt also " +
                "will\n cover char";
    }




} // end class




