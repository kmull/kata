package paczka.nauka.porownaj;

public class MainClass {

    public static void main(String[] args) {

//        String a = "abc";
//        String b = "abc";
//        String c = "abd";
//        String aabb = new String("abc");
//
//        String aa = new String("ccc");
//        String bb = new String("ccc");
//
//        System.out.println(a == b);       // true
//        System.out.println(a == aabb);    // false
//        System.out.println(aa == bb);     // false
//        System.out.println(a == c);       // false
//        System.out.println();
//
//        System.out.println(a.equals(b));     // true
//        System.out.println(a.equals(c));     // false
//        System.out.println(aa.equals(aabb)); // false
//        System.out.println(a.equals(aabb));  // true

        Integer i1 = 10;
        Integer i2 = 10;
        Integer i11 = new Integer(10);
        Integer i12 = new Integer(10);

        System.out.println("i1/i2");
        System.out.println(i1 == i2);       // true
        System.out.println(i1.equals(i2));  // true
        System.out.println();

        System.out.println(i1 == i11);      // false
        System.out.println(i1.equals(i11)); // true
        System.out.println();

        System.out.println(i11 == i12);      // false
        System.out.println(i11.equals(i12)); // true
        System.out.println();

        System.out.println("hashcode: ");
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i11.hashCode());
        System.out.println(i12.hashCode());
//        String gg = String.valueOf(10);
        System.out.println(String.valueOf(10).hashCode());

    }

}
