public class Kurier
{
    private String imie;
    private String nazwisko;
    private int id;
    private boolean wolny;


    public Kurier(String imie, String nazwisko, int id, boolean wolny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
        this.wolny = wolny;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isWolny() {
        return wolny;
    }

    public void setWolny(boolean wolny) {
        this.wolny = wolny;
    }


}
