package paczka.listyITablice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class MainClass {

    private static int a = 5;

    public static void main(String[] args) {
//        int a = 6;
//        System.out.println(a);
//        MyMethod();
//        MyMethod2();
//        System.out.println(a);

//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        a++;
//        System.out.println(a);
//
//        int b = a > 10 ? a-- : a++;
//        System.out.println(b);
//        System.out.println(a);
//
//        Integer c = a + b;
//        System.out.println(Integer.max(a, b));

        BigInteger bigInteger = new BigInteger("11111111111");
        BigInteger bigInteger1 = BigInteger.valueOf(222222222);

        BigInteger bigInteger2;
        bigInteger = BigInteger.valueOf(1111111111);
        System.out.println(bigInteger.subtract(bigInteger1));

        BigDecimal decimal1 = new BigDecimal("111111.222222");
        BigDecimal decimal2 = new BigDecimal("12345.123456");
        System.out.println(decimal1.subtract(decimal2));

        int[] array = {4, 5, 2, 8, 1, 9, 5};
        Arrays.sort(array);
        for(int a : array){
            System.out.print(a + " +");
        }
    }

    public static void MyMethod() {
        System.out.println(a);
        a = 7;
    }

    public static void MyMethod2() {
        System.out.println(a);
    }
}
