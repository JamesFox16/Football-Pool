package User_Manager;

import javax.swing.*;
import java.awt.*;

public class UserProfile {

    private final int NULL_VALUE = -1;

    private User user;
    private int weekPoints;
    private int seasonPoints;
    private int totalPoints;
    private int weekRank;
    private int seasonRank;
    private int totalRank;


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

    /*
     * This method will get the week ranking of the user compared to the other users in the database.
     */
    private void getUserWeekRank() {
        this.weekRank = NULL_VALUE;
    }

    /*
     * This method will get the season ranking of the user compared to the other user in the database.
     */
    private void getUserSeasonRank() {
        this.seasonRank = NULL_VALUE;
    }

    /*
     * This method will get the total (all time) ranking of the user compared to the other users in the database.
     */
    private void getUserTotalRank() {
        this.totalRank = NULL_VALUE;
    }
}
