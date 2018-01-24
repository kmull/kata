package pl.test2;

public class Animal {

    String imie;
    int wiek;

    public Animal(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
