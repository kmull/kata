package codeWars.kata8.bonus;

public class Bonus {

    public static void main(String[] args) {
        System.out.println("\u00A3");
        System.out.println(bonusTime(1000, true));
        System.out.println(bonusTime(1000, false));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
//        return bonus ? "\u00A3" + String.valueOf(salary * 10)
//                : "\u00A3" + String.valueOf(salary);

        return "\u00A3" + (bonus ? 10 : 1) * salary;
    }

}
