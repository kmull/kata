package targipracy.assecoGdynia;

import java.math.BigDecimal;
import java.util.Date;

public class MainTest_4 {

    private String imie;

    public MainTest_4() {
        this("brak");
    }

    public MainTest_4(String imie) {
        if (imie.equals("brak")) {
            System.out.println("Brak imienia");
        } else {
            System.out.println("Podane imie to: " + imie);
        }
    }

    public void daj(int a) {
    }

    public int daj(Integer a) {
        return 0;
    }


    public static void main(String[] args) {
//        System.out.println(myMethod(1, 2, 3, 4, 5));
//        System.out.println(new Date());
//        MainTest_4 test4 = new MainTest_4("ang");
        MainTest_4 test4 = new MainTest_4("ala");
        System.out.println(new BigDecimal(-100).signum());

    }

    public static int myMethod(int... x) {
        int result = 0;
        for (int tmp : x) {
            result += tmp;
        }
        return result;
    }
}
