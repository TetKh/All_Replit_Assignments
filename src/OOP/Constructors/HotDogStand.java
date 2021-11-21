package OOP.Constructors;

public class HotDogStand {
    private int id;
    private int soldByOne;
    private static int totalCount = 0;

    HotDogStand(){ // default constructor
    }
    HotDogStand(int id, int soldByOne){
        this.id = id;
        this.soldByOne = soldByOne;
        totalCount += soldByOne;
    }
    public int getID() {
        return id;
    }
    public int getSoldByOne(){
        return soldByOne;
    }
    public void setId(int newId) {
        this.id = newId;
    }
    public void setsoldByOne(int newSoldByOne){
        this.soldByOne = newSoldByOne;
        totalCount =+ soldByOne;
    }
    public void justSold (){
        soldByOne++;
        totalCount++;

    }
    public int soldByOneStand(){
        return soldByOne;
    }
    public static int soldByAllStands(){

        return totalCount;
    }
    public String toString() {

        System.out.println("HotDogStand # " + getID() +  " has sold " + soldByOneStand() + ".  All stands together sold " +  soldByAllStands() + "\n");
        return null;
    }
}
//    You operate several hot dog stands distributed throughout town. Define a class
//named HotDogStand that has a member variable for the hot dog stand's ID number and a member variable for
// how many hot dogs the stand has sold that day.
// Create a constructor that
//        allows a user of the class to initialize both values. Also create a method named JustSold that
//        increments the number of hot dogs the stand has sold by one.
//
//        The idea is that this method will be invoked each time the stand sells a hot dog so that you can
//        track the total number of hot dogs sold by the stand.
//        Add another method that returns the number
//        of hot dogs sold. Finally, add a static variable that tracks the total number of hot dogs sold by all
//        hot dog stands and a static method that returns the value in this variable.