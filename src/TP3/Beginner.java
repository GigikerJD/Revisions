package TP3;

import java.util.Scanner;

public class Beginner
{
    public static int SaisiePositif(){
        Scanner sc = new Scanner(System.in);
        int number;
        do number = sc.nextInt();
        while(number <= 0);
        return number;
    }

    public static boolean estPair(int valeur){
        return valeur % 2 == 0;
    }

    public static void testEstPair(){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(estPair(number)) System.out.println("even number !");
        else System.out.println("odd number !");
    }

    public static boolean estStrictementPositif(int valeur){
        return valeur > 0;
    }

    public static void testEstStrictementPositif() {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (estStrictementPositif(value)) System.out.println("Strict positive number !");
        else System.out.println("Negative or null number !");
    }

    public static int posNeg(int nb1, int nb2){
        int res = 0;
        if(nb1 > 0 && nb2 > 0) res = 1;
        else if(nb1 < 0 && nb2 < 0) res = 1;
        else if(nb1 > 0 && nb2 < 0) res = -1;
        else if(nb1 < 0 && nb2 > 0) res = -1;
        else res = 0;
        return res;
    }

    public static void testPosNeg(){
        Scanner sc = new Scanner(System.in);
        int nb1 = sc.nextInt();
        int nb2 = sc.nextInt();

        if(posNeg(nb1, nb2) == 0) System.out.println("Produit nul !");
        else if(posNeg(nb1, nb2) == 1) System.out.println("Produit positif !");
        else System.out.println("Produit négatif !");
    }


    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();

        while (true){
            switch (exercise){
                case 3:
                    SaisiePositif();
                    break;

                case 4:
                    testEstPair();
                    break;

                case 5:
                    testEstStrictementPositif();
                    break;

                case 6:
                    testPosNeg();
                    break;
            }
        }
    }
}
