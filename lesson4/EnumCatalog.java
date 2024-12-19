package lesson4;

public enum EnumCatalog {
    UKRAINE("Украина", "UA", 5000000),
    USA("США", "US", 15000000),
    RUSSIA("Россия", "RU", 20000000);

    private String name;
    private String land;
    private long peopleCount;

    EnumCatalog(String name, String land, long peopleCount) {
        this.name = name;
        this.land = land;
        this.peopleCount = peopleCount;
    }

    public String getName() {
        return name;
    }

    public String getLand() {
        return land;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    @Override
    public String toString() {
        return "EnumCatalog{" +
                "name='" + name + '\'' +
                ", land='" + land + '\'' +
                ", peopleCount=" + peopleCount +
                '}';
    }
}




