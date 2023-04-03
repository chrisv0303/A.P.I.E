package employees;

public abstract class Employee extends Person {

    protected int Id;

    private static int counter = 0;

    String className = this.getClass().getSimpleName();

    public Employee(String name) {
        super(name);
        Id = ++counter;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}