package lessonCalculator;

import java.util.Scanner;

public class Calculator {

    private float number1;
    private float number2;
    private String operator;
    private float result;
    private String calcRecursively;

    public Calculator() {
        System.out.println("Калькулятор создан");
    }

    ;

    public void calcConsole() throws Exception {

        try {
            System.out.println("Введите первое число");
            number1 = Float.parseFloat(new Scanner(System.in).nextLine());

            System.out.println("Ведите опрерацию");
            String operator = new Scanner(System.in).nextLine();

            System.out.println("Введите второе число");
            number2 = Float.parseFloat(new Scanner(System.in).nextLine());

            float result = getResult(number1, number2, operator);
            System.out.println("Результат: " + result);

            System.out.println("---------------------------------------");

            calcRecursively();

        } catch (Exception e) {
            System.out.println("Ошибка :" + e.getMessage());
        }

    }

    private float getResult(float number1, float number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private void calcRecursively() throws Exception {
        System.out.println("ПРОДОЛЖИТЬ ВЫЧИСЛЕНИЯ? Введите '+' для продолжения или '-' для завершения:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("+")) {
            calcConsole(); // Предполагается, что calcConsole() выполняет следующую операцию.
        } else if (input.equals("-")) {
            System.out.println("Вычисления завершены.");
        } else {
            System.out.println("Знак не распознан, повторите ввод.");
            calcRecursively();
        }
    }

}
