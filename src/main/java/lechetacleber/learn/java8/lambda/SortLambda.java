package lechetacleber.learn.java8.lambda;

import lechetacleber.ComparisonProvider;
import lechetacleber.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 */
public class SortLambda {

    private static final List<Person> people = new ArrayList<>(List.of(
            new Person("Adalberto Roberto", 60),
            new Person("Gracinha Ramos", 55),
            new Person("Will Wilson", 15),
            new Person("Cleber Lecheta", 39)
    ));

    public static void main(String[] args) {
        System.out.println("Implementing sorting with Lambda -> \n");
        System.out.println("original list: " + people);

        /* Comparing using traditional implementation
        Comparator<Person> comp = new Comparator<Person> {
            public int compare(Person p1, Person p2) {
                String nomeC1 = p1.getName();
                String nomeC2 = p2.getName();
                return nomeC1.compareTo(nomeC2);
            }
        };*/
        //Comparing using method reference
        Collections.sort(people, new ComparisonProvider()::compareByName);
        System.out.println(people + "\n");

        /* Comparing using Lambda function without further coding
         * Let's implement a reverse ordering here */
        Collections.sort(people, (p1, p2) -> p2.getName().compareTo(p1.getName()));
        System.out.println(people);
    }

}
