package my.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TryAndCatch {

    private static final Logger log = Logger.getLogger("TryAndCatch");

    public double divide(Integer a, Integer b) throws MyException {
        if (b == null) {
            throw new MyException("b is null");
        }
        return a / b;
    }

    public void doTryCatch(Integer a, Integer b) {
        try {
            System.out.println(divide(a, b));
        } catch (NullPointerException | MyException e) {
            System.out.println("Catch " + e);
        }
    }

    public static void main(String[] args) {
        try {
            new TryAndCatch().doTryCatch(1, 0);
        } catch (Exception e) {
            log.log(Level.WARNING, "Please check input", e);
        } finally {
            System.out.println("Finish");
        }
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}