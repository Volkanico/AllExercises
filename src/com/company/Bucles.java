package com.company;
import java.util.Scanner;

public class Bucles {
    private static Scanner scanner;

    public static void exercici1() {
        scanner = new Scanner(System.in);
        int number;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        if (number >= 0) {
            for (int i = 0; i < number + 1; i++) {
                System.out.println(i);
            }
        }
    }

    // opció amb do while
    public static void exercici2A() {
        scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
        } while (number >= 0);
    }

    // opció amb while
    public static void exercici2B() {
        scanner = new Scanner(System.in);
        int number;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        while (number >= 0) {
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
        }
    }

    public static void exercici3() {
        scanner = new Scanner(System.in);
        int number;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        while (number != 0) {
            if (number > 0) {
                System.out.println(number + " és positiu");
            } else {
                System.out.println(number + " és negatiu");
            }
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
        }
    }

    public static void exercici4() {
        scanner = new Scanner(System.in);
        int number;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        while (number % 2 != 0) {
            System.out.println(number + " no és múltiple de 2");
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
        }
        System.out.println(number + " és múltiple de 2");
    }

    public static void exercici5() {
        scanner = new Scanner(System.in);
        int number;
        int counter = 0;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        while (number >= 0) {
            counter++;
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
        }
        System.out.println("S'han introduït " + counter + " números positius");
    }

    public static void exercici6() {
        scanner = new Scanner(System.in);
        int sum = 0;

        int number;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
        }
        System.out.println("La suma dels números introduits és " + sum);
    }

    public static void exercici7() {
        scanner = new Scanner(System.in);
        int number;
        double average;

        int counter = 0;
        int sum = 0;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        while (number != 0) {
            sum += number;
            counter++;
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
        }

        average = (double)sum / counter;
        System.out.println("La mitjana dels números introduïts és " + average);
    }

    public static void exercici8() {
        int number = 10;
        int mult = 1;

        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                mult *= i;
            }
        }
        System.out.println("La multiplicació dels primers números senars és " + mult);
    }

    public static void exercici9() {
        scanner = new Scanner(System.in);
        int number;
        int hiddenNumber = 7;

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        while (number != hiddenNumber) {
            if (number > hiddenNumber) {
                System.out.println("T'has passat");
            } else {
                System.out.println("T'has quedat curt");
            }
            System.out.print("Introdueix un altre número: ");
            number = scanner.nextInt();
        }
        System.out.println("Correcte. El número ocult era " + hiddenNumber);
    }

    public static void exercici10() {
        scanner = new Scanner(System.in);
        final int N = 10;
        boolean isNegative = false;
        int number;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
            if (number < 0) {
                isNegative = true;
            }
        }

        if (isNegative) {
            System.out.println("S'ha introduït algun número negatiu");
        } else {
            System.out.println("No s'ha introduüt cap número negatiu");
        }
    }

    public static void exercici11() {
        scanner = new Scanner(System.in);
        final int N = 10;
        int highestNumber = 0;
        int number;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introdueix un número: ");
            number = scanner.nextInt();
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        System.out.println("El número més gran introduït és " + highestNumber);
    }

    public static void exercici12() {
        scanner = new Scanner(System.in);
        final int N = 10;
        int numberPassed = 0;
        int numberFailed = 0;
        int validMarks = 0;
        int sum = 0;
        int mark;
        double average;

        for (int i = 0; i < N; i++) {
            System.out.print("Introdueix una nota: ");
            mark = scanner.nextInt();
            if (mark >= 0 && mark <= 10) {
                if (mark > 4 && mark <= 10) {
                    numberPassed++;
                } else if (mark < 5 && mark >= 0) {
                    numberFailed++;
                }
                sum += mark;
                validMarks++;
            }
        }
        average = (double)(sum / (numberPassed + numberFailed));

        System.out.println("Número d'aprovats: " + numberPassed);
        System.out.println("Número de suspesos: " + numberFailed);
        System.out.println("Mitjana: " + average);
    }

    public static void exerciciExtra1() {
        scanner = new Scanner(System.in);
        String word;

        System.out.print("Introdueix una cadena de caràcters: ");
        word = scanner.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    public static void exerciciExtra2() {
        scanner = new Scanner(System.in);
        String word;
        boolean isPalindrome = true;

        System.out.print("Introdueix una cadena de caràcters: ");
        word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("'" + word + "' és un palíndrom");
        } else {
            System.out.println("'" + word + "' no és un palíndrom");
        }
    }

    public static void exerciciExtra3() {
        scanner = new Scanner(System.in);
        String line;
        int numberOfWords = 0;

        System.out.print("Introdueix una cadena de caràcters: ");
        line = scanner.nextLine();

        // per simplicitat, suposarem que totes les paraules estan separades per un espai
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                numberOfWords++;
            }
        }
        if (line.length() > 0) {
            numberOfWords++;
        }

        if (numberOfWords == 1) {
            System.out.println( numberOfWords + " paraula");
        } else {
            System.out.println( numberOfWords + " paraules");
        }
    }

    public static void exerciciExtra4() {
        scanner = new Scanner(System.in);
        String line;
        int numberOfA = 0;

        System.out.print("Introdueix una cadena de caràcters: ");
        line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a' || line.charAt(i) == 'A') {
                numberOfA++;
            }
        }
        System.out.println("Número d'aparicions del caràcter 'a': " + numberOfA);
    }

    public static void exerciciExtra5() {
        scanner = new Scanner(System.in);
        String line;
        int numberOfA = 0;
        int numberOfE = 0;
        int numberOfI = 0;
        int numberOfO = 0;
        int numberOfU = 0;

        System.out.print("Introdueix una cadena de caràcters: ");
        line = scanner.nextLine();

        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
                case 'a':
                case 'A':
                    numberOfA++;
                    break;
                case 'e':
                case 'E':
                    numberOfE++;
                    break;
                case 'i':
                case 'I':
                    numberOfI++;
                    break;
                case 'o':
                case 'O':
                    numberOfO++;
                    break;
                case 'u':
                case 'U':
                    numberOfU++;
                    break;
            }
        }
        System.out.println("Aparicions de la vocal 'a': " + numberOfA);
        System.out.println("Aparicions de la vocal 'e': " + numberOfE);
        System.out.println("Aparicions de la vocal 'i': " + numberOfI);
        System.out.println("Aparicions de la vocal 'o': " + numberOfO);
        System.out.println("Aparicions de la vocal 'u': " + numberOfU);
    }

}

