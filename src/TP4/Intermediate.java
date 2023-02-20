package TP4;

import java.util.Scanner;

public class Intermediate {

    public static int sommeTabNonTerminale(int[] tab, int n){
        if(n == 0) return 0;
        return tab[n-1] + sommeTabNonTerminale(tab, n-1);
    }

    public static int sommeTabTerminale(int[] tab, int n, int res){
        if(n == 0) return res;
        return sommeTabTerminale(tab, n-1, res+tab[n-1]);
    }

    public static int maxTabRec(int[] tab, int n){
        if(n == 1) return tab[0];
        else {
            if(tab[n-1] > maxTabRec(tab, n-1)) return tab[n-1];
            return maxTabRec(tab, n-1);
        }
    }

    public static int nbOccTabRec(int[] tab, int n, int val){
        if(n == 0) return 0;
        else{
            if(val == tab[n-1]) return 1 + nbOccTabRec(tab, n-1, val);
            return nbOccTabRec(tab, n-1, val);
        }
    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();
    }
}
