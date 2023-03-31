package employees;

public class salaryEmployee extends Employee {

    public salaryEmployee(String name, int ID, double salary){
        super(name, ID);
        this.salary = salary;
    }

    private double salary;

}
