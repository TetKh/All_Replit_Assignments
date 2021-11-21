package OOP.FinalOOPProject;

public interface BaseInterestRate {

    double BASE_INTEREST_RATE = 2.5;

    default double getBaseInterestRate(){

        return BASE_INTEREST_RATE;
    }

    public void setInterestRate(double a);
}

// public - protected - default - private