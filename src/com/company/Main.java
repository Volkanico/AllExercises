package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws Exception {

        File myFile = new File("file.txt");
        readFile(myFile);

    }

    public static void readFile(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) ;
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            System.out.println(e);
            return;
        }
        try {
            input.close();
        } catch (IOException e) {
        } finally {
            if (input != null) {
            }
        }
    }
}
