package OOP.Constructors;

public class DuotechStudent {

    String name;
    int age;
    String stateOfResidence;
    boolean isOnline;
    int [] grades;
    double tuition;

    public String getInfo(){

        String info = name + ", " + age + ", " + stateOfResidence;
        return info;
    }
    public double getAverageGrade(){

        int sum = 0;

        for(int i = 0; i < grades.length; i++){
            sum+=grades[i];
        }
        return (double)sum / grades.length;
    }
    public void payTuition(double amount){

        tuition = tuition - amount;
    }
    public double getTuition(){

        return tuition;
    }
}