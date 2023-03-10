package lechetacleber.learn.java8;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 *
 * Asynchronous Computation in Java:
 * CompletableFuture is at the same time, a building block and a framework,
 * with about 50 different methods for composing, combining,
 * and executing asynchronous computation steps and handling errors.
 */
public class CompletableFutureClass {
    public static void main(String[] args) {
        System.out.println("Completable Future -> now: " + NewDateTimeAPI.timeFmt.format(LocalDateTime.now()) + "\n");
        Future<String> completableFuture = null;
        try {
            completableFuture = calculateAsync();
            String result = completableFuture.get();
            System.out.println(result);

            //The most generic way to process the result of a computation is to feed it to a function.
        } catch (InterruptedException | ExecutionException e) { //Java7 multi-catch exception, remember it ?
            e.printStackTrace();
        }
    }

    //Returns a Future instance
    static public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(1000);
            completableFuture.complete("Hello from future: "
                    + NewDateTimeAPI.dateFmt.format(LocalDateTime.now()));
            return null;
        });

        return completableFuture;
    }
}
