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
    }
}
