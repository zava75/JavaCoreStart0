package lesson6_const;

public class Country {

    private long countPeoples;
    private String language;
    private String continent;

    public Country(long countPeoples, String language, String continent) {
        this.countPeoples = countPeoples;
        this.language = language;
        this.continent = continent;
    }

    public long getCountPeoples() {
        return countPeoples;
    }

    public String getLanguage() {
        return language;
    }

    public String getContinent() {
        return continent;
    }

    public void toInfo() {
        System.out.printf("язык %s континент %s население %d%n", language, continent, countPeoples);
    }
}
