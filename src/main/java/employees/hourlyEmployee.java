package employees;

public class hourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public hourlyEmployee(String name, int ID, double hoursWorked, double hourlyRate){
        super(name, ID);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay(){
        return hoursWorked * hourlyRate;
    }

}
