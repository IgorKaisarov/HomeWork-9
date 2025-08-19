
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




    }
}