package my.plant;

public class MyString {

    public static void modifyRose() {

        Rose rose = new Rose("white");

        Rose.getObjectCounter();

        System.out.println(rose.getColor());
        //rose.getColor() = "red";

        rose = new Rose("red");
        System.out.println(rose.getColor());
    }

    public static void main(String[] args) {
        modifyRose();
    }

}
