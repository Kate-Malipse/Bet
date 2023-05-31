import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Here few tasks to choose:%n" +
                "1 task: Method for calculating the sum of numbers.%n" +
                "2 task: Output numbers from 1 to 5.%n" +
                "3 task: Output numbers from 5 to 1.%n" +
                "4 task: Output multiplication table for 3.%n" +
                "5 task: Output minimum, maximum and average value of random numbers array.%n" +
                "6 task: Method for output a string in reverse order.%n");
        System.out.println();
        System.out.print("Please enter the task number from 1 to 6: ");

        int taskNumber = sc.nextInt();
        sc.nextLine(); // to avoid empty input

        System.out.printf("| %d task was chosen |%n", taskNumber);
        switch (taskNumber) {
            case 1 -> {
                System.out.print("Please enter the first number to add: ");
                int x = sc.nextInt();
                System.out.print("Please enter the second number to add: ");
                int y = sc.nextInt();
                System.out.println("The result of addition is " + Numbers.sum(x, y));
            }
            case 2 -> {
                System.out.println("Numbers from 1 to 5 are displayed:");
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
            case 3 -> {
                System.out.println("Numbers from 5 to 1 are displayed:");
                for (int i = 5; i >= 1; i--) {
                    System.out.print(i + " ");
                }
            }
            case 4 -> {
                System.out.println("Multiplication table for 3:");
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("3*%d=%d%n", i, i * 3);
                }
            }
            case 5 -> {
                Random rand = new Random();
                int[] numbers = new int[10];
                System.out.print("Array: ");
                for (int i = 0; i < numbers.length; i++) {
                    int randomNum = rand.nextInt(100);
                    numbers[i] = randomNum;
                    System.out.print(numbers[i] + " ");
                }
                System.out.printf("%nMaximum: %d, Minimum: %d, Average: %3.1f", Array.max(numbers), Array.min(numbers), Array.average(numbers));
            }
            case 6 -> {
                System.out.print("Please enter any string: ");
                String str = sc.nextLine();
                String reverseLine = Line.reverse(str);
                System.out.print("Result of string reversal: " + reverseLine);
            }
            default -> System.out.print("Incorrect task number");
        }
    }
}
