package L04_Streams_File_And_Directories_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {
        String path  = System.getProperty("user.dir") + "/resources/input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            long sum = 0;

            while (line != null) {
                for (char c : line.toCharArray()) {
                    sum += c;
                }

                line = reader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
