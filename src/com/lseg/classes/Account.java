package com.lseg.classes;

public class Account {

    private String customerName;

    private String iban;

    private double balance;

    public Account() {
        //this is exactly default constrcutor
        System.out.println("Default constructor called");
    }

    public Account(String customerName, String iban, double balance) {
        //add validation
        this.customerName = customerName;
        this.iban = iban;
        this.balance = balance;
    }

    //behaviour
    public void deposit(double depositAmount) {

        balance += depositAmount;
        System.out.println("Funds deposited! New balance is: " + balance);
    }

    public void withdraw(double withdrawalAmount) {

        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Insufficent funds! Current balance is: " + this.balance);

        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Funds retrieved! New balance is: " + balance);
        }
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public void setIban(String iban) {
        //add validation
        this.iban = iban;
    }

    public String getIban() {

        return iban;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }
}
