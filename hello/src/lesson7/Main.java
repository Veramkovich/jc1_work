package lesson7;

public class Main {

    public static void main(String[] args) {
        Automat<Product> automat = new Automat<>();
        automat.setProducts(new Product[]{
                new Product("Lays", 5),
                new Product("Snickers", 3),
                new DrinkProduct("Bonaqua", 7, 1.5),
                new Product("Oreo", 4),
                new Product("Orbit", 6)
        });

        while (true) {
            // Main menu
            automat.printMainMenu();
            // Select product
            int productNum = automat.readProductNumber();
            // Get product
            automat.takeProduct(productNum);
        }
    }

}
