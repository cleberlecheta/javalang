package lechetacleber.learn.java8;

interface Defaultable {
    default String notRequired() {
        return "Default interface method implemented";
    }
}

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 *
 * Interfaces now allow default methods,
 * the implementer may or may not implement (override) them.
 */
public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        System.out.println("Interface with default method -> \n");

        System.out.println(new DefaultableImpl().notRequired());
        System.out.println(new OverridableImpl().notRequired());
    }
}

class DefaultableImpl implements Defaultable {
}

class OverridableImpl implements Defaultable {
    @Override
    public String notRequired() {
        return "Interface overridden method implementation";
    }
}
