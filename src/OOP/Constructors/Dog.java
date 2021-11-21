package OOP.Constructors;

    public class Dog{

        String name;
        String breed;
        int weight;

        public Dog(){

        }

        public Dog(String name, int weight){

            this.breed = "Mutt";
            this.name = name;
            this.weight = weight;
        }

    }