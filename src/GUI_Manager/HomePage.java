package GUI_Manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {

    private String username;
    private String userFirstName;

    private JPanel backgroundPanel;
    private JPanel centerPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel topPanel;
    private JPanel buttonPannel;

    public HomePage(String title, String username) {
        this.setTitle(title);
    }

    public void createUI() {
        setSize(1200,700);

        backgroundPanel = new JPanel(new BorderLayout());
        centerPanel = new JPanel();
        leftPanel = new JPanel();
        rightPanel = new JPanel();
        bottomPanel = new JPanel();
        topPanel = new JPanel();
        buttonPannel = new JPanel();

        this.setVisible(true);
    }

    private void setupBackgroudPanel() {
        setupButtonPanel();
        setupLeftPanel();
        backgroundPanel.add(leftPanel);
    }

    private void setupLeftPanel() {
        leftPanel.add(bottomPanel);
    }

    private void setupButtonPanel() {
        JButton logoutButton = new JButton("Logout");

        // Log out of the page.
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPannel.add(logoutButton);
    }
}
