package lechetacleber.learn.java8.lambda;

/**
 * @author Cleber Lecheta
 * https://encontreiJesus.com
 *
 * Interface with just one single method. Makes already existing functionality lambda-friendly.
 * It may be implicitly converted to a lambda expression.
 * The java.lang.Runnable and java.util.Comparator are two great examples of functional interfaces.
 */
public class FunctionalInterfacesImpl {

    public static void main(String[] args) {
        System.out.println("Functional Interfaces");

        LambdaInterface lambdaFunction = (s) -> "Say my name";
        System.out.println("\n" + lambdaFunction.sayIt("hi"));

        lambdaFunction = (s) -> "Another name";
        System.out.println(lambdaFunction.sayIt("hi"));
    }

}
