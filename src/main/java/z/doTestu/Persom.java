package z.doTestu;

public abstract class Persom {
    public final String ja;

    public Persom(String ja) {
        this.ja = ja;
    }

    public void cosTam() {
        System.out.println("cos tam");
    }

    public abstract void inneCosTam();
}
