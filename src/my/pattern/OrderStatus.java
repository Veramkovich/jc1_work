package my.pattern;

public enum OrderStatus {

    NEW(0), IN_PROGRESS(100), PAID(5), DELIVERED(0);

    private int price;

    OrderStatus(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
