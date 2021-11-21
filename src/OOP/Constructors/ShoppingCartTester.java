package OOP.Constructors;

public class ShoppingCartTester {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setTotalNumberOfItems(25);
        cart.setTotalAmountOwed(750);

        System.out.println("The average price per item in the cart is: $" + cart.getAveragePricePerItem());

        cart.addItems(8, 15);

        System.out.println("The total number of items is " + cart.getTotalNumberOfItems()
                + ", total amount owed is: $" + cart.getTotalAmountOwed());

        cart.empty();
        System.out.println("After a payment is done, the number of items in the cart is "
                + cart.getTotalNumberOfItems());
    }
}