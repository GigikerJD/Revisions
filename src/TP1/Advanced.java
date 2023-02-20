package TP1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Advanced {

    public static double un(int n){
        if(n == 0) return 4.5;
        else return 2*un(n-1)-3;
    }
    public static double wn(int n){
        if(n == 0) return 2;
        else return wn(n-1) + xn(n-1);
    }
    public static double xn(int n){
        if(n == 0) return -1;
        else return xn(n-1) - wn(n-1);
    }

    public static ArrayList<Integer> listprimeNumbers(int fullrange){
       ArrayList<Integer> primes = null;
        int cpt = 0, j, count = 0;
        for(int i = 1; i < fullrange; i++) {
            for (j = 1; j < i; j++) if (i % j == 0) count++;
            if (count == 2) primes.add(i);
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();


        while(true){
            switch (exercise){
                case 1:
                    int ent1 = key.nextInt();
                    int ent2 = key.nextInt();
                    System.out.println("result = " + (ent1+ent2));
                    break;
                case 2:
                    System.out.print("Name > ");
                    String name = key.next();
                    System.out.print("Firstname > ");
                    String firstname = key.next();
                    System.out.print("Phone number > ");
                    String phoneNumber = key.next();
                    System.out.println(name + firstname + ", " + phoneNumber);
                    break;
                case 3:
                    String chaine1 = key.next();
                    String chaine2 = key.next();
                    if(chaine2.length() > chaine1.length()){
                        for(int cpt=0; cpt<chaine2.length(); cpt++){
                            System.out.print(chaine2.charAt(cpt));
                            System.out.print(chaine1.charAt(cpt));
                        }
                    }else {
                        for(int cpt=0; cpt<chaine1.length(); cpt++){
                            System.out.print(chaine1.charAt(cpt));
                            System.out.print(chaine2.charAt(cpt));
                        }
                    }
                    break;
                case 4:
                    System.out.print("How many marks ? > ");
                    int numberOfMarks = key.nextInt();
                    int[] marks = new int[numberOfMarks];
                    int sum = 0;
                    double avg = 0.0;
                    for(int start = 0; start < numberOfMarks; start++){
                        System.out.print("Enter a new mark > ");
                        marks[start] = key.nextInt();
                        sum += marks[start];
                        if(marks[start] < 0) break;
                    }
                    avg = sum / numberOfMarks;
                    System.out.println(Arrays.toString(marks));
                    break;
                case 5:
                    System.out.print("Choose a random number > ");
                    int number = key.nextInt();
                    int res = 0;
                    for(int i=1; i < number; i++){
                        if(number%i == 0) res += i;
                    }
                    if(res == number) System.out.println(number + " is a perfect number");
                    else System.out.println(number + " is not a perfect number");
                    break;
                case 6:
                    System.out.print("Choose a random natural number > ");
                    number = key.nextInt();
                    System.out.println(un(number) + ", " + wn(number) + ", " + xn(number));
                    break;
                case 7:
                    System.out.print("Choose a number range > ");
                    int fullrange = key.nextInt();
                    System.out.println(listprimeNumbers(fullrange));
                    break;
                default:
                    System.err.println("Exercise number does not exist !!!");
                    break;
            }
        }
    }
}
