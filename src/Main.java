import java.util.Scanner;

/*
* Задание 1:
Создать метод принимающий на вход две переменные типа int.
Метод вычисляет их сумму и возвращает значение.
Вызвать этот метод из метода main.

Задание 2:
Используя цикл выведи в консоль числа от 1 до 5. На экране должно быть:
1 2 3 4 5 (именно в строку)

Задание 3:
Используя цикл выведи в консоль числа от 5 до 1. На экране должно быть:
5 4 3 2 1 (именно в строку)

Задание 4: Необходимо вывести на экран таблицу умножения на 3:
* 3*1=3
* 3*2=6
* 3*3=9
* 3*4=12
* 3*5=15
* 3*6=18
* 3*7=21
* 3*8=24
* 3*9=27
* 3*10=30

Задание 5: Заполни массив случайным числами и выведите максимальное, минимальное и среднее значение

Задание 6: Напиши метод, который запрашивает у пользователя строку текста и выводит её в обратном порядке.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the task number from 1 to 6: ");

        int taskNumber = sc.nextInt();
        if (taskNumber < 1 || taskNumber > 6) {
            System.out.print("Incorrect task number");
        } else {
            System.out.printf("| %d task was chosen |%n", taskNumber);
            switch (taskNumber) {
                case 1:
                    System.out.print("Please enter first number to add: ");
                    int x = sc.nextInt();
                    System.out.print("Please enter second number to add: ");
                    int y = sc.nextInt();
                    Addition.sum(x, y);
                    break;
                case 2:
                    System.out.println("Numbers from 1 to 5 are displayed:");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print(i + " ");
                    }
                    break;
                case 3:
                    System.out.println("Numbers from 5 to 1 are displayed:");
                    for (int i = 5; i >= 1; i--) {
                        System.out.print(i + " ");
                    }
                    break;
                case 4:
                    System.out.println("Multiplication table for 3:");
                    for (int i = 1; i <=10; i++) {
                        System.out.printf("3*%d=%d%n", i, i*3);
                    }
                    break;
                case 5:

                    break;
                case 6:
                    break;
            }
        }
    }
}