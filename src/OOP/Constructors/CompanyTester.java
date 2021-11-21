package OOP.Constructors;

public class CompanyTester {

    public static void main(String[] args) {

        Company company = new Company("Amazon");

        company.setName("Google");
        company.setNumberOfEmployees(50000);
        company.setRevenue(500000000);
        company.setExpenses(350000000);

        System.out.println(company.getName() + " has the following number of employees: "
                + company.getNumberOfEmployees() + ". And the company size is quite "
                + company.getCompanySize());

        System.out.println(company.getName() + " had the following annual profit in 2020: $"
                + company.getProfit());


    }
}
