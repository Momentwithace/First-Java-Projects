package Chapter3;

public class PetroPurchase {
  //  Create a class called PetrolPurchase to represent information
    // about the petrol you purchase.
    // The class should include five pieces of information in the form of
    //instance variables—the station’s location (type String ), the type of petrol (type String ), the quality
    // (type int ) of the purchase in liters, the price per liter ( double ), and the percentage discount
    //( double ). Your class should have a constructor that initializes the five instance variables. Provide a
    //set and a get method for each instance variable. In addition, provide a method named getPurchase-
    //Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
    //minus the discount, then returns the net amount you had to pay as a double value. Write an application
    //class named Petrol that demonstrates the capabilities of class PetrolPurchase .

    String location;
    String type;
    private int quality;
    private double discount;
    private double liter;
    double purchaseAmount;

    public PetroPurchase(String location, String type, int quality, double discount, double liter, double purchaseAmount) {
        this.location = location;
        this.type = type;
        this.quality = quality;
        this.discount = discount;
        this.liter = liter;
        this.purchaseAmount = purchaseAmount;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setQuality(int quality){
        this.quality = quality;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public void setLiter(double liter){
        this.liter = liter;
    }

    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }
    public int getQuality(){return quality;}
    public double getDiscount(){
        return discount;
    }
    public double getLiter(){
        return liter;
    }


    public double getPurchaseAmount(){
      return purchaseAmount = quality *  liter - discount;
    }
}
