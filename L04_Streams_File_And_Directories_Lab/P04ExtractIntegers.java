package L04_Streams_File_And_Directories_Lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt");

        Scanner scanner = new Scanner(file);

        PrintWriter writer = new PrintWriter("integers.txt");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                writer.println(scanner.nextInt());
            } else {
                scanner.next();
            }
        }

        writer.flush();
    }
}
