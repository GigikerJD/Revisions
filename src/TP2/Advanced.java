package TP2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Advanced {

    public static int charCount(String word){
        int count = 0;
        for(char c : word.toCharArray())
            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) count++;
        return count;
    }
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();

        switch (exercise){
            case 1:
                System.out.print("What is your word ? > ");
                String myWord = key.next();
                System.out.print("The word " + myWord + " has " + charCount(myWord) + " characters");
                break;

            default:
                System.err.println("Exercise number does not exist !!!");
        }
    }
}

