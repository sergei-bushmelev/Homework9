import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payments = {12, 15, 30, 25, 23};
        int sum = 0;
        for (int i : payments) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("Задача 2");
        int[] weeklyExpenses = {100, 110, 200, 210, 315};
        int maxSpending = 0;
        int minSpending = weeklyExpenses[0];
        for (int i = 0; i < weeklyExpenses.length; i++) {
            if (weeklyExpenses[i] > maxSpending) {
                maxSpending = weeklyExpenses[i];
            }
        }
        for (int i = 0; i < weeklyExpenses.length; i++) {
            if (weeklyExpenses[i] < minSpending) {
                minSpending = weeklyExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. Максимальная сумма трат за неделю составила " + maxSpending + " рублей");
        System.out.println();

        System.out.println("Задача 3");
        double[] weeklyReport = {20, 22, 56, 80, 44};
        double sumSpending = 0;
        double averageSpending;
        for (int i = 0; i < weeklyReport.length; i++) {
            sumSpending += weeklyReport[i];
        }
        averageSpending = sumSpending / weeklyReport.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}