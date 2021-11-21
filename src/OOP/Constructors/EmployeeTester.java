package OOP.Constructors;

public class EmployeeTester {
    public static void main(String[] args) {

        Employee e = new Employee("TC34546", "Michael", "Jackson", 100000);

        e.setDepartment("Finance");
        System.out.println("Employee information before changes:" + "\n" +
                "Employee Id: " + e.getEmployeeId() + "\n" +
                "First Name: " + e.getFirstName() + "\n" +
                "Last Name: " + e.getLastName() + "\n" +
                "Department: " + e.getDepartment() + "\n" +
                "AnnualSalary: $" + e.getAnnualSalary() + "\n");

        e.setEmployeeId("ZX09899");
        e.setDepartment("IT");

        System.out.println("Employee information after changes:" + "\n" +
                "Employee Id: " + e.getEmployeeId() + "\n" +
                "First Name: " + e.getFirstName() + "\n" +
                "Last Name: " + e.getLastName() + "\n" +
                "Department: " + e.getDepartment() + "\n" +
                "AnnualSalary: $" + e.getAnnualSalary() + "\n");

        e.raiseSalary(20);

        System.out.println("Employee's salary after increase: $" + e.getAnnualSalary());


    }
}
