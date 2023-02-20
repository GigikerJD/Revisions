package TP4;

import java.util.Scanner;

public class Advanced
{

    public static String inverserChaineRec(String chaine, int longueur){
        if(longueur == 1) return String.valueOf(chaine.charAt(0));
        return chaine.charAt(longueur-1) + inverserChaineRec(chaine, longueur-1);
    }

    public static void triangleAsc(int nbLig){
        if(nbLig > 0) triangleAsc(nbLig-1);
        for(int i = 0; i < nbLig; i++) System.out.println("+");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();
    }
}
