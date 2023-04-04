package lesson8;

public class Main {

    public static void main(String[] args) {
        ImmutableMan man = new ImmutableMan("Vasia",
                100,
                new MutableAddress("Minsk", "Lenina 1"));

        System.out.println(man.getName() + " "
                + man.getHairLength() + " "
                + man.getAddress());

        man.getAddress().setCity("Leningrad");
        man.getAddress().setStreet("Stroiteley 5");

        System.out.println(man.getName() + " "
                + man.getHairLength() + " "
                + man.getAddress());
    }

}
