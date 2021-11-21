package OOP.Inheritance.Calculator;

public class Main {

    public static void main(String[] args) {

        CalculatorWithMemory cm = new CalculatorWithMemory();
        cm.save();
        System.out.println(cm.getMemory());
        cm.clearMemory();
        System.out.println(cm.getMemory());
        cm.save();
        System.out.println(cm.getMemory());
        cm.recall();
        System.out.println(cm.getMemory());

    }
}
