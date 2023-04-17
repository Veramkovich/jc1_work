package lesson7;

//import java.util.Scanner;


public class Automat<T extends Product> {

     /*final T[] products = {
            new T("Lays", 5),
            new T("Snickers", 3),
            new T("Bonaqua", 7),
            new T("Oreo", 4),
            new T("Orbit", 6)
    };*/

    private T[] products;

    public void setProducts(T[] products) {
        this.products = products;
    }

    public void printMainMenu() {
        int num = 1;
        for (T product : products) {
            if (product.count > 0) {
                System.out.println(num + ": " + product.name + " [" + product.count + "]");
            }
            num++;
        }
        System.out.println("Please select product number:");
    }

    public int readProductNumber() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean isNumberCorrect;
        int num;
        do {
            num = scanner.nextInt();
            isNumberCorrect = num >= 1 && num <= products.length;
            if (isNumberCorrect) {
                T product = products[num - 1];
                isNumberCorrect = product.count > 0;
            }
            if (!isNumberCorrect) {
                System.out.println("No such product number!");
                System.out.println("Please select product number:");
            }
        } while (!isNumberCorrect);
        String name = products[num - 1].name;
        System.out.println("You have selected product " + name);
        return num;
    }

    public void takeProduct(int productNum) {
        T product = products[productNum - 1];
        product.count--;
        System.out.println("Please take your product " + product.name);
        System.out.println("Remain " + product.count + " of " + product.name);
    }
}
