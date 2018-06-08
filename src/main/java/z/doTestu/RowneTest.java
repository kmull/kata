package z.doTestu;

public class RowneTest {

    public static void main(String[] args) {

        Integer a1 = new Integer(5);
        Integer a2 = new Integer(5);

        Integer b1 = 5;
        Integer b2 = 5;

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println();

        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println();

        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));
    }

}
