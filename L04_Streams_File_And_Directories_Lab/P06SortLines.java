package L04_Streams_File_And_Directories_Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class P06SortLines {
    public static void main(String[] args) throws IOException {
        String str = "04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        List<String> lines = Files.readAllLines(Paths.get(str))
                .stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());

        Files.write(Paths.get("output.txt"), lines);
    }
}
