package TP2;

import java.util.Arrays;
import java.util.Scanner;

public class Intermediate {

    public static int occs(int[] tab, int choice){
        int count = 0;
        for(Integer i : tab) if (i == choice) count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();

        while(true){
            switch(exercise){
                case 1:
                    System.out.println("Enter all 3 values > ");
                    args[0] = key.next();
                    args[1] = key.next();
                    args[2] = key.next();

                    for (String s : args) System.out.print(Integer.parseInt(s) + " ".trim());
                    break;

                case 2:
                    args[0] = key.next();
                    args[1] = key.next();
                    args[2] = key.next();
                    double moy = 0.0;
                    for (String s : args) moy += Integer.parseInt(s);
                    System.out.println("moyenne = " + moy);
                    break;

                case 3:
                    System.out.print("Taille du tableau > ");
                    int SIZE = key.nextInt();
                    int[] tab = new int[SIZE];
                    for(int step = 0; step < SIZE; step++){
                        System.out.print("Value > ");
                        tab[step] = key.nextInt();
                    }
                    moy = Arrays.stream(tab).sum()/SIZE;
                    System.out.println("moyenne = " + moy);
                    break;

                case 4:
                    System.out.print("Taille du tableau");
                    int size = key.nextInt();
                    tab = new int[size];
                    int vmax = tab[0];

                    for(int n = 0; n < size; n++){
                        System.out.print("Enter a value > ");
                        tab[n] = key.nextInt();
                        if(n == 0) continue;
                        else if (tab[n] > vmax) vmax = tab[n];
                    }
                    System.out.println("Maximum value is : " + vmax);
                    break;

                case 5:
                    System.out.print("Taille du tableau : ");
                    size = key.nextInt();
                    tab = new int[size];

                    for(int step = 0; step < size; step++){
                        System.out.print("Enter a value > ");
                        tab[step] = key.nextInt();
                    }

                    System.out.print("Which value are you looking for ? > ");
                    int searchValue = key.nextInt();
                    if(occs(tab, searchValue) > 0) System.out.println("Found it, " + Arrays.binarySearch(tab, searchValue));
                    else System.out.println("Not here, sorry !");
                    break;

                default:
                    System.err.println("Exercise number doesn't exist !!!");
                    break;
            }
        }
    }
}
