public class Czlowiek {

    private String imie;
    private String nazwisko;

    public Czlowiek()
    {

    }

    public Czlowiek(String imie, String nazwisko)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
    }

    void przedstawSie()
    {
        System.out.println("Nazywam sie "+ imie+" "+ nazwisko);
    }



}
