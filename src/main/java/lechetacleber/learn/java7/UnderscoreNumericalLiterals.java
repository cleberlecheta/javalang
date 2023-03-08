package lechetacleber.learn.java7;

/**
 * @author Cleber Lecheta
 * https://encontreiJesus.com
 *
 * since java 7 you can insert underscores “_” between digits
 */
public class UnderscoreNumericalLiterals {

    public static void main(String[] args) {
        System.out.println("Underscore in Numerical Literals\n");

        int million = 1_000_000;
        System.out.println("int million: " + million);
        long creditCardNumber = 1234_5678_9012_3456L;
        System.out.println("long credit card: " + creditCardNumber);
        float num = 1.2345_6789f;
        System.out.println("float number: " + num);
    }
}
