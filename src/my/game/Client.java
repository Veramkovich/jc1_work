package my.game;

public class Client {

    public static void main(String[] args) {
        Fighter fighter = new WizzardAdapter();

        fighter.attack();
        fighter.defend();
        fighter.escape();
    }
}
