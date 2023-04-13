package lesson11;

public class RenaultLogan extends Machine implements CarDriving {

    private int mileage;

    public RenaultLogan() {
        setBrandName("Renailt Logan");
    }

    @Override
    public void startEngine() {
        System.out.println(getBrandName() + " start engine");
    }

    public int drive(int km) {
        mileage += km;
        System.out.println(getBrandName() + " runs " + km + " mileage " + mileage);
        return mileage;
    }

}
