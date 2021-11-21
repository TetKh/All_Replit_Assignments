package OOP.Constructors;

public class GasTank {

        double amount = 0;

        public void addGas(double a){

            amount = amount + a;
        }
        public void useGas(double b){

            amount = amount - b;
            if (amount < 0){
                amount = 0;
            }
        }
        public boolean isEmpty() {

            if (amount < 0.1) {
                return true;
            } else return false;
        }
        public double getGasLevel(){

            return amount;
        }
    }
