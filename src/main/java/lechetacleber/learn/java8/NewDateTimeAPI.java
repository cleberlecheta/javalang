package lechetacleber.learn.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber https://docs.oracle.com/javase/tutorial/datetime/index.html
 * <p>
 * from: import java.util.Date;
 * to: java.time.*;
 */
public class NewDateTimeAPI {

    public static DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("New Date/Time API -> \n");

        // Get the local date
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate " + date);

        // Get the local time
        LocalTime time = LocalTime.now();
        System.out.println("LocalTime " + time);

        // Get the local date/time
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("LocalDateTime " + datetime + "\n");

        // Get duration between two dates
        LocalDateTime from = LocalDateTime.of(2023, Month.APRIL, 16, 0, 0, 0);
        System.out.println("from " + from);
        LocalDateTime to = LocalDateTime.of(2023, Month.APRIL, 16, 23, 59, 59);
        System.out.println("to " + to);

        Duration duration = Duration.between(from, to);
        System.out.println("duration " + formatDuration(duration));
    }

    private static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }
}
