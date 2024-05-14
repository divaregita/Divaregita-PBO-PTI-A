public class Main {
    public static void main(String[] args) {
        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Andri", 100);
        hero1.display();

        // upcasting
        Hero heroUp = hero1; // upcasting ke Hero
        heroUp.display();
        // System.out.println(heroUp.getType()); //ini error karena type hanya ada di HeroIntel

        // Object dengan class Hero
        Hero heroReg = new Hero("Dimas", 100);
        heroReg.display();

        // downcasting
        // HeroAgility heroDown = (HeroAgility) heroReg; //ini error karena heroReg bukan instance HeroAgility
        // heroDown.display();

        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp; // downcasting kembali ke HeroIntel
        hero2.display(); // ini berhasil downcasting

        // Coba akses langsung atribut type dari class Main
        System.out.println(hero1.type); // berhasil karena type public

        // Object dengan class HeroMagic
        HeroMagic heroMagic = new HeroMagic("Bintang", 120);
        heroMagic.display();

        // upcasting ke Hero
        Hero heroMagicUp = heroMagic;
        heroMagicUp.display();

        // downcasting kembali ke HeroMagic
        HeroMagic heroMagicDown = (HeroMagic) heroMagicUp;
        heroMagicDown.display();
    }
}
