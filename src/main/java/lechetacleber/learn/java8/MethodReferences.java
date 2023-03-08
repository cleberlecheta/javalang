package lechetacleber.learn.java8;

import lechetacleber.learn.ComparisonProvider;
import lechetacleber.learn.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber Useful syntax to refer directly to exiting methods or constructors
 * of Java classes or objects (instances)
 * <p>
 * Reference to a static method | ContainingClass::staticMethodName
 * Reference to an instance method of a particular object | containingObject::instanceMethodName
 * Reference to an instance method of an arbitrary object of a particular type | ContainingType::methodName
 * Reference to a constructor | ClassName::new
 */
public class MethodReferences {

    private static final List<Person> allThePeople = new ArrayList<>(List.of(
            new Person("Adalberto Roberto", 60),
            new Person("Gracinha Ramos", 55),
            new Person("Will Wilson", 15),
            new Person("Cleber Lecheta", 39)
    ));

    public static void main(String[] args) {
        System.out.println("Method Reference: containingObject::instanceMethodName -> \n");

        System.out.println("original list:");
        for (Person person: allThePeople) {
            System.out.println(person.toString());
        }

        //Use Collection.sort to sort Lists and Arrays.sort to sort Arrays of course
        Collections.sort(allThePeople, new ComparisonProvider()::compareByName);
        /* instead of: specific comparator for each object
            class PersonComparator implements java.util.Comparator<Person> {
                @Override
                public int compare(Person a, Person b) {
                    return a.getAge() - b.getAge();
                }
            }
         */

        System.out.println("\n sorted list:");
        for (Person person: allThePeople) {
            System.out.println(person.toString());
        }
    }
}
