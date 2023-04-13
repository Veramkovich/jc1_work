package lesson11;

public class VwPolo extends Machine implements CarDriving {

    private int kilometers;

    public VwPolo() {
        setBrandName("VM Polo");
    }

    @Override
    public void startEngine() {
        System.out.println(getBrandName() + " start engine");
    }

    public int drive(int kilometer) {
        kilometers += kilometer;
        System.out.println(getBrandName() + " goes " + kilometer + " total kilometers " + kilometers);
        return kilometers;
    }

}
