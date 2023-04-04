package lesson8;

public final class ImmutableMan {

    private final int hairLength;
    private final String name;
    private final MutableAddress address;

    public ImmutableMan(String name, int hairLength, MutableAddress address) {
        this.name = name;
        this.hairLength = hairLength;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getHairLength() {
        return hairLength;
    }

    public MutableAddress getAddress() {
        return new MutableAddress(
                address.getCity(), address.getStreet()
        );
    }
}

class MutableAddress {
    private String city;
    private String street;

    public MutableAddress(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

