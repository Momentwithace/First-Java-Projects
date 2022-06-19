package Chapter4;

public class GasMileage {
    double totalMiles;
    double totalGallons;

    public double getTripMPG(int miles, int gallons){
        totalMiles += miles;
        totalGallons += gallons;
        return miles / (double)gallons;
    }

    public double getTotalMiles(){
        return totalMiles;
    }

    public double getTotalGallons() {
        return totalGallons;
    }
    public double getTotalMPG(){
        return totalMiles / totalGallons;
    }
}
