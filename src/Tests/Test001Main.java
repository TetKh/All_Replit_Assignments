package Tests;

public class Test001Main {

    public static void main(String[] args) {

        Test001 company = new Test001("Amazon");

        company.setName("Google");
        company.setNumberOfEmployees(100);
        company.setRevenue(100);
        company.setExpenses(50);

        System.out.println(company.getName() + " has the following number of employees: " + company.getNumberOfEmployees() + ". And the company size is quite " + company.getCompanySize());
        System.out.println(company.getName() + " had the following annual profit in 2020: $" + company.getProfit());


        company.setName("Nike");
        company.setNumberOfEmployees(400);
        company.setRevenue(300);
        company.setExpenses(50);

        System.out.println(company.getName() + " has the following number of employees: " + company.getNumberOfEmployees() + ". And the company size is quite " + company.getCompanySize());
        System.out.println(company.getName() + " had the following annual profit in 2020: $" + company.getProfit());

    }
}
