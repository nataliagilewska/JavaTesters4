public class Samochod {
    String marka;
    String kolor;
    Double iloscPaliwa;
    Integer przebieg;

    Samochod()
    {

    }
    Samochod(String marka,String kolor,Double iloscPaliwa,Integer przebieg)
    {
        this.marka=marka;
        this.kolor=kolor;
        this.iloscPaliwa=iloscPaliwa;
        this.przebieg=przebieg;
    }

    void ilePaliwa()
    {
        System.out.println("Ilosc paliwa w baku: "+iloscPaliwa);
    }
    void tankuj(int ile)
    {
        iloscPaliwa+=ile;
        System.out.println("Ilosc paliwa po dolewce: "+iloscPaliwa);
    }
    void jakiPrzebieg()
    {
        System.out.println("Przebieg samochodu: "+przebieg);
    }

    void jedz(int ileJechac)
    {
        iloscPaliwa=iloscPaliwa- (ileJechac * 0.4);
        if (iloscPaliwa<0)
        {
            iloscPaliwa=0.0;
        }
    }



}
