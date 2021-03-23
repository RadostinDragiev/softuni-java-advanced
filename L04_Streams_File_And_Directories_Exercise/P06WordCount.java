package L04_Streams_File_And_Directories_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class P06WordCount {
    public static void main(String[] args) {
        String textPath = System.getProperty("user.dir") + "/resources/text.txt";
        String wordsPath = System.getProperty("user.dir") + "/resources/words.txt";

        BufferedReader reader;
        Map<String, Integer> matches = new LinkedHashMap<>();
        try {
            reader = Files.newBufferedReader(Paths.get(textPath));
            List<String> text = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

            reader = Files.newBufferedReader(Paths.get(wordsPath));
            List<String> words = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

            for (String s : text) {
                if (words.contains(s)) {
                    if (!matches.containsKey(s)) {
                        matches.put(s, 1);
                    } else {
                        matches.put(s, matches.get(s) + 1);
                    }
                }
            }

            PrintWriter writer = new PrintWriter("results.txt");

            for (Map.Entry<String, Integer> e : matches.entrySet()) {
                writer.println(String.format("%s - %d", e.getKey(), e.getValue()));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
