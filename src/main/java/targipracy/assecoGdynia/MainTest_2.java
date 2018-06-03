package targipracy.assecoGdynia;

public class MainTest_2 {

    public static void main(String[] args) {

        Integer z1 = 8;
        Integer z2 = 8;

        Integer x1 = new Integer(8);
        Integer x2 = new Integer(8);

        System.out.println(z1 == z2);
        System.out.println(x1 == x2);
        System.out.println(x1.hashCode() + " " + x2.hashCode());

        System.out.println(z1.equals(z2));
        System.out.println(x1.equals(x2));
        System.out.println(z1 == x1);
        System.out.println(z1.equals(x1));

    }

}
