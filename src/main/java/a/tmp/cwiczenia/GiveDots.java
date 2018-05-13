package a.tmp.cwiczenia;

public class GiveDots {

    public static void main(String[] args) {
        String text = "ala.. m.a.. ..ko.t.a";
        System.out.println(giveDots(text));

//        String[] aaa = "ala.. m.a.. ..ko.t.a".split("\\.");
//        System.out.println(aaa.length);
    }

    private static int giveDots(String text) {
        int result = 0;

//        String[] arrays = text.split("\\.");
//        for(String a : arrays){
//            System.out.print(a + "_");
//        }
        String newText = text.replace(".", "");
        result = text.length() - newText.length();
        
//        result = text.length() - arrays.length;
//        System.out.println(text.length());
//        System.out.println(arrays.length);

        return result;
    }
}
