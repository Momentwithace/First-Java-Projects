package testDriller;

public class TestDrillerUtme {
    public int numberOfCopies(int noOfCopies) {
        int price = 0;
        if(noOfCopies > 0 && noOfCopies <=4) price = 2000 * noOfCopies;
        if(noOfCopies >= 5 && noOfCopies <= 9) price = 1800 * noOfCopies;
        if(noOfCopies >= 10 && noOfCopies <= 29) price = 1600 * noOfCopies;
        if(noOfCopies >= 30 && noOfCopies <= 49) price = 1500 * noOfCopies;
        if(noOfCopies >= 50 && noOfCopies <= 99) price = 1300 * noOfCopies;
        if(noOfCopies >= 100 && noOfCopies <= 199) price = 1200 * noOfCopies;
        if(noOfCopies >= 200 && noOfCopies <= 499) price = 1100 * noOfCopies;
        if(noOfCopies > 500) price = 1000 * noOfCopies;

        return price;

    }
}
