package paczka.lambdy;

public class MainClass_2 {

    public static void main(String[] args) {
        String string1 = "120";
        String string2 = "240";

        MyInterface_1 interface1 = (a, b) -> Integer.valueOf(a) + Integer.valueOf(b);
        Integer addStrings = interface1.fromStringToInteger(string1, string2);

        MyInterface_2 interface2 = (a) -> System.out.println(a);
        interface2.view(addStrings);

        MyInterface_1 interface11 = (a, b) -> Integer.valueOf(a) + Integer.valueOf(b);
        System.out.println(myMethod("11", "22", interface11));
    }

    public static Integer myMethod(String a, String b, MyInterface_1 interface1){
        return interface1.fromStringToInteger(a, b);
    }

}
