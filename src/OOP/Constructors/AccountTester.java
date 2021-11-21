package OOP.Constructors;

class AccountTester {

        public static void main(String[] args) {

            Account account = new Account(20000);
            account.withdraw(2500.0);
            account.deposit(3000.0);
            System.out.println("Balance: $" + account.getBalance());
            System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate());
            System.out.println("Monthly Interest: " + account.getMonthlyInterest());
            System.out.println("Date Created: " + account.getDateCreated());
        }
    }
