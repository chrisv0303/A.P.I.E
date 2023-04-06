package employees;

public abstract class Employee extends Person {

    private int Id;

    private static int counter = 0;

    private double discount = 0.10;

    //Constructor
    public Employee(String name) {
        super(name);
        Id = ++counter;
    }

    public Employee(double discount){
        this.discount = discount;
    }


    //Method
    public abstract String printBadge();

    //Getters & Setters
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

}