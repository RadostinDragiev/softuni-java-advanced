package L04_Streams_File_And_Directories_Exercise;

import java.io.File;

public class P08GetFolderSize {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/resources/Exercises Resources";
        File file = new File(path);

        File[] files = file.listFiles();
        int fileSize = 0;
        for (File f : files) {
            fileSize += f.length();
        }

        System.out.printf("Folder size: %d%n", fileSize);
    }
}
