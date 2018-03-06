package pl.kata.encrypt;

public class BasicEncrypt {
    public static String encrypt(String text, int rule) {

        String abc = "";
        for (int i = 0; i < text.length(); i++) {
            if (i == 0 && text.charAt(i) == 32) {
                abc += " ";
            } else {
                abc += String.valueOf((char) ((text.charAt(i) + rule) % 256));
            }
        }
        return abc;
    }
    public static String encrypt2(String text, int rule) {
        StringBuilder result = new StringBuilder("");

        for(char c : text.toCharArray()){
            result.append(Character.toChars((c + rule) %256));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(encrypt("a", 1));
        System.out.println(encrypt(" ", 1));
        System.out.println(encrypt("please encrypt me", 2));
        System.out.println(encrypt("rngcug\"gpet{rv\"og", -2));
        System.out.println(encrypt("dhohkimiy rule", 277));

        System.out.println(encrypt2("a", 1));
        System.out.println(encrypt2(" ", 1));
        System.out.println(encrypt2("please encrypt me", 2));
        System.out.println(encrypt2("rngcug\"gpet{rv\"og", -2));
        System.out.println(encrypt2("dhohkimiy rule", 277));
    }
}

//    assertEquals("text = '', rule = 1", "",
//                 enc.encrypt("", 1));
//        assertEquals("text = 'a', rule = 1", "b",
//        enc.encrypt("a", 1));
//        assertEquals("text = 'please encrypt me', rule = 2", "rngcug\"gpet{rv\"og",
//        enc.encrypt("please encrypt me", 2));