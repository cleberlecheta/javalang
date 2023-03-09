package lechetacleber.learn.java8;

import java.util.Optional;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 */
public class OptionalClass {
    public static void main(String[] args) {
        System.out.println("Optional -> \n");

        //Create Optional objects to avoid NullPointerException

        Optional<String> empty = Optional.empty(); //create an empty Optional object
        System.out.println("empty? " + empty.isEmpty());

        String name = "Bulldog";
        Optional<String> opt = Optional.of(name);
        System.out.println("present? " + opt.isPresent());

        try {
            name = null;
            Optional.of(name);
        } catch (NullPointerException npe) {
            System.out.println("the argument passed to the of() method can't be null");
        }

        opt = Optional.ofNullable(name);
        System.out.println("in case we expect null values we can use the ofNullable(). Present? " + opt.isPresent());
    }
}
