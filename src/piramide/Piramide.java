/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author polina.garmas
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Enter your текст: ");
        Scanner sn = new Scanner(System.in);
           // int number = sn.nextInt();

        // drawPiramide(number);
        String s = sn.next();
        superStarPrint(s);

    }

    public static void drawPiramide(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");

        }
    }

    public static void starPrint(String text) {
        System.out.println("*" + text + "*");
        int n = text.length();
        System.out.println(n);

    }

    public static void superStarPrint(String text) {
        int n = text.length();
        for (int i = 1; i < n+3; i++) {
            System.out.print("*");

        }
        System.out.println("");
        System.out.println("*" + text + "*");
        for (int i = 1; i < n+3; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
