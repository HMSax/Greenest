public enum Nutrienttype {
    PROTEINDRINK("protein drink"),
    TAPWATER("tap water"),
    MINERALWATER("mineral water");

    private final String type;

    Nutrienttype(String s) {
        this.type = s;
    }

    public String getType() {
        return type;
    }
}
