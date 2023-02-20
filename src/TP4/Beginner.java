package TP4;

import java.util.Scanner;

public class Beginner {

    private static int factRec(int n){
        if(n == 1) return 1;
        else return n * factRec(n-1);
    }

    private static int fibonacciRec(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fibonacciRec(n-1) + fibonacciRec(n-2);
    }

    private static int puissanceNonTerminale(int x, int n){
        if(n == 0) return 1;
        else return x * puissanceNonTerminale(x, n-1);
    }

    private static int gcd(int a, int b){
        if(a == b) return a;
        else if(b > a) return gcd(a, b-a);
        else return gcd(a-b, b);
    }

    private static String DecToBinary(int nbr){
        if(nbr == 1) return "1";
        else if(nbr == 0) return "0";
        else return DecToBinary(nbr/2) + nbr%2;
    }

    private static int nbDigits(int n){
        if(n < 10) return 1;
        else return 1 + nbDigits(n/10);
    }

    private static int sumDigits(int n){
        if(n < 10) return n;
        else return n%10 + sumDigits(n/10);
    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();
    }
}
