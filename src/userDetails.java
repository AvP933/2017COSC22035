import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userDetails {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton Button;
    private JButton courseButton;

    public userDetails(String userName){
        setContentPane(panel1);
        pack();
        setDefaultCloneOperation(Exit_ON_CLOSE);
        setVisible(true);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                system.exit(0);
            }
        });
    }
}
