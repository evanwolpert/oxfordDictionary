package test;

import app.Dictionary;
                              // too much whitespace
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = "helloooo";
        String letter = "";
        String userLetter = "";
        String userword = "";
        int i = 0;
        // Make a guessing game using the Dictionary Library. See Dictionary Tester for inspiration..

        // You can be inventive!

        do {
            word = Dictionary.getRandomWord();

        }
        while (word.length() > 6);      // This gets a word less than 6 letters. Is that what you want?



        String[] letters= word.split("");


        while (i < 3) {
            System.out.println("select a letter");
            userLetter = scan.next();
            for (int x=0; x<letters.length-1;x++) {            // interesting use of for loop! You can also use contains()
                  if (userLetter.equals(letters[x])) {
                     System.out.println(userLetter + " is in word");
                  if (!userLetter.equals(letters[x])) {
                      System.out.println(userLetter + " is not in word");
                  }
                  }
              }
              i++;
        }

        System.out.println("Guess a word");
            userword = scan.next();                      // indenting

        if (userword.equals(word)) {
            System.out.println("you are right");
            }
        if (!(userword.equals(word))) {
            System.out.println("you are wrong, word is not " + userword + ", word is " + word);
            }

        }
    }
