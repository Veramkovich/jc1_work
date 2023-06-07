package lesson15;

import lesson4.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ParkingTest {

    Parking target;

    @Before
    public void setUp() throws Exception {
        target = new Parking();
    }

    @After
    public void tearDown() throws Exception {
        target = null;
    }

    @Test
    public void getCars() {
    }

    @Test
    public void setCars() {
        // Given
        List<Car> testList = List.of(new Car(123));

        // When
        target.setCars(testList);

        // Then
        assertEquals(1, target.getCars().size());
    }

    @Test
    public void park() {

    }

    @Test
    public void checkCarOnParking() {
    }
}