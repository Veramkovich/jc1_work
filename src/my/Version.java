package my;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.PACKAGE, ElementType.TYPE})
public @interface Version {

    String number();

}
