package geekbrains.j2lesson1;

public enum Players {
    PETROV("Петров", 100.0f, 1.0f),
    POLOSOV("Полосов", 80.0f, 1.2f),
    KOZLOV("Козлов", 110.0f, 1.1f),
    VERETENZEV("Веретенцев", 70.0f, 0.8f);

    private String surname;
    private float maxJump;
    private float maxDistance;


    public String getSurname() {
        return surname;
    }

    public float getMaxJump() {
        return maxJump;
    }

    public float getMaxDistance() {
        return maxDistance;
    }

    Players(String surname, float maxDistance, float maxJump) {
        this.surname = surname;
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;

    }
}
