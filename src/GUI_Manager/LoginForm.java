package GUI_Manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JTextField usernameTextArea;
    private JPasswordField passwordTextArea;
    private JButton signInButton;
    private JButton forgotPasswordButton;
    private JPanel loginPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel belowPanel;


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
        this.setSize(1200,700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // Create the objects for the elements.
        loginPanel = new JPanel();
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        belowPanel = new JPanel();

        JLabel usernameTextLabel = new JLabel("Username:");
        JLabel passwordTextLabel = new JLabel("Password:");

        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));

        usernameTextArea = new JTextField("Email", 20);
        passwordTextArea = new JPasswordField("password", 20);
        signInButton = new JButton();
        forgotPasswordButton = new JButton();

        signInButton.setText("Sign In");
        forgotPasswordButton.setText("Forgot Password");

        // Action listener for the sign in button.
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login(usernameTextArea.getText(), passwordTextArea.getText());
            }
        });

        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fill in with forgot password method.
            }
        });
        // Set the size of the text fields
        usernameTextArea.setColumns(35);
        passwordTextArea.setColumns(35);

        // Add panes to the user interface.
        leftPanel.add(usernameTextLabel);
        leftPanel.add(usernameTextArea);
        rightPanel.add(passwordTextLabel);
        rightPanel.add(passwordTextArea);
        belowPanel.add(signInButton);
        belowPanel.add(forgotPasswordButton);
        loginPanel.add(leftPanel);
        loginPanel.add(rightPanel);
        loginPanel.add(belowPanel);

        // Add the final login pane to the User interface.
        this.add(loginPanel);;
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
            else if (!checkValidPassword(password)) {
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
