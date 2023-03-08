package lechetacleber.learn.java8;

interface StaticMethodInterface {
    static Boolean aMethod() {
        System.out.println("interface static method called");
        return true;
    }
}

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 */
public class InterfaceStaticMethod {
    public static void main(String[] args) {
        System.out.println("Interface with static method -> \n");
        System.out.println(StaticMethodInterface.aMethod());
    }
}
