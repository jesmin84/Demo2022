package method;

public class NonReturnTypeMethodWithoutParameter {

    public void mobileScreen(){
        System.out.println("This is my mobile screen method");
    }
    public void getStudentInformation() {
        String studentName = "James";
        int monthlyFee = 2000;
        int yearlyFee = 12 * monthlyFee;
        System.out.println(studentName + " " + "yearly Fee is " + yearlyFee);
    }
    public void getSalary() {
        double perHour = 50;
        double weeklyHours = 40;
        double weeklySalary = 50 * 40;
        System.out.println("Weekly salary is " + weeklySalary);
    }
    public void getCost(){
        int cost1=500;
        int cost2=5000;
        int totalCost=cost1+cost2;
        System.out.println("Total cost is :"+" "+totalCost);
    }
    public void getPassengerInfo(){
        String passengerName="Munmun";
        int passengerTicketNumber=104;
        System.out.println("Passenger name is : "+passengerName+'\n' +"Passenger ticket number is : "+passengerTicketNumber);
    }

    public static void main(String[] args) {
        NonReturnTypeMethodWithoutParameter nonReturnTypeMethodWithoutParameter=new NonReturnTypeMethodWithoutParameter();
        nonReturnTypeMethodWithoutParameter.mobileScreen();
        nonReturnTypeMethodWithoutParameter.getStudentInformation();
        nonReturnTypeMethodWithoutParameter.getSalary();
        nonReturnTypeMethodWithoutParameter.getCost();
        nonReturnTypeMethodWithoutParameter.getPassengerInfo();
    }
}
