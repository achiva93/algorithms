package com.lseg.classes;

public class BranchService {

    public static void main(String[] args) {

//        id 1 din Account table
//        "John Doe", "RO19RNCB811829172918291729", 0  --> un obiect din clasa Account

        Account johnAccount = new Account("John Doe", "RO19RNCB811829172918291729", 0);

        Object[] row = new Object[]{
                "John Doe", "RO19RNCB811829172918291729", 0
        };

//       deposit(row);
//        johnAccount.setCustomerName("John Doe");
//        johnAccount.setIban("RO19RNCB811829172918291729");

        johnAccount.deposit(1000);
        johnAccount.withdraw(200);//euro
    }
}
