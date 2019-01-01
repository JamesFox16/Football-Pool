package User_Manager;

public class User {

    private final String SET_STRING_NULL = "NULL";

    private String name;
    private String username;
    private String userID;

    public User() {
        this.name = SET_STRING_NULL;
        this.username = SET_STRING_NULL;
        this.userID = SET_STRING_NULL;
    }

    public User(String name, String username, String userID) {
        this.name = name;
        this.username = username;
        this.userID = userID;
    }

    public User(String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public String getUserName() {
        return this.username;
    }

    public String getUSerID() {
        return this.userID;
    }

    /*
     * This method will be used to create the object of the user when only the username is passed as a parameter.
     * The method will search the database for the name of the user.
     * Calls to this method will only occur when the ID is not passed on creation of the User object.
     */
    private String searchDatabaseForName(String username) {
        return SET_STRING_NULL;
    }

    /*
     * This method will be used to create the object of the user when only the username is passed as a parameter.
     * The method will search the database for the ID of the user.
     * Calls to this method will only occur when the ID is not passed on creation of the User object.
     */
    private String searchDatabaseForUserID(String username){
        return SET_STRING_NULL;
    }

}
