package method;

public class NonReturnTypeMethodWithParameter {
    public void doSummation(double num1, double num2) {
        double total = num1 + num2;
        System.out.println("Total summation value : " + total);
    }

    public void yearlySalaryCalculation(double perHourSalary, int weekltHours) {
        double weeklySalary = perHourSalary * weekltHours;
        double monthlySalary = 4 * weeklySalary;
        double yearlySalary = monthlySalary * 12;
        System.out.println("Yearly salary : " + yearlySalary);
    }

    public void doMultiplication(int num1, int num2, int num3) {
        int multiply = num1 * num2 * num3;
        System.out.println("Multiplication value is : " + multiply);
    }

    public void doSubtraction(int num1, int num2, int num3, int num4) {
        int sub = num4 - num3 - num2 - num1;
        System.out.println("Subtraction value is : " + sub);
    }

    public void doDivision(int num1, int num2, int num3) {
        int div = num1 / num2 / num3;
        System.out.println("Division value is : " + div);
    }

    public static void main(String[] args) {
        NonReturnTypeMethodWithParameter nonReturnTypeMethodWithParameter = new NonReturnTypeMethodWithParameter();
        nonReturnTypeMethodWithParameter.doSummation(600, 550);
        nonReturnTypeMethodWithParameter.yearlySalaryCalculation(50, 40);
        nonReturnTypeMethodWithParameter.doMultiplication(20, 30, 40);
        nonReturnTypeMethodWithParameter.doSubtraction(10, 20, 30, 95);
        nonReturnTypeMethodWithParameter.doDivision(5000, 500, 10);
    }
}
