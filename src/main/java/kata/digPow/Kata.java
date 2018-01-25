package kata.digPow;

public class Kata {

    public static String solution(String str) {

        char[] strTab = str.toCharArray();
        StringBuilder strB = new StringBuilder();

        for (int i = strTab.length - 1; i >= 0; i--) {
            strB.append(strTab[i]);
        }
        return strB.toString();
    }

    public static String solution1(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    public static String solution2(String str) {

        StringBuilder strB = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            strB.append(str.charAt(i));
        }

        return strB.toString();
    }


    public static void main(String[] args) {

        System.out.println(solution("world"));
        System.out.println(solution("abcdefghijk"));
        System.out.println(solution1("12345"));
        System.out.println(solution2("1234567"));
    }
}

//Kata.solution("world") //return "dlrow"