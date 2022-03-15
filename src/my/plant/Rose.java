package my.plant;

import java.lang.String;

public final class Rose {

    /*public String s1;
    protected String s2;
    private String s3;
    String s4;*/

    private final String color;

    public final String getColor() {
        return color;
    }

    static int objectCounter = 0;

    public static int getObjectCounter() {
        return objectCounter;
    }


    public Rose(String color) {
        System.out.println("constructor: " + color);
        objectCounter++;
        this.color = color;
    }

    public static boolean isPlant() {
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        objectCounter--;
    }
}
