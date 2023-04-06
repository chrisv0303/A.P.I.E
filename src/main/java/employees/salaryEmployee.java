package employees;

public class salaryEmployee extends Employee implements Payable{

    private static double salary;

    //Constructor
    public salaryEmployee(String name) {
        super(name);
    }

    //Setters & Getters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
        System.out.println(getName() + "'s pay is $" + salary);
    }
}
