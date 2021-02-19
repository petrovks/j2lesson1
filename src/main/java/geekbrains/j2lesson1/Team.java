package geekbrains.j2lesson1;

public class Team implements Member {
    private String name;
    private final int SIZE_OF_TEAM = 4;
    private String[] players = new String[SIZE_OF_TEAM];
    private float[] plDistance = new float[SIZE_OF_TEAM];
    private float[] plJump = new float[SIZE_OF_TEAM];
    private boolean[] onDistance = new boolean[SIZE_OF_TEAM];


    public Team(String name, Players[] pl) {
        this.name = name;
        for(int i = 0; i < SIZE_OF_TEAM; i++){
            this.players[i] = pl[i].getSurname();
            this.plDistance[i] = pl[i].getMaxDistance();
            this.plJump[i] = pl[i].getMaxJump();
            this.onDistance[i] = true;

        }
    }

    public void infoTeam() {
        System.out.print("Команда " + this.name + ". Состав команды: ");
        for (String s: players) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void showResults() {
        for (int i = 0; i < SIZE_OF_TEAM; i++) {
            if(onDistance[i]){
                System.out.println(Players.values()[i].getSurname() + " прошел все испытания");
            }
            else {
                System.out.println(Players.values()[i].getSurname() + " не прошел испытания");
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < SIZE_OF_TEAM; i++) {
            if(onDistance[i] == false) continue;

            if (Hurdle.TRACK.getDistance() <= Players.values()[i].getMaxDistance() &&
                    Players.values()[i].getSurname().equals(players[i])
            ){
                System.out.println(players[i] + " пробежал "  + Hurdle.TRACK.getDistance() + " на " + Hurdle.TRACK.getName());
            }
            else {
                System.out.println(players[i] + " не пробежал. Выбыл");
                onDistance[i] = false;
            }
        }
        System.out.println();
    }

    @Override
    public void jump() {
        for (int i = 0; i < players.length; i++) {
            if(onDistance[i] == false) continue;

            if (Hurdle.WALL.getDistance() <= Players.values()[i].getMaxJump() &&
                    Players.values()[i].getSurname().equals(players[i])
            ){
                System.out.println(players[i] + " преодолел " + Hurdle.WALL.getName() + " высотой " + Hurdle.WALL.getDistance());
            }
            else {
                System.out.println(players[i] + " не прошел испытания. Выбыл");
                onDistance[i] = false;
            }
        }
        System.out.println();
    }
}
