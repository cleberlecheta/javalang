package lechetacleber.learn.java8;

import lechetacleber.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 *
 * More examples and usage cases can be found at:
 * https://stackify.com/streams-guide-java-8/
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

        //forEach
        allThePeople.stream().forEach(e -> e.setAge(new Random().nextInt(100)));

        //map
        List<Integer> collectAges = allThePeople.stream().map(n -> n.getAge()).collect(Collectors.toList());
        System.out.println("New ages: " + collectAges);

        //filter
        List<Person> adultPeople = allThePeople.stream() //Stream.of(allThePeople)
                .filter(p -> p.getAge() > 18)
                .collect(Collectors.toList());
        System.out.println("Age > 18: " + adultPeople);

        // map-reduce transformation on collection
        int sum = allThePeople.stream()
                .filter(p -> p.getName().contains("Wilson"))
                .mapToInt(p -> p.getAge())
                .sum();
        System.out.println("Wilson age's now is: " + sum);

        //findFirst
        Person aPeople = allThePeople.stream()
                .filter(p -> p.getAge() > 30)
                .findFirst()
                .orElse(null);
        System.out.println("first person > 30: " + aPeople.toString());
    }
}
