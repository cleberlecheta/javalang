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
public class ForeachLambda {

    private static final List<Person> people = new ArrayList<>(List.of(
            new Person("Adalberto Roberto", 60),
            new Person("Gracinha Ramos", 55),
            new Person("Will Wilson", 15),
            new Person("Cleber Lecheta", 39)
    ));

    public static void main(String[] args) {
        System.out.println("Iterate list with Lambda -> \n");

        //Simple Loop
        for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
        System.out.println("\n");

        //Enhanced Loop
        for (Person person :people) {
            System.out.println(person);
        }
        System.out.println("\n");

        //Lambda For-each
        people.forEach((person) -> System.out.println(person));
    }
}
