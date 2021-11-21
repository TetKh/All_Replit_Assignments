package OOP.FinalOOPProject;

public class Checking extends Account {

    String debitCardNo;
    int debitCardPIN;

    public Checking(String name, String ssn, double balance) {
        super(name, ssn, balance);
        this.accountNumber = "1" + super.accountNumber;
        this.debitCardNo = generateDebitCardNo();
        this.debitCardPIN = 1000 + (int)(Math.random()*9000);
        setInterestRate(getBaseInterestRate());

    }

    public void setInterestRate(double a) {

        this.interestRate = super.interestRate * 15 / 100;
    }
    public String generateDebitCardNo(){

        return ("9" + 10000000000000L + (long)(Math.random() * 900000000000000L));
    }

    public String showInfo(){

        return super.showInfo() + "ACCOUNT TYPE: " + "Checking" + "\n" + "DEBIT CARD NUMBER: " + debitCardNo + "\n"
                        + "DEBIT CARD PIN: " + debitCardPIN + "\n" +
                        "INTEREST RATE: " + interestRate;

    }

}
/*

setInterestRate() - an abstract method that is inherited from BaseInterestRate interface. Must be impemented as:
This class's interestRate must be set as 15% of the super class's interestRate.


generateDebitCardNo() - generates an 16-digit Debit Card number using the below formula: 9 + random 15 digit number

showInfo() - Overrides super class's showInfo() method by ADDING Checking account specific info such as account type,
debitCardNo, debitCardPIN and interestRate

	   Ex:
 NAME: Arielle Duncan
 SSN: 444-10-2638
 ACCOUNT NUMBER: 226386906582
 ROUTING NUMBER: 002561772
 BALANCE: 1000.0
 ACCOUNT TYPE: Checking
 DEBIT CARD NUMBER: 9804579327874081
 DEBIT CARD PIN: 8689
 INTEREST RATE: 0.375%
	   Ex:
 NAME: Arielle Duncan
 SSN: 444-10-2638
 ACCOUNT NUMBER: 226386906582
 ROUTING NUMBER: 002561772
 BALANCE: 1000.0
 ACCOUNT TYPE: Checking
 DEBIT CARD NUMBER: 9804579327874081
 DEBIT CARD PIN: 8689
 INTEREST RATE: 0.375%
 */
