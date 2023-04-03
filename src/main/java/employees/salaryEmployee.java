package employees;

public class salaryEmployee extends Employee {

    private static double salary;

    public salaryEmployee(String name) {
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    String className = this.getClass().getSimpleName();

    public String printBadge(){
        return className + " : " + name + "\n" + "Employee ID : " + Id;
    }

    @Override
    public void printPay() {
        System.out.println("Salary Employee's pay is $" + salary);
    }
}
