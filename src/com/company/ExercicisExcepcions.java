package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicisExcepcions {

    public static void Exercici1() {
        int num2 = 0;
        int num = 4;
        try {
            num2 = num / num2;

        } catch (ArithmeticException e) {
            System.err.println("ERROR");
        } finally {
            System.err.println("La prova ha finalitzat");
        }
    }
    public static void Exercici2 () {
        Scanner sc = new Scanner(System.in);
        try {
            int num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("ERROR");
        } finally {
            System.err.println("La prova ha finalitzat");
        }
    }

    public static int Exercici3 (String s) {
        int num = 0;
        try {
            num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.err.println("ERROR");
        } finally {
            System.err.println("La prova ha finalitzat");
        }
        return num;
    }
    public static void Exercici4 () {
        Scanner sc = new Scanner(System.in);
        String paraula1 = "";
        String paraula2 = "";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        try {
            num1 = Integer.parseInt(paraula1);
            num2 = Integer.parseInt(paraula2);
            num3 = num2 / num1;
        } catch (NumberFormatException e) {
            System.err.println("ERROR");
        } catch (ArithmeticException e) {
        }
        finally {
            System.err.println("La prova ha finalitzat");
        }
    }
    public static void Exercici5 () {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ERROR");
        } finally {
            System.err.println("La prova ha finalitzat");
        }
    }
    public static void Exercici6 () {}


}


