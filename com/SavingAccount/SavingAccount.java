package com.SavingAccount;

public class SavingAccount{
    private String name;
    private long accountNo;
    private String accountOpeningDate;
    private String status;
    private double balance;
    private double totalbalance;
    private float interestRate;
    private String modeOfOperator;
    private String internetAndMobileBanking;

    Saving Account(){
    accountNo=0;
    name="";
    accountNo=0;
    status="";
    balance=0;
    internetAndMobileBanking="" ;
    interestRate=0;
    modeOfOperator="";
     return null;
 }
    public long getAccount(){
    return accountNo;
}
    public String getInternetAndMobileBanking(){return internetAndMobileBanking;}
    public void setInternetAndMobileBanking(String internetAndMobileBanking) {this.internetAndMobileBanking=internetAndMobileBanking;}
    public void setAccountNo(long AccountNo) {
    this.accountNo = accountNo;
}
    public String getName() {return name;}
    public String ModeOfOperator(){return modeOfOperator;}
    public void setModeOfOperator(String modeOfOperator) {this.modeOfOperator = modeOfOperator;}
    public String setName() {return name;}
    public Object accountBalance(){double accountBalance=balance;
        return null;
    }
    public String getAccountOpeningDate(){
        return accountOpeningDate;
}
    public void setAccountOpeningDate(String openingDate){
        this.accountOpeningDate=accountOpeningDate;
    }
    public void setAccountOpeningData() {
    this.accountOpeningDate = accountOpeningDate;
}
    public void setName(String name){
     this.name=name;
}
    public String getStatus() {
     return status;
}
    public double setStatus(String status) {this.status = status;return 0;}
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void accountName() {
        double accountBalance = balance;
    }
    public void debit(double balance,double amount){
        double debit=balance-amount;
    }
    public void credit(double balance,double amount){
        double credit=balance +amount;
    }
    public float getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(float interestRate){
        this.interestRate=interestRate;
    }
    public int setName(int name){
        return name;
    }

    public void setTotalBalance(double balance) {
    }

    public void setinterestRate(int i) {
    }

    public void setInteretAndMobileBanking(String enabled) {
    }
}




