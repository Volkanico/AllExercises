package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arrays {
    private static Scanner scanner;

    public static void exercici1A() {
        int [] elements = {5, 4, 97, 1};

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public static void exercici1B() {
        int [] elements = {5, 4, 97, 1};

        System.out.println(elements[0]);
        System.out.println(elements[1]);
        System.out.println(elements[2]);
        System.out.println(elements[3]);
    }

    public static void exercici2() {
        scanner = new Scanner(System.in);

        int N = 5;
        int [] elements = new int[N];

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }

        System.out.println("Els números introduïts són:");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }

    public static void exercici3() {
        scanner = new Scanner(System.in);

        int N = 5;
        int [] elements = new int[N];

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }

        System.out.println("Els números introduïts són:");
        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
    }

    public static void exercici4() {
        scanner = new Scanner(System.in);

        int N = 5;
        int [] elements = new int[N];
        int sum = 0;
        double average;

        for (int i = 0; i < elements.length; i++) {
            System.out.print("Introdueix un número: ");
            elements[i] = scanner.nextInt();
        }

        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }

        average = (double)sum / elements.length;
        System.out.println("La suma és: " + average);
    }

    public static void exercici5() {
        char [] chars = {'h', 'o', 'l', 'a'};
        String concat = "";

        for (int i = 0; i < chars.length; i++) {
            concat += chars[i];
        }

        System.out.println(concat);
    }

    public static void exercici6() {
        int [] numbers = {1, 2, 3, 4};
        String concat = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            concat += Integer.toString(numbers[i]);
        }

        System.out.println(concat);
    }

    public static void exercici7() {
        int [] elements = {2, 4, 1, 9, 6};
        int sum = 0;
        double average;

        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }

        average = (double)sum / elements.length;
        System.out.println("La mitjana és: " + average);
    }

    public static void exercici8() {
        int [] arrayA = {3, 4, 1};
        int [] arrayB = {2, 7, 5};
        int [] arrayC = new int[6];

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i * 2] = arrayA[i];
            arrayC[i * 2 + 1] = arrayB[i];
        }
        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + " ");
        }
    }

    public static void exercici9() {
        int [] elements = {2, 4, 1, 9, 6};

        boolean isAsc = true;
        boolean isDesc = true;

        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] > elements[i+1]) {
                isAsc = false;
            } else if(elements[i] < elements[i+1]){
                isDesc = false;
            }
        }

        if (isAsc) {
            System.out.println("L'array està ordenat ascendentment");
        } else if(isDesc) {
            System.out.println("L'array està ordenat descendentment");
        } else {
            System.out.println("L'array no està ordenat");
        }
    }

    public static void exercici10() {
        scanner = new Scanner(System.in);
        int number;

        ArrayList<Integer> positiveNumbers = new ArrayList<Integer>();
        ArrayList<Integer> negativeNumbers = new ArrayList<Integer>();

        do {
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
            if (number > 0) {
                positiveNumbers.add(number);
            } else if(number < 0) {
                negativeNumbers.add(number);
            }
        } while(number != 0);

        System.out.println("\nNúmeros positius introduïts:");
        for (int i = 0; i < positiveNumbers.size(); i++) {
            System.out.print(positiveNumbers.get(i) + " ");
        }

        System.out.println("\números negatius introduïts:");
        for (int i = 0; i < negativeNumbers.size(); i++) {
            System.out.print(negativeNumbers.get(i) + " ");
        }

    }

    public static void exercici11() {
        scanner = new Scanner(System.in);
        int N = 10;
        char [] chars = new char[N];
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            System.out.print("Introdueix un caràcter: ");
            chars[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x') {
                counter++;
            }
        }

        System.out.println("Número d'aparicions del caràcter 'x': " + counter);

        // Aquest exercici es podria fer sense arrays. En llegir un caràcter per
        // teclat, si és 'x' feim counter++ i ja sabrem quantes 'x' han introduït
    }

    public static void exercici12() {
        scanner = new Scanner(System.in);
        int N = 10;
        char [] chars = new char[N];
        int counter = 0;
        boolean yFound = false;

        for (int i = 0; i < chars.length; i++) {
            System.out.print("Introdueix un caràcter: ");
            chars[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'y') {
                yFound = true;
            }
            if (yFound && chars[i] == 'x') {
                counter++;
            }
        }

        System.out.println("Número d'aparicions del caràcter 'x' " +
                "després de la primera 'y': " + counter);

        // Aquest exercici també es podria fer sense arrays
    }

    public static void exercici13(){
        scanner = new Scanner(System.in);
        Random rand = new Random();

        int N = 10;
        int [] numbers = new int[N];

        int number;
        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
            System.out.print(numbers[i]);
        }

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                indexes.add(i);
            }
        }

        if (indexes.size() == 0) {
            System.out.println("El número " + number + " no apareix cap vegada");
        } else {
            System.out.print("El número " + number + " apareix en els índexs: ");
            for (int i = 0; i < indexes.size(); i++) {
                System.out.print(indexes.get(i) + " ");
            }
        }
    }

}
