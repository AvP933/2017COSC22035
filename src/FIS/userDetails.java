package FIS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.glass.ui.Cursor.setVisible;

public class userDetails extends JFrame {
    private JTextField txtName;
    private JTextField txtEmail;
    private JTextField txtContact;
    private JTextField textField4;
    private JButton logoutButton;
    private JButton courseButton;
    private JPanel panel1;

    public userDetails(String userName){
        setContentPane(panel1);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        txtName.setText(user.name);
        txtEmail.setText(user.email);
        txtContact.setText(String.valueOf(user.phoneNumber));

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
