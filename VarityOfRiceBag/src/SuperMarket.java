 import java.util.HashMap;
import java.util.Map;

class SuperMarket {
    private Map<String, Integer> riceBags;

    public SuperMarket() {
        this.riceBags = new HashMap<>();
    }

    public void addRiceBag(String variety, int stock) {
        riceBags.put(variety, stock);
    }

    public int getStock(String variety) {
        return riceBags.getOrDefault(variety, 0);
    }

    public static void main(String[] args) {
        SuperMarket supermarket = new SuperMarket();
        supermarket.addRiceBag("Basmati", 100);
        supermarket.addRiceBag("Jasmine", 150);
        supermarket.addRiceBag("Brown", 200);

        System.out.println("Stock of Basmati rice bags: " + supermarket.getStock("Basmati"));
        System.out.println("Stock of Jasmine rice bags: " + supermarket.getStock("Jasmine"));
        System.out.println("Stock of Long Grain rice bags: " + supermarket.getStock("Long Grain"));
    }
}
