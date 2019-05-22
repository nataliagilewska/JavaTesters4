public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Pokoj machuPikchu=new Pokoj();
        machuPikchu.pokazPowierzchnie();
        machuPikchu.obliczPowierzchnie(10,10);
        machuPikchu.pokazPowierzchnie();

        machuPikchu.setIloscOkien(4);

        //ZAD1.
        Czlowiek czlowiek1 = new Czlowiek("Antek", "Kowalski");
        Czlowiek czlowiek2 = new Czlowiek("Mietek", "Jankowski");
        czlowiek1.przedstawSie();
        czlowiek2.przedstawSie();

        //ZAD 2.
        Ksiazka ksiazka1=new Ksiazka();
        ksiazka1.coToZaKsiazka();
        ksiazka1.czytaj(5);
        System.out.println("Ilosc pozostalych stron: "+ksiazka1.iloscPozostalychStron);
        if (ksiazka1.czyPrzeczytana()==true)
        {
            System.out.println("Ksiazka przeczytana");
        }
        else
            System.out.println("Ksiazka nieprzeczytana");


        //Zad 3

        Samochod samochod1 = new Samochod("Fiat","Czerwony",5.20,200);
        //System.out.println("Paliwo samochod1: " +samochod1.iloscPaliwa);
        samochod1.ilePaliwa();
        samochod1.tankuj(5);
        samochod1.jedz(1);


    }
}
