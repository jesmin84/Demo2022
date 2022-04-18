package method;

import java.util.Scanner;

public class Calculator {
    public int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public int doAddition(int num4, int num5) {
        return num4 + num5;
    }

    public int doSubtraction(int number7, int number8) {
        return number7 - number8;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num3 = calculator.getMultiplication(20, 20);
        System.out.println("Num3 value : " + num3);
        int num6 = calculator.doAddition(60, 40);
        System.out.println("Num6 value : " + num6);
        int num9 = calculator.doSubtraction(90, 70);
        System.out.println("Num9 value : " + num9);

        System.out.println("**************************************************************************");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = input.nextInt();
        System.out.println("Enter num2");
        int num2 = input.nextInt();
        System.out.println("Addition value : " + (num1 + num2));
        System.out.println("Subtraction value : " + (num1 - num2));
        System.out.println("Multiplication value : " + (num1 * num2));
        System.out.println("Division value : " + num1 / num2);

    }
}
