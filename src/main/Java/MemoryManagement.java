package Java;

import org.openjdk.jol.vm.VM;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MemoryManagement {
    private final static String str = "Ali";

    public static void main(String[] args) {
        System.out.println(VM.current().addressOf(str));
        System.out.println(VM.current().addressOf(getMemoryAddress(str)));
        System.out.println(VM.current().addressOf(getMemoryAddress("Ali")));
//        System.out.println(VM.current().details());
        System.out.println("----------------");

        List<String> names = new ArrayList<>();
        names.add("Umar");
        names.add("Ali");
        names.add("Hassan");
        names.add("Hira");
        for(String name: names){
            System.out.println(getMemoryAddress(name));
//            printMemoryAddress(name);
        }
        System.out.println("----------------");
        List<String> _names = new LinkedList<>();
        _names.add("Umr");
        _names.add("Ali");
        _names.add("Hsn");
        _names.add("Hra");
        for(String name: _names){
            printMemoryAddress(name);
        }
    }
    public static String getMemoryAddress(String name){
        System.out.println(VM.current().addressOf(name));
        return name;
    }
    public static void printMemoryAddress(String name){
        System.out.println(VM.current().addressOf(name));
    }
}
