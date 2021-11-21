package OOP.Constructors;

public class StockMain {

    public static void main(String[] args) {

        //Test your class

        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.previousClothingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println(stock.symbol + ", " + stock.name);

        System.out.println(stock.getChangePercent());


    }
}
