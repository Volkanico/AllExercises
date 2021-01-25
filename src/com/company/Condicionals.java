package com.company;
import java.util.Scanner;
public class Condicionals {

    private static Scanner scanner;
    private static int number;
    private static int number2;

    public static void exercici1() {
        scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " és positiu");
        } else if (number < 0) {
            System.out.println(number + " és negatiu");
        } else {
            System.out.println(number + " no és ni positiu ni negatiu");
        }
    }

    public static void exercici2() {
        scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " és múltiple de 2");
        } else {
            System.out.println(number + " no és múltiple de 2");
        }
    }

    public static void exercici3() {
        scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        System.out.print("Introdueix un altre número: ");
        scanner = new Scanner(System.in);
        number2 = scanner.nextInt();

        if (number > number2) {
            System.out.println(number + " és major que " + number2);
        } else if(number < number2) {
            System.out.println(number2 + " és major que " + number);
        } else {
            System.out.println(number + " i " + number2 + " són iguals");
        }
    }

    public static void exercici4a() {
        scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Dilluns");
        } else if (number == 2) {
            System.out.println("Dimarts");
        } else if (number == 3) {
            System.out.println("Dimecres");
        } else if (number == 4) {
            System.out.println("Dijous");
        } else if (number == 5) {
            System.out.println("Divendres");
        } else if (number == 6) {
            System.out.println("Dissabte");
        } else if (number == 7) {
            System.out.println("Diumenge");
        } else {
            System.out.println("Número incorrecte");
        }
    }

    public static void exercici4b() {
        scanner = new Scanner(System.in);

        System.out.print("Introdueix un número: ");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("Número incorrecte");
                break;
        }
    }

    public static void exercici5() {
        int hour = 20;

        if (hour >= 8 && hour < 12) {
            System.out.println("MATÍ");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("MIGDIA");
        } else if (hour >= 17 && hour < 20) {
            System.out.println("HORABAIXA");
        } else if (hour >= 20 && hour <= 23)  {
            System.out.println("VESPRE");
        } else {
            System.out.println("Hora errònia");
        }
    }

    public static void exercici6() {
        int mark;
        scanner = new Scanner(System.in);

        System.out.print("Introdueix una nota entre 0 i 10: ");
        mark = scanner.nextInt();

        switch (mark) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENT");
                break;
            case 5:
            case 6:
                System.out.println("SUFICIENT");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("EXCEL·LECT");
                break;
            default:
                System.out.println("Nota incorrecta");
                break;
        }
    }

    public static void exercici7() {
        int day;
        int month;
        int year;
        boolean isCorrect = false;
        scanner = new Scanner(System.in);

        System.out.print("Introdueix el dia: ");
        day = scanner.nextInt();
        System.out.print("Introdueix el mes: ");
        month = scanner.nextInt();
        System.out.print("Introdueix l'any: ");
        year = scanner.nextInt();

        if (day >= 1 && day <= 30) {
            if (month >= 1 && month <= 12) {
                if (year >= 1 && year <= 2020) {
                    isCorrect = true;
                }
            }
        }

        if (isCorrect) {
            System.out.println("La data introduida és correcta");
        } else {
            System.out.println("La data introduica és incorrecta");
        }
    }

    public static void exercici8() {
        int day;
        int month;
        int year;
        boolean isCorrect = false;
        scanner = new Scanner(System.in);

        System.out.print("Introdueix el dia: ");
        day = scanner.nextInt();
        System.out.print("Introdueix el mes: ");
        month = scanner.nextInt();
        System.out.print("Introdueix l'any: ");
        year = scanner.nextInt();


        if (year >= 1 && year <= 2020) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day >= 1 && day <=31) {
                        isCorrect = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day >= 1 && day <= 30) {
                        isCorrect = true;
                    }
                    break;
                case 2:
                    if (day >= 1 && day <= 28) {
                        isCorrect = true;
                    }
                default:
                    break;
            }
        }

        if (isCorrect) {
            System.out.println("La data introduida és correcta");
        } else {
            System.out.println("La data introduica és incorrecta");
        }
    }

    public static void exercici9() {
        int numberA;
        int numberB;
        int numberC;
        scanner = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        numberA = scanner.nextInt();
        System.out.print("Introdueix el segon número: ");
        numberB = scanner.nextInt();
        System.out.print("Introdueix el tercer número: ");
        numberC = scanner.nextInt();

        if (numberA >= numberB && numberA>=numberC) {
            if(numberB>=numberC) {
                System.out.println(numberA + " " + numberB + " " + numberC);
            }
            else {
                System.out.println(numberA + " " + numberC + " " + numberB);
            }
        } else if (numberB >= numberA && numberB >= numberC) {
            if (numberA >= numberC) {
                System.out.println(numberB + " " + numberA + " " + numberC);
            } else {
                System.out.println(numberB + " " + numberC + " " + numberA);
            }
        } else if (numberC >= numberA && numberC >= numberB) {
            if (numberA >= numberB) {
                System.out.println(numberC + " " + numberA + " " + numberB);
            } else {
                System.out.println(numberC + " " + numberB + " " + numberA);
            }
        }

    }

    public static void exercici10() {
        scanner = new Scanner(System.in);
        int age;

        System.out.print("Introdueix l'edat d'una persona: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("És major d'edat");
        } else if (age < 18){
            System.out.println("És menor d'edat");
        } else {
            System.out.println("L'edat introduida és incorrecta");
        }
    }

    public static void exercici11() {
        // 50, 20, 10, 5
        scanner = new Scanner(System.in);
        int quantitat;
        int bitlletsCinquanta = 0;
        int bitlletsVint = 0;
        int bitlletsDeu = 0;
        int bitlletsCinc = 0;
        int monedesDos = 0;
        int monedesUn = 0;

        System.out.print("Introdueix una quantitat de doblers: ");
        quantitat = scanner.nextInt();

        if (quantitat >= 50) {
            bitlletsCinquanta = quantitat / 50;
            quantitat = quantitat - bitlletsCinquanta * 50;
        }
        if (quantitat >= 20) {
            bitlletsVint = quantitat / 20;
            quantitat = quantitat - bitlletsVint * 20;
        }
        if (quantitat >= 10) {
            bitlletsDeu = quantitat / 10;
            quantitat = quantitat - bitlletsDeu * 10;
        }
        if (quantitat >= 5) {
            bitlletsCinc = quantitat / 5;
            quantitat = quantitat - bitlletsCinc * 5;
        }
        if (quantitat >= 2) {
            monedesDos = quantitat / 2;
            quantitat = quantitat - monedesDos * 2;
        }
        if (quantitat >= 1) {
            monedesUn = quantitat / 1;
            quantitat = quantitat - monedesUn * 1;
        }

        System.out.println("Bittlets de 50: " + bitlletsCinquanta);
        System.out.println("Bittlets de 20: " + bitlletsVint);
        System.out.println("Bittlets de 10: " + bitlletsDeu);
        System.out.println("Bittlets de 5: " + bitlletsCinc);
        System.out.println("Monedes de 2: " + monedesDos);
        System.out.println("Monedes d'1: " + monedesUn);
    }
}
