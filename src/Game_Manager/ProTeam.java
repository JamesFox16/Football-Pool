package Game_Manager;

public class ProTeam extends Team{

    // Private values that are for the team ranks, and if a team has a rank.
    private int teamRank;
    private boolean isRanked;

    // Constant value that is used when a team doesn't have a rank.
    private final int NULL_RANK = -1;

    /*
     * The default constructor for the pro teams.
     */
    public ProTeam(String teamName, int teamWins, int teamLosses) {
        super(teamName, teamWins, teamLosses);
        this.isRanked = false;
        this.teamRank = NULL_RANK;
    }

    /*
     * Constructor that will be used when a team has a rank.
     */
    public ProTeam(String teamName,int teamRank, int teamWins, int teamLosses) {
        super(teamName, teamWins, teamLosses);
        this.isRanked = true;
        this.teamRank = teamRank;
    }

    /*
     * Method that will be called when a function needs to know the rank of a team.
     */
    public int getTeamRank() {
        if (this.isRanked) {
            return this.teamRank;
        }else {
            return NULL_RANK;
        }
    }

    /*
     * Call that will be called to see if the team has a rank assigned to them.
     */
    public boolean checkIfRanked() {
        return this.isRanked;
    }
}
