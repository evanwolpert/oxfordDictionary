package test;

import app.Dictionary;
public class PasswordMaker {

    public static void main(String[] args) {
        String combined = "hellooooooooooo";


        // Use the Dictionary library to create a secure password.

        // 1. Get 2 random words and put them together.


        do {
            // 1a. Make sure it is at least 8 characters long. If not, do it again.
            String word = Dictionary.getRandomWord();
            String Otherword = Dictionary.getRandomWord();
            combined = word + Otherword;


        } while (combined.length() > 8);    // This gets a combined word that has fewer than 8 chars. Can you think how to fix it?

        // 2. Replace the vowels with numbers following these rules:
        //    a becomes 4
        //    e becomes 3
        //    i becomes 1
        //    0 becomes 0
        //    u becomes 6
        combined = combined.replaceAll("a","4");
        combined = combined.replaceAll("e","3");
        combined = combined.replaceAll("i","1");
        combined = combined.replaceAll("0","o");
        combined = combined.replaceAll("u","6");

        // 3. Capitalize the first letter
        char firstletter = combined.charAt(0);
        String cap = String.valueOf(firstletter);
        String cap2 = cap.toUpperCase();
        combined = combined.replaceFirst(cap, cap2);

        System.out.println(combined);

        // BONUS 5. Ask the person if they want another one and make another one.
    }
}

