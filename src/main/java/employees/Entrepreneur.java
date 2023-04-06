package employees;

public class Entrepreneur extends Person implements Payable{

    private static double revenue;
    private static double expenses;

    //Constructor
    public Entrepreneur(String name) {
        super(name);
    }

    //Setters & Getters
    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    //Assigned variable to get the name of this class
    String className = this.getClass().getSimpleName();

    @Override
    public String toString() {
        return "Entrepreneur {name is " + getName() +
                ", revenue is " + revenue +
                ", expenses are " + expenses +
                '}';
    }

    //Override Method from Person class
    @Override
    public void calculatePay() {
        double totalProfit = revenue - expenses;
        System.out.println(getName() + "'s pay is $" + totalProfit);
    }


}