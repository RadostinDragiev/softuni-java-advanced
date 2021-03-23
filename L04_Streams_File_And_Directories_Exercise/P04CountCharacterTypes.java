package L04_Streams_File_And_Directories_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class P04CountCharacterTypes {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/resources/input.txt";

        long vowels = 0;
        long consonants = 0;
        long punctuation = 0;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split("\\s+");

                for (int i = 0; i < words.length; i++) {
                    String currentWord = words[i];
                    for (int j = 0; j < currentWord.length(); j++) {
                        char currentChar = currentWord.charAt(j);
                        if (currentChar == 'a' ||
                                currentChar == 'e' ||
                                currentChar == 'i' ||
                                currentChar == 'o' ||
                                currentChar == 'u') {
                            vowels++;
                        } else if (currentChar == '.' ||
                                currentChar == '!' ||
                                currentChar == '?' ||
                                currentChar == ',') {
                            punctuation++;
                        } else {
                            consonants++;
                        }
                    }
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.printf("Vowels: %d%n", vowels);
        System.out.printf("Consonants: %d%n", consonants);
        System.out.printf("Punctuation: %d%n", punctuation);
    }
}