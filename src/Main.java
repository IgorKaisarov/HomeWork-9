import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println(" Task 1 ");

        int[] job = new int[5];
        job[0] = 10_000;
        job[1] = 5_000;
        job[2] = 21_000;
        job[3] = 8_000;
        job[4] = 14_500;
        int sum = 0;

        for (int k = 0; k < job.length; k++) {
            sum += job[k];
        }
        System.out.println(" Сумма трат за месяц составила " + sum + " рублей. ");

        // Task 2
        System.out.println(" Task 2 ");

        int[] salary = {20_000, 50_000, 15_000, 75_000, 160_000};
        int maxSalary = -1;
        for (int index = 0; index < salary.length; index++) {
            if (salary[index] > maxSalary) {
                maxSalary = salary[index];
            }
        }
        System.out.println(maxSalary);
        int minSalary = Integer.MAX_VALUE;
        for (int key = 0; key < salary.length; key++) {
            if (salary[key] < minSalary) {
                minSalary = salary[key];
            }
        }
        System.out.println(minSalary);

        // Task 3
        System.out.println(" Task 3 ");

        int[] accountant = new int[5];
        accountant[0] = 75_300;
        accountant[1] = 98_154;
        accountant[2] = 134_776;
        accountant[3] = 99_000;
        accountant[4] = 195_991;
        double middle = 0;
        for (int number = 0; number < accountant.length; number++) {
        middle += accountant[number];
        }
        middle = middle / 5.0;
        System.out.println(" Средняя сумма трат за месяц составила " + middle + " рублей ");

        // Task 4
        System.out.println(" Task 4 ");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};







    }
}
