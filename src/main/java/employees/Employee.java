package employees;

public class Employee {

    private int ID;
    private String name;

    public Employee (String name, int ID){
        this.ID = ID;
        this.name = name;
    }

    public static void printBadge(){
        System.out.println(uniqueID);
    }

    private static int uniqueID = 0;

    public Employee(){
        ID = ++uniqueID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
