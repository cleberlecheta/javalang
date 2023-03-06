package lecheta.cleber.learn.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

/**
 * @author Cleber Lecheta
 * https://encontreiJesus.com
 *
 * biggest change in Java 8
 * (parameter1, parameter2) -> { code block }
 * - Enables functional programming
 * - Enables support for parallel processing
 *
 * https://www.youtube.com/watch?v=gpIUfj3KaOc&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&ab_channel=JavaBrains
 */
public class LambdaExpressions {

    public static void main(String[] args) {
        System.out.println("Lambda Expressions\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(11);

        System.out.println("\nUse a lambda expression in the ArrayList's forEach() method to print every item in the list");
        numbers.forEach( (n) -> { System.out.println(n); } );

        System.out.println("\nUse Java's Consumer interface to store a lambda expression in a variable");
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        System.out.println("\nCreate a method which takes a lambda expression as a parameter");
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);

        System.out.println("\nDefining Runnable by Lambda expression");
        Runnable java8Runner = () -> {
            System.out.println("I am running");
        };
        java8Runner.run();
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
