public class Pokoj {
    boolean czyOtwarty;
    int iloscOkien;
    double powierzchnia=0;
    int numerPietra;
    boolean czyJestCzysto; // generalnie atrybuty w klasie powinno sie robic prywatne i uzywac getterow i setterow do wyciagania wartosci

    void obliczPowierzchnie (double szerokosc, double dlugosc)
    {
        powierzchnia=szerokosc*dlugosc;
    }

    void pokazPowierzchnie()
    {
        System.out.println(powierzchnia);
    }

    //tu bedzie setter;
    void setIloscOkien(int iloscOkien)
    {
        this.iloscOkien=iloscOkien;
    }

    //GETTER
    int  getIloscOkien()
    {
        return iloscOkien;
    }

}
