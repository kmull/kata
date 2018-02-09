package pl.kata.order;

public class Order {

    public static void main(String[] args) {
//        System.out.println(order("To2 jes4t mo1j 5pierwszy tek3st"));
//        System.out.println(order(""));

        System.out.println(order2("To2 jes4t mo1j 5pierwszy tek3st"));
        System.out.println(order2(""));
    }

    public static String order(String words) {
        String[] str = words.split(" ");
        StringBuilder result = new StringBuilder("");
        String[] orderString = new String[str.length];

        for (String a : str) {
            for (char z : a.toCharArray()) {
                if (z >= 49 && z <= 57) {
                    orderString[Integer.parseInt(String.valueOf(z)) - 1] = a;
                }
            }
        }
        for (String temp : orderString) {
            result.append(temp).append(" ");
        }
        if (result.toString().equals("null")) {
            return "";
        }
        return result.toString().trim();
    }

    public static String order2(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i <= arr.length; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }

        return result.toString().trim();
    }
}
