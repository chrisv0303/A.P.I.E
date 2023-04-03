package employees;

public abstract class Person {

    protected static String name;

    public abstract void printPay();

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printPayForAll(Person[] person){
        for(Person p : person){
            p.printPay();
        }
    }
}