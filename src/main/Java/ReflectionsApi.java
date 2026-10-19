package Java;

import java.io.Console;
import java.lang.Class;

import static Java.ReflectionsApi.E.A;

public class ReflectionsApi {
    enum E { A, B }

    public static void main(String[] args){
        System.out.println("from reflectionsapi class");
        java.lang.Class<? extends Console> c = System.console().getClass();
        System.out.println(c);

        Class<? extends E> c2 = A.getClass();
        System.out.println(c2);

        byte[] bytes = new byte[1024];
        Class c3 = bytes.getClass();
        System.out.println(c3);

    }
}
