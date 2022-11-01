package transport;

public enum Capacity {
    VARY_SMALL(1, 10),
    SMALL(11, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    VERY_LARGE(100, 120);

    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}


