package lesson19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class CarController {

    public static void main(String[] args) {
        try {
            CarController controller = new CarController();
            final List<CarValueObject> carValueObjects = controller.readFromFile(new File(args[0]));
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public List<CarValueObject> readFromFile(File file) throws IOException {
        return new BufferedReader(new FileReader(file))
                .lines()
                .map(s -> s.split(","))
                .map(ars -> new CarValueObject(
                                ars[0],
                                CarColor.BLACK,
                                BodyType.COUPE,
                                Short.parseShort(ars[3]),
                                Integer.parseInt(ars[4]),
                                ars[5],
                                Byte.parseByte(ars[6]),
                                new BigDecimal(ars[7])
                        )
                )
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

}
