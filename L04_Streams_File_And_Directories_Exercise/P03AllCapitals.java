package L04_Streams_File_And_Directories_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P03AllCapitals {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/resources/input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            PrintWriter printWriter = new PrintWriter("output.txt");

            while (line != null) {
                printWriter.write(line.toUpperCase() + System.lineSeparator());
                line = reader.readLine();
            }

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
