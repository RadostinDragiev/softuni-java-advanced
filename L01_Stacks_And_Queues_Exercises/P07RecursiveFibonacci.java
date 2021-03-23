package L01_Stacks_And_Queues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> fibonacci = new ArrayDeque<>();
        fibonacci.push(1L);
        fibonacci.push(1L);
        while (num-- > 1) {
            long a = fibonacci.pop();
            long b = fibonacci.pop();
            long c = a + b;
            fibonacci.push(b);
            fibonacci.push(a);
            fibonacci.push(c);
        }

        System.out.println(fibonacci.peek());
    }
}
