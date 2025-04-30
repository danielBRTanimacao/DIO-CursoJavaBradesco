public class App {
    public static void main(String[] args) throws Exception {
        BuyCart buyCart = new BuyCart();
        Item item = new Item("Prato", 10.2);

        buyCart.addItem(item);
        buyCart.addItem(item);
        System.out.println(buyCart.calcAllValue());
    }
}
