package paczka.nauka.porownaj;

public class MainClass {

    public static void main(String[] args) {

        String a = "abc";
        String b = "abc";
        String c = "abd";
        String aabb = new String("abc");

        String aa = new String("ccc");
        String bb = new String("ccc");

        System.out.println(a == b);
        System.out.println(a == aabb);
        System.out.println(aa == bb);
        System.out.println(a == c);
        System.out.println();

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(aa.equals(aabb));
        System.out.println(a.equals(aabb));

//        Integer i1 = 10;
//        Integer i2

    }

}
