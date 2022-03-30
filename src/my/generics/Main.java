package my.generics;

public class Main {

    public static void main(String[] args) {
        String s = "some value";

        OldBox oldBox = new OldBox();
        oldBox.setValue(s);
        if (oldBox.getValue() instanceof String) {
            String s2 = (String) oldBox.getValue(); //First problem
            System.out.println(s2);
        }

        NewBox<String> newBox = new NewBox<>();
        newBox.setValue(s);
        String s3 = newBox.getValue();
        System.out.println(s3);
    }

    //Example 1:
    public static boolean doSomething(NewBox<? super String> newBoxValue) {
        String value = (String) newBoxValue.getValue();
        System.out.println(value);
        return true;
    }

    //Example 2: generics methods
    public static <S> S sortSomething(S[] values) {
        S var1 = null;
        System.out.println("Sorting");
        return var1;
    }
}
