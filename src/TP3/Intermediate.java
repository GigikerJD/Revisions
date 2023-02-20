package TP3;

import java.util.Scanner;

public class Intermediate {

    private static int sommeElements(int a, int b){
        int somme = 0;
        for(int i = a; i <= b; i++) somme += a;
        return somme;
    }

    private static int factorielle(int n){
        int res = 1;
        while(n > 0){
            res *= n;
            n--;
        }
        return res;
    }

    private static boolean nombrePremier(int n){
        int count = 0;
        for(int nbr = 1; nbr <= n; nbr++) if(n % nbr == 0) count++;
        return count == 2;
    }

    private static boolean estBissextile(int annee){
        boolean isBis = false;
        if(annee % 400 == 0) isBis = true;
        else if(annee % 4 == 0 && annee % 100 != 0) isBis = true;
        return isBis;
    }

    private static int puissance(int a, int n){
        int res = 1;
        for(int i = 0; i < n; i++) res *= a;
        return res;
    }

    private static int maximumTab(int[] tab, int size){
        tab = new int [size];
        int vmax = tab[0];
        for(int i = 1; i < size; i++) if(tab[i] > vmax) vmax = tab[i];
        return vmax;
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();


        while(true){
            switch (exercise){
                case 1:
                    System.out.print("1st value > ");
                    int a = key.nextInt();
                    System.out.print("2nd value > ");
                    int b = key.nextInt();
                    System.out.println("Sum of a and b is = " + sommeElements(a, b));
                    break;

                case 2:
                    System.out.print("Choose a random number > ");
                    int number = key.nextInt();
                    System.out.println("Factorial of " + number + " is " + factorielle(number));
                    break;

                case 3:
                    System.out.print("Enter a random number > ");
                    number = key.nextInt();
                    if(nombrePremier(number)) System.out.println(number + " is a prime number !");
                    else System.out.println(number + " is not a prime number ! ");
                    break;

                case 4:
                    System.out.print("Select a random year > ");
                    int year = key.nextInt();
                    if(estBissextile(year)) System.out.println(year + " is a leap year ! ");
                    else System.out.println(year + " is not a leap year !");
                    break;

                case 5:
                    System.out.print("Choose an integer > ");
                    a = key.nextInt();
                    System.out.print("Select a randomw power > ");
                    int power = key.nextInt();
                    System.out.println(puissance(a, power));
                    break;

                case 6:
                    System.out.print("What size > ");
                    int size = key.nextInt();
                    int[] tab1 = new int[size];
                    for(Integer i : tab1){
                        System.out.print("Value of i > ");
                        i = key.nextInt();
                    }
                    System.out.println("Maximum value of tab1 is " + maximumTab(tab1, tab1.length));
                    break;
            }
        }
    }
}
