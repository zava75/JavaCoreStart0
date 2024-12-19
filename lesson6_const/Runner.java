package lesson6_const;

public class Runner {
    public static void main(String[] args) {

        Country germany = GuidCountry.GERMANY;
        Country italy = GuidCountry.ITALY;
        Country ukraine = GuidCountry.UKRAINE;

        System.out.println(germany.getLanguage());
        System.out.println(italy.getLanguage());
        System.out.println(ukraine.getLanguage());

        System.out.println("_______________________________");

        System.out.printf("""
                Украина население %d
                Язык : %s
                Континент : %s \n""", ukraine.getCountPeoples(), ukraine.getLanguage(), ukraine.getContinent() );

        System.out.println("_______________________________");

        ukraine.toInfo();
        germany.toInfo();
        italy.toInfo();


    }
}
