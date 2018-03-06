package test;

import app.Dictionary;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "helloooo";
        String letter = "";
        String userLetter = "";
        // Make a guessing game using the Dictionary Library. See Dictionary Tester for inspiration.

        // You can be inventive!

        do {
            word = Dictionary.getRandomWord();
            System.out.println(word);

        } while (word.length() > 6);

        System.out.println("select four letters");
        userLetter = scan.next();

        while userLetter = letter {
            System.out.println(userLetter + " is in word");
        }
    }
