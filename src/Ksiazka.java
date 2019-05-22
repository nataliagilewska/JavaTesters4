public class Ksiazka {
    private String tytul ="Madra ksiazka";
    private String autor = "Pan Autor";
    private int iloscStron = 1600;
    private int iloscPrzeczytanychStron=0;
    int iloscPozostalychStron = 1600;

    Ksiazka()
    {

    }
    void coToZaKsiazka()
    {
    System.out.println("Tytul: "+ tytul+" Autor: "+ autor);
    }
    void czytaj(int ileStron)
    {
        iloscPozostalychStron = iloscStron-ileStron;
        if (iloscPozostalychStron<0)
        {
            iloscPozostalychStron=0;
        }
    }

    boolean czyPrzeczytana()
    {
       if (iloscPozostalychStron==0) //to zwiekszy ilosc stron tylko dla obiektu na ktorym wywolalam metode, np dla ksiazki1, a w ksiazce 2 dalej zostanie 0
       return true;
       else return false;
    }

}
