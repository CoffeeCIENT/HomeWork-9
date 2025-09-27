//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-Задача 1:");
        int[] expenses = {5000, 4300, 2700, 3750, 6100};
        int sumExp = 0;
        for (int i : expenses) {
            sumExp += i;
        }
        System.out.println("Сумма трат за месяц составила " + sumExp + " рублей.");

        System.out.println("-Задача 2:");
        int[] expenses2 = {4300, 3750, 6200, 4900, 2300};
        int maxExpenses2 = -1;
        for (final int current : expenses2) {
            if (current > maxExpenses2) {
                maxExpenses2 = current;
            }
        }
        int minExpenses2 = maxExpenses2;
        for (final int current : expenses2) {
            if (current < minExpenses2) {
                minExpenses2 = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses2 + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses2 + " рублей.");

        System.out.println("-Задача 3:");
        int[] expenses3 = {5046, 4750, 2340, 1754, 4327};
        float sumExp2 = 0;
        for (int i : expenses3) {
            sumExp2 += i;
        }
        float averageValue = sumExp2 / expenses3.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей.");

        System.out.println("-Задача 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int current = 0; current < reverseFullName.length / 2; current++) {
            char temporary = reverseFullName[current];
            reverseFullName[current] = reverseFullName[reverseFullName.length - 1 - current];
            reverseFullName[reverseFullName.length - 1 - current] = temporary;
        }
        for (char conclusion : reverseFullName) {
            System.out.print(conclusion);
        }
    }
}