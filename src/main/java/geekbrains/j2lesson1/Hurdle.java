package geekbrains.j2lesson1;

public enum Hurdle {
    WALL("стена", 1f),
    TRACK("беговая дорожка", 100.0f);

    private String name;
    private float distance;

    public String getName() {
        return name;
    }

    public float getDistance() {
        return distance;
    }

    Hurdle(String name, float distance) {
        this.name = name;
        this.distance = distance;
    }
}
