package Game_Manager;

public class ProTeam extends Team{

    private int teamRank;
    private boolean isRanked;

    private final int NULL_RANK = -1;

    public ProTeam(String teamName, int teamWins, int teamLosses) {
        super(teamName, teamWins, teamLosses);
        this.isRanked = false;
        this.teamRank = NULL_RANK;
    }

    public ProTeam(String teamName,int teamRank, int teamWins, int teamLosses) {
        super(teamName, teamWins, teamLosses);
        this.isRanked = true;
        this.teamRank = teamRank;
    }

    public int getTeamRank() {
        if (this.isRanked) {
            return this.teamRank;
        }else {
            return NULL_RANK;
        }
    }

    public boolean checkIfRanked() {
        return this.isRanked;
    }
}
