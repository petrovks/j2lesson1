package geekbrains.j2lesson1;

public class Main {
    public static void main(String[] args) {

        Team t = new Team("Комета", Players.values());


        Wall wall = new Wall(Hurdle.WALL.getDistance());
        Track track = new Track(Hurdle.TRACK.getDistance());

        track.doIt(t);
        wall.doIt(t);

        t.showResults();
    }
}
