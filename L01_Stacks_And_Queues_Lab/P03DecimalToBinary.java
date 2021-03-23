package L01_Stacks_And_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> result = new ArrayDeque<>();
        while (inputNumber != 0) {
            result.push(inputNumber % 2);
            inputNumber /= 2;
        }

        if (result.isEmpty()) {
            System.out.println(0);
        } else {
            result.forEach(System.out::print);
        }
    }
}
