package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }


    public void addItem(String name, Double price, Integer quantity) {
        itemList.add(new Item(price, name, quantity));
    }

    public void removeItems(String name) {
        List<Item> removeItems = new ArrayList<>();
        for (Item item : itemList) {
            if (Objects.equals(item.getName(), name)) {
                removeItems.add(item);
            }
        }
        itemList.removeAll(removeItems);
    }

    public void total() {
        double total = 0.0;
        for (Item item : itemList) {
            double valor = item.getQuantity() * item.getPrice();
            total += valor;
        }
        System.out.println("O total foi: " + total);
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.println("Nome: " + item.getName() + ", Preço: " + item.getPrice() + ", Quantidade: " + item.getQuantity());
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }
}
