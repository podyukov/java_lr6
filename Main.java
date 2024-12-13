import java.util.*;


public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\n> Введите номер задания (1.1 это 11) (0 для выхода): ");
            int num = intInputer();
            if (num == 0) break;
            switch (num) {
                case 21: {
                    Ex21 ex21 = new Ex21();
                    ex21.start();
                    break;
                }
                case 22: {
                    Ex22 ex22 = new Ex22();
                    ex22.start();
                    break;
                }
                case 23: {
                    Ex23 ex23 = new Ex23();
                    ex23.start();
                    System.out.println(ex23);
                    break;
                }
                case 24: {
                    Ex24 ex24 = new Ex24();
                    ex24.start();
                    break;
                }
                case 25: {
                    Ex25 ex35 = new Ex25();
                    ex35.start();
                    break;
                }
                case 26: {
                    Ex26 ex26 = new Ex26();
                    ex26.start();
                    break;
                }
                default: {
                    System.out.println("Неверный номер задачи!");
                }
            }
        }
    }

    private static int intInputer() {
        int i;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("\n>>> ");
                i = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите корректное целое число.");
                scanner.next();
                continue;
            }
            return i;
        }
    }
}
