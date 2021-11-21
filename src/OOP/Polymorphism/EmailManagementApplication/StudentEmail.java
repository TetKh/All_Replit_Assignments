package OOP.Polymorphism.EmailManagementApplication;

public class StudentEmail extends Email{

    private int batchNo;
    private String type = "Student";

    public StudentEmail(String firstName, String lastName, int batchNo) {
        super(firstName, lastName);
        this.batchNo = batchNo;
        setEmailAddress(generateEmail());
        setPassword(generatePassword());
        setCapacity(25);
        setMaxAttachmentSize(50);
    }

    public String generateEmail(){
        return getFirstName() + "." + getLastName() + "_b" + batchNo + "@"
        + "student." + getDOMAIN_NAME();

    }
    public String generatePassword(){

        String s = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPGTSTIVWXYZ";
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += s.charAt((int) (Math.random() * s.length()));
        }
        return password;
    }

    @Override
    public String toString() {
        return "TYPE: " + type + "\nSTUDENT BATCH: " + batchNo + "\n" + super.toString();
    }
}

/*
generatePassword() - override it so it returns the following: random password with length 8
that consists of lowercase, uppercase chars and numbers Example: gad6FshR

toString() - override it so it returns the info in following format (use super class's toString() for
super class field values): TYPE: Student BATCH NO: batchNo NAME: firstName + lastName GENERATED EMAIL
ADDRESS: emailAddress GENERATED PASSWORD: password CAPACITY: capacity MAX ATTACHMENT SIZE: maxAttachmentSize
 */
