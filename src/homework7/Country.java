package homework7;

public enum Country {
    POLAND("Poland", Continent.EUROPE),
    FRANCE("France", Continent.EUROPE),
    UKRAINE("Ukraine", Continent.EUROPE),
    ARGENTINA("Argentina", Continent.SOUTH_AMERICA),
    USA("USA", Continent.NORTH_AMERICA),
    AUSTRALIA("Australia", Continent.OCEANIA),
    ISRAEL("Israel", Continent.ASIA);

    private String countryName;
    private Continent continent;

    Country(String name, Continent continent) {
        this.countryName = name;
        this.continent = continent;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }
}
