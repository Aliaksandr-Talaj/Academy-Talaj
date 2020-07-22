package by.academy.deal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ProducerInfo {
String name();
String company();
String [] productType();
int number();
}
