package my.lambda;

public class Client {

    private MusicBox musicBox;

    public Client() {
        this.musicBox = new MusicBox();
    }

    public static void main(String[] args) {
        new Client().selectMusic(12);
    }

    private void advertisement(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("Advertisement is playing " + i);
        }
    }

    public void selectMusic(int moneyInPocket) {
        musicBox.payForMusic((x) -> {
                    System.out.println("Price: $" + x);
                    int res = moneyInPocket - x;
                    System.out.println("Pay : $" + moneyInPocket);
                    return res;
                })
                .playRecord(() -> System.out.println("Madonna - Frozen"))
                .playAdd(this::advertisement)
                .playRecord(() -> System.out.println("Metallica - Sad but true"));
    }

}
