package OOP.Constructors;

public class Employee {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

    public Employee(String employeeId, String firstName, String lastName, int annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = annualSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void raiseSalary(double percent){
        this.annualSalary = annualSalary + (annualSalary * percent / 100);
    }
}