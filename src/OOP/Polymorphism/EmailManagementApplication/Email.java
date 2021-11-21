package OOP.Polymorphism.EmailManagementApplication;

public class Email {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private int capacity; // capacity of the email in GBs.
    private int maxAttachmentSize; // maximum size of the attachments in MBs
    private String DOMAIN_NAME = "duotech.io";


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxAttachmentSize() {
        return maxAttachmentSize;
    }

    public void setMaxAttachmentSize(int maxAttachmentSize) {
        this.maxAttachmentSize = maxAttachmentSize;
    }

    public String getDOMAIN_NAME() {
        return DOMAIN_NAME;
    }

    public void setDOMAIN_NAME(String DOMAIN_NAME) {
        this.DOMAIN_NAME = DOMAIN_NAME;
    }
    public String generateEmail(){
        return "";
    }
    public String generatePassword(){
        return "";
    }

    @Override
    public String toString() {
        return  "NAME: " + getFirstName() + " " + getLastName() + "\n" +
                "GENERATED EMAIL ADDRESS: " + getEmailAddress() + "\n" +
                "GENERATED PASSWORD: " + getPassword() + "\n" +
                "CAPACITY: " + getCapacity() + "\n" +
                "MAX ATTACHMENT SIZE: " + getMaxAttachmentSize();
    }
}

/*

toString() - return the following field values in following format: NAME: firstName + lastName
GENERATED EMAIL ADDRESS: emailAddress GENERATED PASSWORD: password CAPACITY: capacity
MAX ATTACHMENT SIZE: maxAttachmentSize
 */
