# javalang

## Java 7 Important Features

    Garbage First (G1) – new garbage collector algorithm performs clean-up where there is most garbage.
    To achieve this it split Java heap memory into multiple regions, 
    as opposed to 3 regions in the prior to Java 7 version (new, old and permgen).

    Java NIO 2.0 – New package java.nio.file is introduced in Java 7 and provides comprehensive support for file I/O
    and for accessing the default file system. E.g. instead of java.io.File you can use java.nio.file.Path class:
    Path path = Paths.get("c:\\data\\myfile.txt");

    More precise Exception rethrow – Java 7 compiler performs more precise analysis of rethrown exceptions 
    than earlier releases of java. This enables you to specify more specific exception types
    in the throws clause of a method declaration.
    Example: http://fahdshariff.blogspot.com/2011/07/java-7-precise-rethrow.html

    Fork Join Framework -The fork/join framework is an implementation of the ExecutorService interface that allows you
    to take advantage of multiple processors available in modern servers. 
    It is designed for work that can be broken into smaller pieces recursively.
    The goal is to use all the available processing power to enhance the performance of your application.
    The fork join framework is distinct because it uses a work-stealing algorithm, 
    which is very different than producer consumer algorithm. 
    * Note that fork/join framework is used in Java 8 as an infrastructure for parallel streams 
    and is therefor very important to understand properly.
