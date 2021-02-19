package geekbrains.j2lesson1;

public class Wall implements Obstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public void doIt(Member member) {
        member.jump();
    }
}
