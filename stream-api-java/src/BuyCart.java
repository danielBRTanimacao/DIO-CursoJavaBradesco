import java.util.ArrayList;
import java.util.List;

public class BuyCart {
    private List<Item> itemList;

    public BuyCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public int getAmount() {
        return this.itemList.size();
    }

    public double calcAllValue() {
        if (itemList.isEmpty()) {
            throw new RuntimeException("A lista esta vazia :)");
        }

        return itemList.stream()
            .mapToDouble(item -> item.getPrice() * this.getAmount())
            .sum();
    }
}
