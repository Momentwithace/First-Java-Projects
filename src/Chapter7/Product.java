package Chapter7;

public class Product {

    private String productName;
    private int productUnit;

    private double pricePerUnit;

    public void setProductName(String productName) {
        this.productName=productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductUnit(int productUnit) {
        this.productUnit=productUnit;
    }

    public int getProductUnit() {
        return productUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit=pricePerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getPriceOnEachProduct() {
        return pricePerUnit*productUnit;
    }
}
