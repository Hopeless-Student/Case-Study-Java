import java.util.ArrayList;

public class Bag {
    ArrayList<String> inventory;

    Bag() {
        inventory = new ArrayList<>();
    }

    public void addItem(String itemName) {
        inventory.add(itemName);
        System.out.println("Obtained a " + itemName + "!");
    }

    public void itemList(){
        int i = 1;
        System.out.println("\nBag Items");
        for (String  items: inventory) {
            System.out.println("["+ i +"] "+items);
            i++;
        }
    }
}
