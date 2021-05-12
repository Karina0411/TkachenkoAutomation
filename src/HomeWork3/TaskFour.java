package HomeWork3;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        //4. Написать программу, которая проверяет является ли строка палиндромом
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string ");
        String origString = in.nextLine();
        String reverseString = new StringBuilder(origString).reverse().toString();

        if (origString.equals(reverseString)) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}
