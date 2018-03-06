package test;

import app.Dictionary;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "helloooo";
        String letter = "";
        String userLetter = "";
        String userword = "";
        int i = 0;
        // Make a guessing game using the Dictionary Library. See Dictionary Tester for inspiration.

        // You can be inventive!

        do {
            word = Dictionary.getRandomWord();

        }
        while (word.length() > 6); {
            System.out.println(word);
        }


        while (i < 6) {
            System.out.println("select a letter");
            userLetter = scan.next();

            if (userLetter.equals(letter)) {
                System.out.println(userLetter + " is in word");

            }i++;
        }


        System.out.println("Guess a word");
            userword = scan.next();

        if (userword.equals(word)) {
            System.out.println("you are right");
            }
        if (!(userword.equals(word))) {
            System.out.println("you are wrong, word is not " + userword);
            }

        }
    }
