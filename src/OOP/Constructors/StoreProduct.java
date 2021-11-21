package OOP.Constructors;

public class StoreProduct{

    String label;
    int price;
    String category;
    boolean hasExpiration;
    int stock;

    public StoreProduct(){

    }
    public StoreProduct(String label, int price, int stock){

        this.label = label;
        this.price = price;
        category = "misc";
        hasExpiration = false;
        this.stock = stock;

    }
    public StoreProduct(String label, int price){
// category and hasExpiration are not included
        this.label = label;
        this.price = price;
        stock = 0;

    }
    public StoreProduct(String label, int price, String category, boolean hasExpiration){
        // stock is not included
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;

    }
    public void expired(boolean hasExpired){

        if (hasExpired)
            stock = 0;
    }
    public boolean sell(int quantity){

        if (stock >= quantity){
            return true;
        } else return false;
    }
    public double getDiscountedPrice(double discount){

        return price * (1 - discount);
    }
}
