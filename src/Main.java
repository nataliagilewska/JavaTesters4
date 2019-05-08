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

    }
}
