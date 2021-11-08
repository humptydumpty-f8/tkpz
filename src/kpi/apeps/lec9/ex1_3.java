package kpi.apeps.lec9;

/**
 * Відношення асоціації між класами
 * Клас Team асоціює клас Player
 */

public class ex1_3 {

    //Клас-ассоціація
    static class Team {
        String teamName;
    }

    //Асоційований клас
    static class Player
    {
        String playerName;
        Team team;
    }

    public static void main(String[] args) {
        Team team = new Team();

        Player player = new Player();
        player.team = team;
    }
}
