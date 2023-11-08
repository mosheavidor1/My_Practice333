package practices.parctice6;

import java.util.Scanner;

interface Constants {
    int ILS = 1;
    int USD = 2;
}

abstract class Coin {
    abstract double getRate();

    double exchange(double amount) {
        return amount * getRate();
    }
}

class Shekel extends Coin {
    double getRate() {
        return 1 / 3.5;
    }
}

class Dollar extends Coin {
    double getRate() {
        return 3.5;
    }
}

public class ExchangeCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Exchange Currency Game!");

        boolean keepPlaying = true;
        do {
            System.out.println("Enter 1 for exchange from dollar to shekel, or 2 from shekel to dollar:");
            int option = scanner.nextInt();

            Coin coin;
            if (option == Constants.USD) {
                coin = new Dollar();
                System.out.print("Enter the amount in dollars: ");
            } else {
                coin = new Shekel();
                System.out.print("Enter the amount in shekels: ");
            }

            double amount = scanner.nextDouble();
            double exchangedAmount = coin.exchange(amount);

            if (option == Constants.USD) {
                System.out.printf("%.2f USD is %.2f ILS%n", amount, exchangedAmount);
            } else {
                System.out.printf("%.2f ILS is %.2f USD%n", amount, exchangedAmount);
            }

            System.out.print("Do you want to continue playing? (yes/no) ");
            String answer = scanner.next();
            keepPlaying = answer.equalsIgnoreCase("yes");
        } while (keepPlaying);

        System.out.println("Thank you for playing! See you next time.");
    }
}
