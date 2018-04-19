package pl.developers.mod;

public enum Status {
    WOLNE ("Wolne"),
    ZAREZERWOWANE ("Zarezerwowane"),
    SPRZEDANE ("Sprzedane");

    String name;

    Status(String name) {
        this.name = name;
    }


}
