package GUI_Manager;

import javax.swing.*;

public class HomePage extends JFrame {

    private String username;
    private String userFirstName;

    private JPanel buttonPannel;

    public HomePage(String title, String username) {
        this.setTitle(title);
    }

    public void createUI() {
        setSize(1200,700);

    }
}
