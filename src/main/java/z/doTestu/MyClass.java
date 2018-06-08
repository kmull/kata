package z.doTestu;

public class MyClass implements MyInterface_2 {

    public static void main(String[] args) {
        System.out.println(lang);
        MyInterface_2 obiekt = new MyClass();
        obiekt.cosTam();
    }

    @Override
    public String mojDom() {
        return null;
    }

    @Override
    public int myAge(int a) {
        return 0;
    }

    @Override
    public void cosTam() {
        System.out.println("cosTAM");
    }
}
