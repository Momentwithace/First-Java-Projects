package Bank;

import java.util.ArrayList;

public class Customer {
    private static int uniqueId = 5211;
    private String accountNumber;
    private String firstName;
    private String secondName;
    private String gender;
    private int age;
    private String phoneNumber;
    private String email;
    private String stateOfOrigin;
    private ArrayList<Account> accounts;

    public Customer(String firstName, String secondName, String gender,
                    int age, String phoneNumber, String email, String stateOfOrigin) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.stateOfOrigin = stateOfOrigin;
        this.accounts = new ArrayList<>();
        this.accountNumber = "308030" + uniqueId++;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

//    public Customer getAccountNumber() {
//        for (Account account: accounts){
//            if(account.getAccountNumber() == accountNumber){
//                return account;
//            }
//        }
//        return null;
//    }
}
