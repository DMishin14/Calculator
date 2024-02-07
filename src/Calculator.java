import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа от  1 до  10 и арифметическое действие через пробел");

        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        if (parts.length !=  3) {
            throw new IllegalArgumentException("Неверный формат выражения");
        }

        int a = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int b = Integer.parseInt(parts[2]);

        if (a <  1 || a >  10 || b <  1 || b >  10) {
            throw new IllegalArgumentException("Числа должны быть от  1 до  10");
        }

        int result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b ==  0) {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
                result = a / b;
                break;
            default:
                throw new IllegalArgumentException("Недопустимая операция: " + operator);
        }

        System.out.println("Результат: " + result);
    }
}