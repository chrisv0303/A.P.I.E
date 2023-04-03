package employees;

public class Tester {
    public static void main(String[] args) {

        hourlyEmployee Emp1 = new hourlyEmployee("Mike");
        System.out.println(Emp1.printBadge());
        Emp1.setHoursWorked(40);
        Emp1.setRate(25.0);
        System.out.println("");

        salaryEmployee Emp2 = new salaryEmployee("Lauren");
        Emp2.setSalary(4000.00);
        System.out.println(Emp2.printBadge());
        System.out.println("");

        Entrepreneur manager = new Entrepreneur("Billy");
        manager.setRevenue(10000.00);
        manager.setExpenses(600.00);
        System.out.println(manager.toString());
        System.out.println("");

        Person[] payArray = {Emp1, Emp2, manager};
        Person.printPayForAll(payArray);
    }
}
