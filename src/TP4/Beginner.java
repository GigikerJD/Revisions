package TP4;

import java.util.Scanner;

public class Beginner {

    public static int factRec(int n){
        if(n == 1) return 1;
        else return n * factRec(n-1);
    }

    public static int fibonacciRec(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else return fibonacciRec(n-1) + fibonacciRec(n-2);
    }

    public static int puissanceNonTerminale(int x, int n){
        if(n == 0) return 1;
        else return x * puissanceNonTerminale(x, n-1);
    }

    public static int gcd(int a, int b){
        if(a == b) return a;
        else if(b > a) return gcd(a, b-a);
        else return gcd(a-b, b);
    }

    public static String DecToBinary(int nbr){
        if(nbr == 1) return "1";
        else if(nbr == 0) return "0";
        else return DecToBinary(nbr/2) + nbr%2;
    }

    public static int nbDigits(int n){
        if(n < 10) return 1;
        else return 1 + nbDigits(n/10);
    }

    public static int sumDigits(int n){
        if(n < 10) return n;
        else return n%10 + sumDigits(n/10);
    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();
        String answer = "";

        while(true){
            switch (exercise){
                case 1:
                    System.out.print("Enter a random natural number > ");
                    int number = key.nextInt();
                    System.out.println("Factorial of " + number + " is " + factRec(number));
                    break;

                case 2:
                    System.out.print("Enter a random natural number > ");
                    number = key.nextInt();
                    System.out.println("Fibonacci's result of " + number + " is " + fibonacciRec(number));
                    break;

                case 3:
                    System.out.print("Enter a random integer > ");
                    int a = key.nextInt();
                    System.out.print("Enter a random power to raise > ");
                    int n = key.nextInt();
                    System.out.println(a + " raised to the power of " + n + " is " + puissanceNonTerminale(a, n));
                    break;

                case 4:
                    System.out.print("Enter 1st value > ");
                    int nb1 = key.nextInt();
                    System.out.print("Enter 2nd value > ");
                    int nb2 = key.nextInt();
                    System.out.println("GCD of " + nb1 + " and " + nb2 + " is " + gcd(nb1, nb2));
                    break;

                case 5:
                    System.out.print("Choose a number to convert in binary > ");
                    int binary = key.nextInt();
                    System.out.println("Binary converison of " + binary + " is " + DecToBinary(binary));
                    break;

                case 6:
                    System.out.print("Choose an integer > ");
                    int n1 = key.nextInt();
                    System.out.println("Number of digits for " + n1 + " is " + nbDigits(n1));
                    break;

                case 7:
                    System.out.print("Choose an integer > ");
                    int n2 = key.nextInt();
                    System.out.println("Sum of digits for " + n2 + " is " + sumDigits(n2));
                    break;

                default:
                    System.err.println("Exercise number does not exist !!!");
            }
        }
    }
}
