package Chapter3;

public class HealthRecord {
    //(Computerization of Health Records) A health-care issue that has been in the news lately is
    //the computerization of health records. This possibility is being approached cautiously because of
    //sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
    //Computerizing health records could make it easier for patients to share their health profiles and his-
    //tories among their various health-care professionals. This could improve the quality of health care,
    //help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
    //save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attri-
    //butes should include the person’s first name, last name, gender, date of birth (consisting of separate
    //attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
    //should have a constructor that receives this data. For each attribute, provide set and get methods.
    //The class also should include methods that calculate and return the user’s age in years, maximum
    //heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
    //Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
    //class HealthProfile for that person and prints the information from that object—including the per-
    //son’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
    //person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
    //the BMI values chart from Exercise 2.33.

    private String firstName;
    private String lastName;
    private String gender;
    private int year;
    private int month;
    private int day;
    private double height;
    private double weight;

    public HealthRecord(String firstName, String lastName, String gender, int year, int month, int day, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.year = year;
        this.month = month;
        this.day = day;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(String firstName) { this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName; }

    public void setGender(String gender) {this.gender = gender; }

    public void setYear(int year) {this.year = year; }

    public void setMonth(int month) {this.month = month;}

    public void setDay(int day) {this.day = day;}

    public void setHeightInches(double height) {this.height = height;}

    public void setWeight(double weight) {this.weight = weight;}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getGender() {return gender;}

    public int getYear() {return year;}

    public int getMonth() {return month;}

    public int getDay() {return day;}

    public double getHeightInches() {
        return height;
    }

    public double getWeight() {return weight;}

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

    public double bodyMassIndex(){

       return weight* 703/ height *height;
    }
}

