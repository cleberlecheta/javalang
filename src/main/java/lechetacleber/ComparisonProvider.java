package lechetacleber;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 */
public class ComparisonProvider {
    /** Return the alphabetic order of persons name */
    public int compareByName(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());
    }
}
