package OOP.Constructors;

public class Account{

    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
    static {
        annualInterestRate = 4.5 ;
    }
    public Account() {

        dateCreated = new java.util.Date();
    }
    public Account(double balance) {
        this();
        this.id = generateAccountID();
        this.balance = balance;


    }
    public int getId() {

        return this.id;
    }
    public double getBalance() {

        return this.balance;
    }
    public double getAnnualInterestRate() {

        return annualInterestRate;
    }
    public String getDateCreated() {

        return this.dateCreated.toString();
    }
    public void setId(int id) {

        this.id = id;
    }
    public void setBalance(double balance) {

        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {

        annualInterestRate = Account.annualInterestRate;
    }
    public double getMonthlyInterestRate() {

        return (annualInterestRate / 100) / 12 ;
    }
    public double getMonthlyInterest() {

        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {

        this.balance -= amount;
    }
    public void deposit(double amount) {

        this.balance += amount;
    }
    public int generateAccountID(){
        int random =0;
        for (int i = 0; i < 4; i++)
            random = (int)(1 + (Math.random() * 9));
        return random;
    }

}