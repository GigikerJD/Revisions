package TP1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Intermediate
{
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Which exercise ? > ");
        int exercise = key.nextInt();


        while(true){
            switch (exercise){
                case 1:
                    int x, y, z;
                    x = y = z = 0;
                    System.out.println("x = " + x + "; y = " + y + "; z = " + z);
                    x = 5; y = 17; z = 31;
                    z = x*y; z = z+y;
                    y += 7; x += 8;
                    System.out.println("x = " + x + "; y = " + y + "; z = " + z);
                    break;
                case 2:
                    System.out.print("Name ? > ");
                    String name = key.next();
                    System.out.print("Hello " + name + "\nHow are you ?");
                    break;
                case 3:
                    int nb;
                    double ht, tva;
                    ht = key.nextDouble();
                    nb = key.nextInt();
                    tva = key.nextDouble();
                    System.out.println("Final price is = " + nb*(ht+tva));
                    break;
                case 4:
                    int a, b, c, det;
                    a = key.nextInt();
                    b = key.nextInt();
                    c = key.nextInt();
                    double r0, r1, r2;
                    det = b*b - 4*a*c;
                    if(det < 0) System.out.println("No solutions !");
                    else if(det == 0){
                        r0 = -b/(2*a);
                        System.out.println("Solution r0 = " + r0);
                    }else {
                        r1 = (-b - Math.sqrt(det))/(2*a);
                        r2 = (-b + Math.sqrt(det))/(2*a);
                        System.out.println("Solutions :\nr1 = " + r1 + "; r2 = " + r2);
                    }
                    break;
                case 5:
                    int s, e, p;
                    System.out.print("s = ");
                    s = key.nextInt();
                    System.out.print("e = ");
                    e = key.nextInt();
                    System.out.print("p = ");
                    p = key.nextInt();
                    if(s == e && s == p) System.out.println("Tous égaux");
                    else System.out.println("Dommage, pas d'égalité");
                    break;
                default:
                    System.err.println("Exercise number doesn't exist !!!");
                    break;
            }
        }
    }
}
