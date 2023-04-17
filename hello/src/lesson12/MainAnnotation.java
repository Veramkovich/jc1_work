package lesson12;

import java.util.Date;

public class MainAnnotation {


    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.getHours());

        MyAnnotatedClass myAnnotatedClass = new MyAnnotatedClass();
        System.out.println(myAnnotatedClass);
        final HelloWorldAnnotation annotation =
                myAnnotatedClass.getClass().getAnnotation(HelloWorldAnnotation.class);
        for (int i = 0; i < annotation.count(); i++) {
            System.out.println(annotation.message());
        }
    }
}

@HelloWorldAnnotation(message = "Hello World", count = 5)
class MyAnnotatedClass {

}

@HelloWorldAnnotation(message = "Hello World", count = 5)
class Letter {
    private String message; // Letter message
    private int count; // Letter count

}