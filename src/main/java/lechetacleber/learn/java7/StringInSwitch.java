package lechetacleber.learn.java7;

/**
 * @author Cleber Lecheta
 * https://encontreiJesus.com
 *
 * Java 7 added support to use Strings with switch command
 */
public class StringInSwitch {

    public static void main(String[] args) {
        System.out.println("Strings in switch Statement");

        //From Java 5/6
        System.out.println("Java 6");
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("4 | Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        //To java 7
        System.out.println("Java 7");
        String country = "FR";
        switch (country) {
            case "UK":
            case "US":
                System.out.println("Hi!");
                break;
            case "DE":
                System.out.println("Hallo!");
                break;
            case "FR":
                System.out.println("\"FR\" | Bonjour!");
                break;
            default:
                System.out.println("O céu está te esperando!");
        }
    }
}
