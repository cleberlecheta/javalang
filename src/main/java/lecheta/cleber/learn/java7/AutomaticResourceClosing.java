package lecheta.cleber.learn.java7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Cleber Lecheta
 * https://encontreiJesus.com
 */
public class AutomaticResourceClosing {

    public static void main(String[] args) {
        System.out.println("Automatic Resource Closing");

        System.out.println("Current directory is:" + System.getProperty("user.dir") + "\n");
        File file = new File("aFile.txt");
        FileInputStream fis = null;

        //From Java 6
        try {
            fis = new FileInputStream(file);
            System.out.println("Java 6");
            readProjectFile(fis);
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // need to explicit close the file
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        /** To java 7: there is try-with-resource feature.
         * If a resource implements java.lang.AutoCloseable,
         * which includes all objects implementing java.io.Closeable,
         * will be auto closed if they are created within try statement:
         */
        try {
            fis = new FileInputStream(file);
            System.out.println("Java 7");
            readProjectFile(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readProjectFile(FileInputStream fis) throws IOException {
        System.out.println("Total file size (in bytes) : " + fis.available());
        int content;
        while ((content = fis.read()) != -1) {
            System.out.print((char) content);
        }
        System.out.println();
    }
}
