package employees;

public class Cloth {

    private String description;
    private double price;

    //Constructor
    public Cloth(String description, double price){
        this.description = description;
        this.price = price;
    }

    //Setters and Getters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
