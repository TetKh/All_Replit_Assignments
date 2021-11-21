package OOP.Polymorphism.Student;

public class OnlineStudent extends Student{

    private String state;

    public OnlineStudent(String firstName, String lastName, String state) {
        super(firstName, lastName);
        this.state = state;
        setId(generateId());
    }
    public String generateId(){
        return getFirstName().substring(0, 3) + getLastName().substring(0, 3) + state;
    }

    @Override
    public String toString() {
        return "OnlineStudent{" +
                "state='" + state + super.toString() + '\'' +  generateId() +
                '}';
    }
}




/*



-> student's first and
-toString()
override Student class's toString to add id and state
 */
