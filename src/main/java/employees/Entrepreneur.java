package employees;

public class Entrepreneur extends Person {

    private static double revenue;
    private static double expenses;

    public Entrepreneur(String name) {
        super(name);
    }

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

    String className = this.getClass().getSimpleName();

    @Override
    public void printPay(){
        double totalProfit = revenue - expenses;
        System.out.println("Entrepreneur's pay is $" + totalProfit);
    }

    @Override
    public String toString() {
        return "Entrepreneur {name is " + name +
                ", revenue is " + revenue +
                ", expenses are " + expenses +
                '}';
    }
}