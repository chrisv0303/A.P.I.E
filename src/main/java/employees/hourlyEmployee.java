package employees;

public class hourlyEmployee extends Employee implements Payable{

    private static int hoursWorked;
    private static double rate;

    //Constructor
    public hourlyEmployee(String name) {
        super(name);
    }

    //Setters & Getters
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //Assigned variable to get the name of this class
    String className = this.getClass().getSimpleName();

    //Override Method from Employee class
    @Override
    public String printBadge(){
        return className + " : " + getName() + "\n" + "Employee ID : " + getId();
    }

    //Override Method from Person class
    @Override
    public void calculatePay() {
        double totalProfit = hoursWorked * rate;
        System.out.println(getName()+ "'s pay is $" + totalProfit);
    }
}