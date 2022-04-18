package method;

public class ReturnTypeMethodWithoutParameter {

    public int doCalculation(){
     int price1= 20;
     int price2= 40;
     int total= price1 + price2;
        System.out.println("Total price is "+total);
        return total;
    }
public String patientInformation(){
String fName="Sony";
String lName="Mark";
String fullName= fName+" "+lName;
    System.out.println("Patient full name is "+ fullName);
 return fullName;
}
    public int getValue() {
        int bookprice = 55;
        int bookQuantity= 5;
        int totalValue=55*5;
        System.out.println("Books price are " + totalValue);

        return totalValue;
    }
    public double getGrade() {
        int grade1 = 10;
        double grade2=40;
        double grade=grade1+grade2;
        System.out.println("His grade is " + grade);

        return grade;}
    public int getSalary() {
        int weeklysalary = 2000;
        int monthlySalary=weeklysalary*4;
        System.out.println("His monthlySalary is " +weeklysalary*4);

        return weeklysalary*4;
    }

    public static void main(String[] args) {
        ReturnTypeMethodWithoutParameter Return1 = new ReturnTypeMethodWithoutParameter();
        Return1.doCalculation();
        Return1.patientInformation();
        Return1.getGrade();
        Return1.getSalary();
        Return1.getValue();
    }
}
