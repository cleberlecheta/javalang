package lechetacleber.learn.java8;

import lechetacleber.learn.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 */
public class StreamsAPI {

    private static final List<Person> allThePeople = new ArrayList<>(List.of(
            new Person("Adalberto Roberto", 60),
            new Person("Gracinha Ramos", 55),
            new Person("Will Wilson", 15),
            new Person("Cleber Lecheta", 39)
    ));

    public static void main(String[] args) {
        System.out.println("Use of Streams -> \n");

        /* You can use streams to perform functional operations like filer or map/reduce over collections
         * which can be streamed as individual elements using Stream objects */
        int sum = allThePeople.stream()
                .filter(w -> w.getName().contains("Wilson"))
                .mapToInt(w -> w.getAge())
                .sum();

        System.out.println("Wilson age's: " + sum);
    }
}
