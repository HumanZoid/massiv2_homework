import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Задание № 1");
        int[] main_massiv = generateRandomArray();
//        System.out.println(Arrays.toString(main_massiv));
        int sum_salary = 0;
        for (int sum : main_massiv) {
            sum_salary += sum;
        }
        System.out.println("Сумма трат за месяц составила " + sum_salary + " рублей");

        System.out.println("Задание № 2");
        int min = main_massiv[0];
        int max = main_massiv[0];
        for (int item:main_massiv) {
            if (item > max) {
                max = item;
                if (item < min) {
                    min = item;
                }
            }
        }
        System.out.println("Минимальная сумма затрат за день составила " + min);
        System.out.println("Максимальная сумма затрат за день составила " + max);

        System.out.println("Задание № 3");
        int salary = 0;
        for (int sum : main_massiv) {
            salary += sum;
        }
        System.out.println("Средняя сумма трат за месяц составила " + salary/main_massiv.length + " рублей");
        System.out.println(" Задание № 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i-- ) {
            System.out.print(reverseFullName[i]);

        }

    }
}
