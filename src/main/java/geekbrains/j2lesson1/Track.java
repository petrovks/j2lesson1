package geekbrains.j2lesson1;

public class Track implements Obstacle{
    private float distance;

    public float getDistance(){
        return distance;
    }

    public Track(float distance){
        this.distance = distance;
    }

    @Override
    public void doIt(Member member) {
        member.run();
    }
}
