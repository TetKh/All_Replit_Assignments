package OOP.Constructors;

public class DuotechStudentMain {

    public static void main(String[] args) {

        DuotechStudent st = new DuotechStudent();

        st.age = 55;
        st.name = "Michael Jackson";
        st.stateOfResidence = "FL";
        st.tuition = 10000;
        st.isOnline = true;
        st.grades = new int[] {77,78,90,61};

        System.out.println(st.getInfo());
        System.out.println(st.getAverageGrade());
        st.payTuition(2500);
        System.out.println(st.getTuition());

    }
}
