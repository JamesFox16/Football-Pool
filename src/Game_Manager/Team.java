package Game_Manager;

public class Team {

    private String teamName;
    private int teamWins;
    private int teamLosses;

    public Team(String teamName, int teamWins, int teamLosses) {
        this.teamName = teamName;
        this.teamWins = teamWins;
        this.teamLosses = teamLosses;
    }

    // Get the name of the team from the object.
    public String getTeamName() {
        return this.teamName;
    }

    public int getTeamWins() {
        return this.teamWins;
    }

    public int getTeamLosses() {
        return this.teamLosses;
    }

}
