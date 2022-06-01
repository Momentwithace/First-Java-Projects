package Chapter3;

public class HeartRateCalculator {
    //(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
    //that your heart rate stays within a safe range suggested by your trainers and doctors. According to
    // the American Heart Association (AHA) ( http://bit.ly/TargetHeartRates ), the formula for cal-
    //culating your maximum heart rate in beats per minute is 220 minus your age in years. Your target
    //heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates
    //provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
    //gender of the individual. Always consult a physician or qualified health-care professional before
    //beginning or modifying an exercise program.] Create a class called HeartRates . The class attributes
    //should include the person’s first name, last name and date of birth (consisting of separate attributes
    //for the month, day and year of birth). Your class should have a constructor that receives this data as
    //parameters. For each attribute provide set and get methods. The class also should include a method
    //that calculates and returns the person’s age (in years), a method that calculates and returns the per-
    //son’s maximum heart rate and a method that calculates and returns the person’s target heart rate.
    //Write a Java app that prompts for the person’s information, instantiates an object of class Heart-
    //Rates and prints the information from that object—including the person’s first name, last name and
    //date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target-
    //heart-rate range.

    private String firstName;
    private String lastname;
    private int year;
    private int month;
    private int day;

    public HeartRateCalculator(String firstName, String lastname, int year, int month, int day) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setFirstName(String firstName) {this.firstName = firstName; }

    public void setLastname(String lastname) { this.lastname = lastname; }

    public void setYear(int year) { this.year = year;
    }

    public void setMonth(int month) {this.month = month;}

    public void setDay(int day) {this.day = day;}

    public String getLastname() {return lastname;}

    public int getYear() {return year;}

    public int getMonth() {return month;}

    public int getDay() {return day;}

    public String getFirstName() {return firstName;}

    public int getAge(){
        int currentYear = 2022;
        int age;
        age = currentYear - getYear();
        return age;}

    public int getMaximumHeartRate(){
        int maximumHeartRate;
        int heartBeatPerMinute = 220;
        maximumHeartRate = heartBeatPerMinute - getAge();
        return maximumHeartRate;
    }

    public int targetHeartRate(){
        int targetHeartRate;
        targetHeartRate = getMaximumHeartRate() * 50 / 100;
        return targetHeartRate;
    }


    public int targetHeartRate2(){
        int targetHeartRate2;
        targetHeartRate2 = getMaximumHeartRate() * 85 / 100;
        return targetHeartRate2;
    }

}
