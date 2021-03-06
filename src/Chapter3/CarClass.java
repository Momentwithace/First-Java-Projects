package Chapter3;

public class CarClass {
    //( Car Class) Create a class called Car that includes three instance variables—a model type string
    //a year (type String ), and a price ( double ). Provide a constructor that initializes the three
    //instance variables. Provide a set and a get method for each instance variable. If the price is not positive,
    //do not set its value. Write a test application named CarApplication that demonstrates class Car ’s
    //capabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the
    //price of the first car and a 7% discount on the price of the second. Display each Car ’s price again.

    private String model;
    private String year;
    private double price;
    private double discount;
    public CarClass(String model, String year, double price , double discount) {
        this.model = model;
        this.year = year;
        if(price > 0.0) {
            this.price = price;
        }
        this.discount = discount;

    }
    public void setModel(String model) {this.model = model;}

    public String getModel() {return model;}

    public void setYear(String year) {this.year = year;}

    public String getYear() {return year;}

    public void setPrice(double price) {
        this.price = price * discount / 100;
    }

    public double getPrice() {return price;}

    public void setDiscount(double discount) {this.discount = discount;}

    public double getDiscount(){
        return discount;
    }
}
