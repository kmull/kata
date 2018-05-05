package paczka.listyITablice;

public class MyImplementsAbstract extends MyAbstract {

    @Override
    public String cosTam(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        MyAbstract myAbstract = new MyImplementsAbstract();
        System.out.println(myAbstract.setName("Adam"));

        System.out.println(myAbstract.cosTam("Karol", "Lewkowski"));
    }
}
