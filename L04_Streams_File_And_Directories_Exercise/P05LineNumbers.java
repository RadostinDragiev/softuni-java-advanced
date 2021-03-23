package L04_Streams_File_And_Directories_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P05LineNumbers {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/resources/inputLineNumbers.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            StringBuilder result = new StringBuilder();
            long lineCounter = 1;
            while (line != null) {
                result.append(String.format("%d. ", lineCounter)).append(line).append(System.lineSeparator());
                line = reader.readLine();
                lineCounter++;
            }

            PrintWriter writer = new PrintWriter("output.txt");
            writer.write(result.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
