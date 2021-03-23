package L01_Stacks_And_Queues_Exercises;

import java.util.*;

public class P05Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotsInput = scanner.nextLine().split(";");

        Map<String, Integer> robots = new LinkedHashMap<>();
        for (String s : robotsInput) {
            String[] tempArr = s.split("-");
            robots.put(tempArr[0], Integer.parseInt(tempArr[1]));
        }

        int[] time = Arrays.stream(scanner.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<String> queueOfProducts = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            queueOfProducts.offer(input);
            input = scanner.nextLine();
        }

        long timeInSeconds = ((time[0] * 60) * 60) + (time[1] * 60) + time[2];

        ArrayDeque<String> freeRobots = new ArrayDeque<>();
        for (Map.Entry<String, Integer> entry : robots.entrySet()) {
            freeRobots.offer(entry.getKey());
        }
        ArrayDeque<String> busyRobots = new ArrayDeque<>();
        long timeInSecond = 1;
        while (!queueOfProducts.isEmpty()) {
            if (!freeRobots.isEmpty()) {
                long tempTime = timeInSeconds;
                tempTime += timeInSecond;
                long hours = (tempTime / 60) / 60;
                tempTime -= ((hours * 60) * 60);
                long minutes = (tempTime / 60);
                tempTime -= (minutes * 60);

                String robotName = freeRobots.poll();
                System.out.printf("%s - %s [%02d:%02d:%02d]%n", robotName, queueOfProducts.poll(),
                        hours, minutes, tempTime);
            } else {
                String product = queueOfProducts.poll();
                queueOfProducts.offer(product);

                long finalTimeInSecond = timeInSecond;
                robots.entrySet().stream().forEach(e -> {
                    if (finalTimeInSecond % e.getValue() == 0) {
                        freeRobots.offer(e.getKey());
                    } else {
                        busyRobots.offer(e.getKey());
                    }
                });
            }

            timeInSecond++;
        }
    }
}
