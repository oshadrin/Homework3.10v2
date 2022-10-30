package transport;

public enum LoadCapacity {
    N1 ("с полной массой до 3,5 тонн"),
    N2 ("с полной массой свыше 3,5 до 12 тонн"),
    N3 ("с полной массой свыше 12 тонн");

    private final String description;
    LoadCapacity( String description) {
        if (description == null || description.isBlank()) {
            this.description = "Необходимо указаь описание";
        } else {
            this.description = description;
        }
    }
    public String getDescription() {
        return description;
    }
}
