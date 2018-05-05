package paczka.listyITablice;

public class MainClassLists_2 {

    public MainClassLists_2(int i1){
        this(i1, "brak");
    }
    public MainClassLists_2(int i1, String s1){
        System.out.println(i1 + " " + s1);
    }

    public static void main(String[] args) {
        MainClassLists_2 m1 = new MainClassLists_2(7);
        MainClassLists_2 m2 = new MainClassLists_2(1, "abc");
    }

}
