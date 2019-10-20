package com.company;

public class ArrayUtils {
    public static int max(int [] numbers) {
        int max = 0;
        for(int a=0; a<numbers.length; a++ ) {
            if(numbers[a]>max) {
                max = numbers[a];
            }
        }
        return max;
    }
    public static int min(int [] numbers) {
        int min = numbers[0];
        for(int b=0; b<numbers.length; b++ ) {
            if(numbers[b]<min) {
                min = numbers[b];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int[] myArray = {16, 71, 44, 2, 88};
        int minNumber = ArrayUtils.min(myArray);
        System.out.println("min number is " + minNumber);
        int maxNumber = ArrayUtils.max(myArray);
        System.out.println("max number is " + maxNumber);
    }
}