package lesson11;

import java.util.Random;

public class FleetManager {

    private CarDriving[] carDrivings;

    public void setCarDrivings(CarDriving[] carDrivings) {
        this.carDrivings = carDrivings;
    }

    public void driveAll() {
        Random random_int = new Random();

        for (CarDriving carDriving : carDrivings) {
            carDriving.drive(random_int.nextInt(100));
        }
    }

}
