package com.SavingAccount;

public class SavingAccountImpl {
    public static void main(String[] args) {
    String name;
    long accountNo;
    String accountOpeningDate;
    String status;
    double balance;
    double totalbalance;
    float interestRate;
    String modeOfOperator;
    String internetAndMobileBanking;

    SavingAccount object =new SavingAccount();
    object.setName("Ajay");
    object.setAccountNo(12345L);
    object.setStatus("Active");
    object.setBalance(1000);
    object.setTotalBalance(object.getBalance());
    object.setinterestRate(8);
    object.setModeOfOperator("Self");
    object.setInteretAndMobileBanking("Enabled");



    object.accountBalance();
    System.out.println(new StringBuilder().append("Balance=").append(object.accountBalance()).toString());
    object.debit(1000,200);
    System.out.println("balance="+object.getBalance());
}
}


