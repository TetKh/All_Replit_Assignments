package OOP.Constructors;

public class StoreProductMain {

    public static void main(String[] args){

        StoreProduct product = new StoreProduct();

        product.label = "Stance";
        product.price = 15;

        System.out.println(product.label + " socks price is $" + product.price + "\n");


        StoreProduct product2 = new StoreProduct("Happy Socks", 12, 200);

        System.out.println(product2.label + " product's price is $" + product2.price + " and it has " + product2.category + " category" + "\n");


        StoreProduct product3 = new StoreProduct("Zara", 20);

        product3.category = "Clothing";

        System.out.println(product3.label + " shoes's price is $" + product3.price + " and the store has only " + product3.category + " category" + "\n");


        StoreProduct product4 = new StoreProduct("Snickers", 3, "candy", true);

        product4.stock = 10000;

        System.out.println(product4.label + " product price is $" + product4.price + " and the store has only " + product4.category + " category. The current stock is " + product4.stock + " boxes" + "\n");

        System.out.println("The price after 50% discount will be $" + product4.getDiscountedPrice(0.5) + "\n");

        System.out.println(product4.sell(10001) + "\n");

        product4.expired(true);
        System.out.println("The stock by the end of the Happy Friday day was " + product4.stock);



    }
}