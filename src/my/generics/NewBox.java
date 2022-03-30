package my.generics;

public class NewBox<T extends CharSequence> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
