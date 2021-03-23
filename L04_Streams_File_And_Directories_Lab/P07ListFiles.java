package L04_Streams_File_And_Directories_Lab;

import java.io.File;
import java.io.IOException;

public class P07ListFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("04. Java-Advanced-Files-and-Streams-Lab-Resources/Files-and-Streams");

        File[] files = file.listFiles();

        for (File f : files) {
            if (!f.isDirectory()) {
                System.out.printf("%s: [%d]%n", f.getName(), f.length());
            }
        }
    }
}
