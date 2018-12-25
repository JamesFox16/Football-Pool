package GUI_Manager;

import javax.swing.*;

public class LoginForm extends JFrame {

    /*
     * The default constructor for the program that will set the title of the program.
     */
    public LoginForm(String title) {
        this.setTitle(title);
    }

    /*
     * The method will create the user interface and set the window to be visible and have a size of 1000 X 600.
     * This method will also set the listeners for the UI.
     */
    public void createUI() {
        this.setSize(1000,600);
        this.setVisible(true);
    }

    /*
     * Method that will handle the login of the user.
     */
    public void login(String username, String password) {
        if (checkValidLogin(username, password)) {
            //Login code
        } else {
            if (!checkValidUsername(username)) {
                msgbox("Invalid Username.");
            }
            if (!checkValidPassword(password)) {
                msgbox("Invalid Password.");
            }
        }
    }

    /*
     * Method that will check if the username and the password are correct. This method will call methods to check
     * the username and the password separately.
     */
    private boolean checkValidLogin(String username, String password) {
        if (checkValidUsername(username) && checkValidPassword(password)) {
            return true;
        }else {
            return false;
        }
    }

    /*
     * Method that will check to see if the username is correct.
     */
    private boolean checkValidUsername(String username) {

        // This method will be changed when the database is added.
        if (username.equals("admin")) {
            return true;
        }else {
            return false;
        }
    }

    /*
     * Method that will check to see if the password is correct.
     */
    private boolean checkValidPassword(String password) {

        // This method will be changed when the database is added.
        if (password.equals("password")) {
            return true;
        }else {
            return false;
        }
    }

    /*
     * Method that will display a message to the user if there is the need to do so.
     */
    private void msgbox (String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
