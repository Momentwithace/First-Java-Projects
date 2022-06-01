package Chapter3;

public class House {
    //creating constructors with two parameters
    // and then creating an instance of that
    // object with no parameter
    int numbersOfDoors;
    int numbersOfWindows;

    public House (int numbersOfDoors, int numbersOfWindows ){
        this.numbersOfDoors = numbersOfDoors;
        this.numbersOfWindows = numbersOfWindows;
    }

    public void setNumbersOfDoors(int numbersOfDoors){
        this.numbersOfDoors = numbersOfDoors;
    }

    public void setNumbersOfWindows(int numbersOfWindows){
        this.numbersOfWindows = numbersOfWindows;
    }
    public int getNumbersOfDoors(int numbersOfDoors){
        return numbersOfDoors;
    }

    public int getNumbersOfWindows(int numbersOfWindows){
        return numbersOfWindows;
    }
}
