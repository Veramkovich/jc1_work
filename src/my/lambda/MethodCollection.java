package my.lambda;

@FunctionalInterface
interface Bubblable {
    Bubble get();
}

public class MethodCollection {

    public static void doBubble(Bubblable bubblable) {
        Bubble bubble = bubblable.get();
        System.out.println(bubble);
    }

    public static void main(String[] args) {
        doBubble(Bubble::new);
    }
}

class Bubble {
    public Bubble() {
    }
}
