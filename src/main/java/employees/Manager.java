package employees;

public class Manager extends Employee{

    public Manager(String name){
        super(name);
    }

    public Manager(double discount){
        super(discount);
        discount += 5;
    }

    String className = this.getClass().getSimpleName();

    @Override
    public String printBadge() {
        return className + " : " + getName() + "\n" + "Employee ID : " + getId();
    }

}
