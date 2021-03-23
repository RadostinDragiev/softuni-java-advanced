package L03_Sets_And_Maps_Advanced_Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P03VoinaNumbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayer = inputReader(scanner);
        Set<Integer> secondPlayer = inputReader(scanner);

        int counter = 0;
        while (counter < 50) {
            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);
            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            } else if (secondNumber > firstNumber){
                secondPlayer.add(firstNumber);
                secondPlayer.add(secondNumber);
            }

            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                break;
            }

            counter++;
        }

        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player win!");
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }

    private static Set<Integer> inputReader(Scanner scanner) {
        Set<Integer> input = new LinkedHashSet<>();
        for (int i = 0; i < 20; i++) {
            input.add(scanner.nextInt());
        }
        System.out.println();

        return input;
    }
}
