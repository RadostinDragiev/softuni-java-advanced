package L04_Streams_File_And_Directories_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class P07MergeTwoFiles {
    public static void main(String[] args) {
        String firstFilePath = System.getProperty("user.dir") + "/resources/inputOne.txt";
        String secondFilePath = System.getProperty("user.dir") + "/resources/inputTwo.txt";

        try {
            PrintWriter writer = new PrintWriter("result.txt");

            appendLine(writer, firstFilePath);
            appendLine(writer, secondFilePath);

            writer.close();
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> readInput(BufferedReader reader) {
        List<String> result = new ArrayList<>();
        String line;

        try {
            line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void appendLine(PrintWriter writer, String path) {
        try {
            List<String> file = readInput(Files.newBufferedReader(Paths.get(path)));
            for (String s : file) {
                writer.append(s).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
