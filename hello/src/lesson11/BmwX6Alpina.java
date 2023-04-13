package lesson11;

public class BmwX6Alpina extends BmwX6 {

    public BmwX6Alpina() {
        super();
        //setBrandName("Zaporoszets");
    }

    @Override
    public void startEngine(String key) {
        super.startEngine(key);
        System.out.println(" engine tuning");
    }
}
