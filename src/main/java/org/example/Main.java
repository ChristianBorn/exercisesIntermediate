package org.example;

public class Main {
    public static void main(String[] args) {
        printNumbers();

        }
    

    public static String translateInteger(int number) {
        String[] writtenNumbers = new String[]{"eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};
        return writtenNumbers[number - 1];
    }
    public static void printNumbers() {
        for (int i=1; i<=100; i++) {
            String output = String.valueOf(i);
            if (i % 3 == 0) {
                output = "#"+i;
            } else if (i % 5 == 0) {
                output = "$"+i;
            }
            System.out.println(output);
        }
    }
    public static String reverseString(String stringToReverse) {
        return new StringBuilder(stringToReverse).reverse().toString();
    }
    public static String[] splitByColon(String stringToSplit) {
        return stringToSplit.split(",");
    }
}