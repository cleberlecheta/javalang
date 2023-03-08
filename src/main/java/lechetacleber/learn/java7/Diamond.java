package lechetacleber.learn.java7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cleber Lecheta
 * https://encontreiJesus.com
 */
public class Diamond {

    public static void main(String[] args) {
        System.out.println("Diamond <> Operator");

        //From Java 5/6
        List<String> stringListJava5 = new ArrayList<String>();
        stringListJava5.add("Java ");
        stringListJava5.add("5 ");
        stringListJava5.add("ArrayList<String>");
        System.out.println(stringListJava5.toString());;

        //To Java 7 - less verbose
        List<String> stringListJava7 = new ArrayList<>();
        stringListJava7.add("Java ");
        stringListJava7.add("7 ");
        stringListJava7.add("ArrayList<>");
        System.out.println(stringListJava7.toString());;
    }

}
