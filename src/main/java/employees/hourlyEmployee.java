package employees;

public class hourlyEmployee extends Employee {

    private static int hoursWorked;
    private static double rate;


    public hourlyEmployee(String name) {
        super(name);
    }

    String className = this.getClass().getSimpleName();

    public String printBadge(){
        return className + " : " + name + "\n" + "Employee ID : " + Id;
    }

    @Override
    public void printPay() {
        double totalProfit = hoursWorked * rate;
        System.out.println("Hourly Employee's pay is $" + totalProfit);
    }

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

}
