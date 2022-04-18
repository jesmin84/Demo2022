package method;

public class ReturnTypeMethodWithParameter {
    public String ticketInformation(String passengerName, int ticketNumber) {
        System.out.println("Passenger name is " + passengerName + '\n' + "Passenger ticket Number is " + ticketNumber);
        return passengerName;
    }

    public int getCalculation(int num1, int num2) {
        System.out.println("multiplication value is " + num1 * num2);
        return num1 * num2;
    }

    public double doSubtraction(double cost1, double cost2) {
        return cost1 - cost2;
    }

    public int doSummation(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public boolean isTopsAvailable(String topsBrandName, char size, int price, boolean isAvailable) {
        System.out.println("Tops brand name : " + topsBrandName + '\n' + "Tops size: " + size + '\n' + "Tops price: " + price + '\n' + "Availability: " + isAvailable);
        return isAvailable;
    }

    public static void main(String[] args) {
        ReturnTypeMethodWithParameter Return2 = new ReturnTypeMethodWithParameter();
        Return2.ticketInformation("Munmun", 102);
        Return2.getCalculation(40, 20);
        System.out.println("Subtraction value: " + Return2.doSubtraction(80, 50));
        System.out.println("Addition value : " + (Return2.doSummation(40, 50, 80)));
        Return2.isTopsAvailable("H&M", 'M', 20, true);
    }
}
