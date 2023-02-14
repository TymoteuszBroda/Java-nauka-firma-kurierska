public class Klient {
    private String imie;
    private String nazwisko;
    private String miasto;
    private String ulica;
    private int numerDomu;

    public Klient(String imie, String nazwisko, String miasto, String ulica, int numerDomu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.ulica = ulica;
        this.numerDomu = numerDomu;


    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }
}
