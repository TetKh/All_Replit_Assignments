package Collection.Comparable;

public class DuotechStudent implements Comparable<DuotechStudent>{


    int id;
    int age;
    String name;

    public DuotechStudent(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(DuotechStudent o) {
//          if(this.age > o.age){
//              return 1;
//          }else if(this.age < o.age){
//              return -1;
//          }else{
//              return 0;
//      // return this.id - o.id;
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "DuotechStudent{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
