package pl.camelCase;

public class test {

    public static void main(String[] args) {

        String a = "aaaBaa";

        char[] c = a.toCharArray();
//        Character[] cc = c;

//        Pattern p = Pattern.compile("[A-Z]*");

        System.out.println(a.contains("[A-Z]*"));
        System.out.println(a.contains(a.toUpperCase()));
        System.out.println();
    }
}
