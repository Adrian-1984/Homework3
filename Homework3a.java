package com.company;
public class Homework3a {

    public static void main(String[] args) {

        int[] myArray = new int[5];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        String comma = "";
        for (int i = myArray.length-1; i >= 0; i--) {
            System.out.print(comma + myArray[i]);
            comma = ",";
        }
    }

}
