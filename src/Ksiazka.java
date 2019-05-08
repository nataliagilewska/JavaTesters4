public class Ksiazka {
    private String tytul ="Madra ksiazka";
    private String autor = "Pan Autor";
    private int iloscStron = 1600;
    private int iloscPrzeczytanychStron=0;

    Ksiazka()
    {

    }
    void coToZaKsiazka()
    {
    System.out.println(tytul);
    }

    boolean czyPrzeczytana(int przeczytane)
    {
       int pom =iloscStron-przeczytane;
       iloscPrzeczytanychStron+=przeczytane;
       if (pom==0) return true;
       else return false;
    }
    void czytaj(int ileStron)//ma dodawac te strony do ilosci przeczytanych stron
    {
    
    iloscPrzeczytanychStron+=ileStron;

    }
}
