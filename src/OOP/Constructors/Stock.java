package OOP.Constructors;

public class Stock {

    String symbol;
    String name;
    double previousClothingPrice;
    double currentPrice;

    public Stock(String symbol, String name){

        this.symbol = symbol;
        this.name = name;
    }
    public Stock(){

        this("GOOG", "Google Inc");

    }

    public double getChangePercent(){

        return (currentPrice - previousClothingPrice) / previousClothingPrice * 100;

    }
    public void setSymbol(String givenSymbol) {

        this.symbol = givenSymbol;
    }

    public void setName(String givenName){

        this.name = givenName;
    }
}
