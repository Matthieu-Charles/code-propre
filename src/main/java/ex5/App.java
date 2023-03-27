package ex5;

public class App {
    public static void main(String[] args) {
        Inventaire inventaire= new Inventaire();

        Item item0 = new Item("Item0", 1);
        Item item1 = new Item("Item1", 2);
        Item item2 = new Item("Item2", 7);
        Item item3 = new Item("Item3", 7);
        Item item4 = new Item("Item4", 12);
        Item item5 = new Item("Item5", 28);

        inventaire.addItem(item0);
        inventaire.addItem(item1);
        inventaire.addItem(item2);
        inventaire.addItem(item3);
        inventaire.addItem(item4);
        inventaire.addItem(item5);

        System.out.println(inventaire.taille());
        System.out.println(inventaire.getCaisses());
    }
}
