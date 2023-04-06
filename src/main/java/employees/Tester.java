package employees;

public class Tester {

    public static void main(String[] args) {

        hourlyEmployee Emp1 = new hourlyEmployee("David");
        Cloth clothingItem1 = new Cloth("Polo shirt", 40.0);
        System.out.println(Emp1.printBadge());
        Emp1.setHoursWorked(40);
        Emp1.setRate(25.0);
        System.out.println("");

        salaryEmployee Emp2 = new salaryEmployee("Lauren");
        Cloth clothingItem2 = new Cloth("blouse", 55.0);
        Emp2.setSalary(4000.00);
        System.out.println(Emp2.printBadge());
        System.out.println("");

        Entrepreneur boss = new Entrepreneur("Billy");
        Cloth clothingItem3 = new Cloth("Dress suit", 159.0);
        boss.setRevenue(10000.00);
        boss.setExpenses(600.00);
        System.out.println(boss.toString());
        System.out.println("");

        Employee manager = new Manager("Jessica");
        Cloth clothingItem4 = new Cloth("skirt", 49.0);
        System.out.println(manager.printBadge());
        System.out.println("");


        Payable[] payArray = {Emp1, Emp2, boss};
        Person.printPay(payArray);

    }
}
