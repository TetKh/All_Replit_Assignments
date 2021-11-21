package OOP.Polymorphism.EmailManagementApplication;

import java.util.Arrays;

public class StaffEmail extends Email{

    private int departmentId;
    private final String[] departments = {"accounting", "sales", "marketing", "instructors"};
    private String department;
    private String type = "Staff";

    public StaffEmail(String firstName, String lastName, int departmentId) {
        super(firstName, lastName);
        this.departmentId = departmentId;
        setEmailAddress(generateEmail());
        setPassword(generatePassword());
        setCapacity(50);
        setMaxAttachmentSize(100);

    }
    public String generateEmail(){

        switch (departmentId) {
            case 1:
                department = departments[0];
                break;
            case 2:
                department = departments[1];
                break;
            case 3:
                department = departments[2];
                break;
            case 4:
                department = departments[3];
                break;
            default:
                department = "Invalid_Department";
        }
        return getFirstName() + "." + getLastName() + "_d" + departmentId + "@"
                + department + "." + getDOMAIN_NAME();
    }
    public String generatePassword(){

        String s = "!@#$%^&*()abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPGTSTIVWXYZ";
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += s.charAt((int) (Math.random() * s.length()));
        }
        return password;
    }

    @Override
    public String toString() {
        return "TYPE: " + type + "\n" + "DEPARTMENT: " + department + "\n" + super.toString();
    }
}


/*
1 represents Accounting
2 represents Sales
3 represents Marketing
4 represents Instructors


 */
