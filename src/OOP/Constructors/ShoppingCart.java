package OOP.Constructors;

public class ShoppingCart {

    private int totalNumberOfItems = 0;
    private double totalAmountOwed = 0.0;

    public int getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    public void setTotalNumberOfItems(int totalNumberOfItems) {
        this.totalNumberOfItems = totalNumberOfItems;
    }

    public double getTotalAmountOwed() {
        return totalAmountOwed;
    }

    public void setTotalAmountOwed(double totalAmountOwed) {
        this.totalAmountOwed = totalAmountOwed;
    }

    public double getAveragePricePerItem(){
        return totalAmountOwed / totalNumberOfItems;
    }
    public void addItems(int numberOfItems, double pricePerItem){

        this.totalNumberOfItems = numberOfItems;
        this.totalAmountOwed = totalAmountOwed + (pricePerItem * numberOfItems);

    }

    public void empty(){

        this.totalNumberOfItems = 0;
        this.totalAmountOwed = 0.0;
    }
}
