package OOP.Constructors;

public class GasTankMain {

    public static void main(String[] args) {

        GasTank g = new GasTank();

        g.addGas(10);
        g.useGas(5);
        System.out.println(g.isEmpty());
        System.out.println(g.getGasLevel());

    }
}
