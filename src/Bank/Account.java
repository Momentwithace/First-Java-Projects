package Bank;

import java.util.ArrayList;

public class Account {
    private static int uniqueId = 5211;
//    private String customersFirstName;
//    private String customersSecondName;
//    private String customersGender;
//    private int customersAge;
//    private String customersPhoneNumber;
//    private String customersEmail;
//    private String customersStateOfOrigin;
    private String accountNumber;
    double accountBalance = 0;
    private ArrayList<Account> accounts;
    private ArrayList<Customer> customers;
    private Customer customer;


    public Account(Customer customer) {

        this.accountNumber = "308130" + uniqueId++;
        this.customer = customer;
//        this.customersFirstName = customersFirstName;
//        this.customersSecondName = customersSecondName;
//        this.customersGender = customersGender;
//        this.customersAge = customersAge;
//        this.customersPhoneNumber = customersPhoneNumber;
//        this.customersEmail = customersEmail;
//        this.customersStateOfOrigin = customersStateOfOrigin;
        this.accounts = new ArrayList<>();

    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public double getBalance() {
        return accountBalance;
    }

    public void withdraw(double amount) {
        accountBalance = accountBalance - amount;
    }

    public String getAccountNumber() {
        return accountNumber;

    }

    public boolean isSavings() {
        return true;
    }

    public boolean isCurrent() {
        return true;
    }

//    public void acceptTransfer(int amount) {
//        accounts += amount;
//    }
}
