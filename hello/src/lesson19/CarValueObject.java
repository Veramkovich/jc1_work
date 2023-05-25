package lesson19;

import java.math.BigDecimal;

public class CarValueObject {

    private String model;
    private CarColor color;
    private BodyType bodyType;
    private short year;
    private int mileage;
    private String engineType;
    private byte maxSeats;
    private BigDecimal price;

    public CarValueObject() {
    }

    public CarValueObject(String model, CarColor color, BodyType bodyType, short year, int mileage, String engineType, byte maxSeats, BigDecimal price) {
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.year = year;
        this.mileage = mileage;
        this.engineType = engineType;
        this.maxSeats = maxSeats;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public byte getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(byte maxSeats) {
        this.maxSeats = maxSeats;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarValueObject{" +
                "model='" + model + '\'' +
                ", color=" + color +
                ", bodyType=" + bodyType +
                ", year=" + year +
                ", mileage=" + mileage +
                ", engineType='" + engineType + '\'' +
                ", maxSeats=" + maxSeats +
                ", price=" + price +
                '}';
    }
}



