package Regex;

public class Regex {
    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[+]234[7-9][0-1]\\d{8}|0[7-9][0-1]\\d{8}");
    }

    public static boolean validateEmail(String email) {
        return email.matches("[a-z]+\\d*.[a-z]+\\d*@[a-z]+[.]com");
    }

    public static boolean validatePassword(String password) {
        return password.matches("\\d*[A-Z]*[a-z]*[A-Z]*[!@#$%&*()_+~?>.<,:;]+[A-Z]*[a-z]*[!@#$%&*()_+~?>.<,:;]*\\d*[A-Z]*[a-z]*");
    }


    public static boolean ValidateFirstName(String firstName){
        return firstName.matches("[A-Z][a-z]*");
    }

    public static boolean ValidateLastName(String lastName) {
        return lastName.matches("[A-Z][a-z]*");
    }
}
