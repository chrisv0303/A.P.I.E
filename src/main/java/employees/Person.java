package employees;

public abstract class Person {

    private String name;
    private Cloth[] clothingProduct;

    //Constructor
    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(Cloth[] clothingProduct){
        this.clothingProduct = clothingProduct;
    }

    //Setters & Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cloth[] getClothingProduct() {
        return clothingProduct;
    }

    public void setClothingProduct(Cloth[] clothingProduct) {
        this.clothingProduct = clothingProduct;
    }

    //Construct Method from Payable Interface
    public static void printPay(Payable[] person){
        for(Payable p : person){
            p.calculatePay();
        }
    }

//    public static void printDiscount(Cloth[] clothingProduct){
//        for(Cloth c : clothingProduct){
//            c.(c);
//        }
//    }

}