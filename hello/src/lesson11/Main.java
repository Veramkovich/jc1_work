package lesson11;

public class Main {

    public static void main(String[] args) {
        CarDriving[] cars = {
                new KiaRio(),
                new RenaultLogan(),
                new VwPolo(),
                new KiaRio(),
                new VwPolo(),
                new BmwX6()
        };
        FleetManager fleetManager = new FleetManager();
        fleetManager.setCarDrivings(cars);
        fleetManager.driveAll();

        fleetManager.setCarDrivings(new CarDriving[]{
                new CarDriving() {
                    private int km;

                    @Override
                    public int drive(int distance) {
                        return km += distance;
                    }
                }
        });

        MachineDriver driver = new MachineDriver();
        driver.setMachine(new VwPolo());
        driver.startDriving();

        //BmwX6 bmwX6 = new BmwX6();
        BmwX6 bmwX6 = new BmwX6Alpina();

        driver.setMachine(bmwX6);
        driver.startDriving();

        bmwX6.startEngine("76182y828162", 15, true);

        bmwX6.startEngine("76182y828162");
    }

}
