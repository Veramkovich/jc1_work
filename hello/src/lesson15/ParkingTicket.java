package lesson15;

import java.util.Random;

public class ParkingTicket {

    private final Integer id = new Random().nextInt(1000_000);

    public Integer getId() {
        return id;
    }
}
