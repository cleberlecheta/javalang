package lechetacleber.learn.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Cleber Lecheta
 * YouTube | GitHub | Instagram | LinkedIN
 * @lechetacleber
 *
 * Use lambda expressions to provide a declarative API that offers the possibility of easily defining
 * a recipe that combines and composes different synchronous and asynchronous tasks to perform
 * a complex operation in the most effective way.
 */
public class CompletableFutureClass {
    public static void main(String[] args) {

    }

    public Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }
}
