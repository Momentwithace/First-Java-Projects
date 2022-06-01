package Chapter8;

public class RectangleClass {

    private double length = 1;
    private double width = 1;


    public void setLength(double length) {
        if(length < 0.0 || length > 20.0){
          throw new IllegalArgumentException("Wrong Input");

        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width < 0.0 || length > 20.0){
            throw new IllegalArgumentException("Wrong Input");

        }
        this.width = width;
    }


    public double perimeterCalculator() {
        return 2 * (length + width);
    }

    public double areaCalculator() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
