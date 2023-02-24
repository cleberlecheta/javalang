package lecheta.cleber.learn.java7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Cleber Lecheta
 * https://encontreiJesus.com
 */
public class MultiCatchExceptions {

    public static void main(String[] args) {
        System.out.println("Multi-catch exceptions");

        //From Java 6
        try {
            executeDivisionByZeroCode();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        //To Java 7
        try {
            executeDivisionByZeroCode();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //nice one!
            System.out.println("Java 7 " + e.getMessage());
        }
    }

    private static void executeDivisionByZeroCode() {
        int array[] = new int[10];
        array[10] = 30 / 0;
    }
}
