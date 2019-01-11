package User_Manager;

public class UserProfile {

    private final int NULL_VALUE = -1;

    private User user;
    private int weekPoints;
    private int seasonPoints;
    private int totalPoints;


    public UserProfile(User user) {
        this.user = user;
        setWeekPoints();
        setSeasonPoints();
        setTotalPoints();
    }

    /*
     * This method will call to the database to get the value of the users week points and will set the variable
     * weekPoints to the value from the database for that user. If the user does not exist or cannot be found in the
     * database the default NULL_VALUE will be the set value as -1.
     */
    private void setWeekPoints() {
        this.weekPoints = NULL_VALUE;
    }

    /*
     * This method will call to the database to get the value of the users week points and will set the variable
     * seasonPoints to the value from the database for that user. If the user does not exist or cannot be found in the
     * database the default NULL_VALUE will be the set value as -1.
     */
    private void setSeasonPoints() {
        this.seasonPoints = NULL_VALUE;
    }

    /*
     * This method will call to the database to get the value of the users week points and will set the variable
     * totalPoints to the value from the database for that user. If the user does not exist or cannot be found in the
     * database the default NULL_VALUE will be the set value as -1.
     */
    private void setTotalPoints() {
        this.totalPoints = NULL_VALUE;
    }
}
