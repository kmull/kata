package pl.test1;

public class Main {

//    private static void print(Person person, Interface1 cheker) {
//        System.out.println("Result " + cheker.funkcja1(person));
//    }

    private static void oblicz(ClassOblicz classOblicz, Interface2 zmienna) {
        System.out.println("wynik a + b = " + zmienna.funkcja(classOblicz.getA(), classOblicz.getB()));
    }

    public static void main(String[] args) {
//        Person person = new Person("Adam", "Mickiewicz", 67);
//        print(person, p -> p.getImie());

        int a = 7;
        int b = 8;
        ClassOblicz classOblicz = new ClassOblicz(a, b);
//        oblicz(classOblicz, p -> {return classOblicz.getA() + classOblicz.getB() ;});

//        print(person, new Osoba());
    }
}
