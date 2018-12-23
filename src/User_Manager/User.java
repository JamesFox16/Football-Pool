package User_Manager;

public class User {

    private final String SET_STRING_NULL = "NULL";

    private String name;
    private String userName;

    public User() {
        this.name = SET_STRING_NULL;
        this.userName = SET_STRING_NULL;
    }

    public User(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }

    public String getName() {
        return this.name;
    }

    public String getUserName() {
        return this.userName;
    }

}
