package com.company;

public class Strings {

    // exercici 1
    public static int[] aparicionsVocals(String cadena) {
        int[] vocals = {0, 0, 0, 0, 0};
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                    vocals[0]++;
                    break;
                case 'e':
                    vocals[1]++;
                    break;
                case 'i':
                    vocals[2]++;
                    break;
                case 'o':
                    vocals[3]++;
                    break;
                case 'u':
                    vocals[4]++;
                    break;
                default:
                    break;
            }
        }
        return vocals;
    }

    // exercici 2
    public static boolean isPalindrom(String paraula) {
        boolean isPalindrom = true;
        for (int i = 0; i < paraula.length() / 2; i++) {
            if (paraula.charAt(i) != paraula.charAt(paraula.length() - 1 - i)) {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }

    // exercici 3
    public static int aparicionsPrimeraVocal(String cadena) {
        char[] vocals = {'a', 'e', 'i', 'o', 'u'};
        char primeraVocal = Character.MIN_VALUE; // caràcter buid
        boolean primeraVocalTrobada = false;
        int aparicionsPrimeraVocal = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (!primeraVocalTrobada) {
                for (int j = 0; j < vocals.length; j++) {
                    if (cadena.charAt(i) == vocals[j]) {
                        primeraVocal = cadena.charAt(i);
                        primeraVocalTrobada = true;
                        aparicionsPrimeraVocal++;
                    }
                }
            } else if (primeraVocal == cadena.charAt(i)) {
                aparicionsPrimeraVocal++;
            }
        }
        return aparicionsPrimeraVocal;
    }

    // exercici 4
    public static boolean vocalsParellImparell(String paraula) {
        char[] vocals = {'a', 'e', 'i', 'o', 'u'};
        int counter = 0;

        for (int i = 0; i < paraula.length(); i++) {
            for (int j = 0; j <vocals.length; j++) {
                if (paraula.charAt(i) == vocals[j]) {
                    counter++;
                }
            }
        }
        if (counter % 2 == 0) {
            return true;
        }
        return false;
    }

    // exercici 5
    public static void numParaulesParellImparell(String cadena) {
        int numParaulesParell = 0;
        int numParaulesImparell = 0;

        String paraulaActual = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                paraulaActual += cadena.charAt(i);
            } else {
                if (paraulaActual.length() % 2 == 0) {
                    numParaulesParell++;
                } else {
                    numParaulesImparell++;
                }
                paraulaActual = "";
            }
        }
        System.out.println("Paraules amb un número parell de caràcters: " + numParaulesParell +
                "\nParaules amb un número senar de caràcters: " + numParaulesImparell);
    }

    // exercici 6
    public static String invertirString(String string) {
        String aux = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            aux += string.charAt(i);
        }
        return aux;
    }
}