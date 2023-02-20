package TP3;

import java.util.Scanner;

public class Advanced
{

    private static void remplirTab(int[] tab, int size){
        for(Integer i : tab){
            System.out.print("Value of i > ");
            i = new Scanner(System.in).nextInt();
        }
    }

    private static void afficherTab(int[] tab, int size){
        for(Integer i : tab) System.out.print(i + " ");
    }

    private static int positionMax(int[] tab, int size){
        int posmax = 0;
        int vmax = tab[0];
        for(int cpt = 1; cpt < size; cpt++){
            if(tab[cpt] > vmax){
                vmax = tab[cpt];
                posmax = cpt;
            }
        }
        return posmax;
    }

    private static void permuterCases(int[] tab, int i, int j){
        int temp;
        temp = tab[i];
        tab[i]  = tab[j];
        tab[j] = temp;
    }

    private static void trierTab(int[] tab, int size){
        //sans utiliser les 2 méthodes précédentes
        for(int i = 0; i < size; i++)
            for(int j = i+1; j < size; j++)
                if(tab[i] > tab[j]) permuterCases(tab, i, j);
    }

    private static String inverserChaine(String str){
        String copy = "";
        for(int len = str.length()-1; len >= 0; len--) copy += str.charAt(len);
        return copy;
    }

    private static boolean comparerChaines(String str1, String str2){
        int cpt, range;
        cpt = range = 0;
        boolean sameChar = true;
        if(str1.length() == str2.length()){
            while(cpt < str1.length()){
                if (str1.charAt(cpt) != str2.charAt(cpt)) {
                    sameChar = false;
                    break;
                }
                cpt++;
            }
            if(!sameChar) return false;
            else return true;
        }
        else return false;
    }

    private static boolean verifPalindrome(String str){
        return comparerChaines(str, inverserChaine(str));
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();

        while(true){
            switch(exercise){
                case 1:

                    break;

                case 2:

                    break;
            }
        }
    }
}
