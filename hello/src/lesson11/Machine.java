package lesson11;

public abstract class Machine {

    private String brandName;

    public abstract void startEngine();

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
