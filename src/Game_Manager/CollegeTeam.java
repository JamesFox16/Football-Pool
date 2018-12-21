package Game_Manager;

public class CollegeTeam extends Team{

    // Private data for the college team.
    private int teamRank;
    private boolean isRanked;

    // Constant for the rank of a team that is not ranked.
    private final int NULL_RANK = -1;

    /*
     * This is the default constructor for the college team. It will take the name of the team and since there is no
     * rank, it will set the boolean that signifies if the team is ranked to false.
     */
    public CollegeTeam(String teamName, int teamWins, int teamLosses) {
        super(teamName, teamWins, teamLosses);
        this.isRanked = false;
    }

    /*
     * This constructor is for when a college team object is made that has a rank.
     * This will set the boolean that signifies if the team is ranked to true and will set the value for the rank.
     */
    public CollegeTeam(String teamName, int teamRank, int teamWins, int teamLosses) {
        super(teamName, teamWins, teamLosses);
        this.teamRank = teamRank;
        this.isRanked = true;
    }

    /*
     * This method is called to get the rank of the team. If there is no rank for the team it will return the value that
     * is set to show that the team is not ranked in the NULL_RANK variable which is equal to -1.
     */
    public int getTeamRank() {
        if (this.isRanked) {
            return this.teamRank;
        }else{
            return NULL_RANK;
        }
    }

    /*
     * This method will return the value of the boolean of if the team is ranked or not.
     */
    public boolean checkIfRanked() {
        return this.isRanked;
    }

}
