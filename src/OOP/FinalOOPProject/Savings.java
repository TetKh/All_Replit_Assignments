package OOP.FinalOOPProject;

public class Savings extends Account{

    int safetyDepositBoxID;
    int safetyDepositBoxPin;

    public Savings(String name, String ssn, double balance) {
        super(name, ssn, balance);
        this.accountNumber = "2" + accountNumber;
        this.safetyDepositBoxID = 100 + (int)(Math.random() * 900);
        this.safetyDepositBoxPin = 1000 + (int)(Math.random() * 9000);
        setInterestRate(getBaseInterestRate());
    }

    public void setInterestRate(double a){

        this.interestRate = super.interestRate - 0.25;
    }


    public String showInfo(){

        return super.showInfo() + "ACCOUNT TYPE: " + "Savings" + "\n" + "Checking SAFETY DEPOSIT BOX ID: " + safetyDepositBoxID +
                "\n" + "SAFETY DEPOSIT BOX PIN: " + safetyDepositBoxPin + "\n" + "INTEREST RATE: " + interestRate;
    }

}
/*
Methods:

showInfo() - Overrides super class's showInfo() method by ADDING Savings account specific info such as account
type, safetyDepositBoxID, safetyDepositBoxPin and interestRate Ex:
NAME: Arielle Duncan SSN:
444-10-2638 ACCOUNT NUMBER: 226386906582 ROUTING NUMBER: 002561772 BALANCE: 1000.0
ACCOUNT TYPE:
Checking SAFETY DEPOSIT BOX ID: 793 SAFETY DEPOSIT BOX PIN: 9877
INTEREST RATE: 2.25%

 */
