package L06_Defining_Classes_Lab.P03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String CREATE_COMMAND = "Create";
        final String DEPOSIT_COMMAND = "Deposit";
        final String SET_INTEREST_COMMAND = "SetInterest";
        final String GET_INTEREST_COMMAND = "GetInterest";

        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bank = new HashMap<>();

        String[] input = scanner.nextLine().split("\\s+");
        while (!input[0].equals("End")) {
            String command = input[0];
            int accountId;

            switch (command) {
                case CREATE_COMMAND:
                        BankAccount current = new BankAccount();
                    bank.put(current.getAccountId(), current);
                    System.out.printf("Account ID%d created%n", current.getAccountId());
                    break;
                case DEPOSIT_COMMAND:
                    accountId = Integer.parseInt(input[1]);
                    BankAccount account = bank.get(accountId);
                    if (bank.containsKey(accountId)) {
                        double amount = Double.parseDouble(input[2]);
                        bank.get(accountId).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, accountId);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case SET_INTEREST_COMMAND:
                    double rate = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(rate);
                    break;
                case GET_INTEREST_COMMAND:
                    int accID = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);
                    if (bank.containsKey(accID)) {
                        System.out.printf("%.2f%n", bank.get(accID).getInterestRate(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine().split("\\s+");
        }
    }
}
