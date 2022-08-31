package Bank;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String bankAddress;
    private String bankCustomerCare;
    private ArrayList<Account> accounts;
    private ArrayList<Customer> customers;
    public Bank(String bankName, String bankAddress, String bankCustomerCare) {
        this.bankAddress = bankAddress;
        this.bankCustomerCare = bankCustomerCare;
        this.bankName = bankName;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) {
        for(Account account: accounts){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public ArrayList<Customer> getCustomer() {
        return customers;
    }


//    public void addCustomer(Customer customer) {
//        customers.add(customer);
//    }

//    public Customer getCustomer(String accountNumber) {
//        for(Customer customer: customers){
//            if(customer.getAccountNumber() == accountNumber){
//                return customer;
//            }
//        }
//        return null;
//    }

//    public int getCustomerList() {
//        return customers.size();
//    }
//
//    public void addC(Account account) {
//        accounts.add(account);
//    }



}

