import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel Login;
    private JFormattedTextField userField;
    private JPasswordField pwField;
    private JButton exitButton;
    private JButton loginButton;

    public static JFrame loginFR = new JFrame("Login");

    public Login() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String pw = String.valueOf(pwField.getPassword());
                loginCheck(username,pw);
                //JOptionPane.showMessageDialog(null, username+"System not ready yet bitch");
            }
        });
    }

    public static void main(String [] args){
        loginFR.setContentPane(new Login().Login);
        loginFR.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFR.pack();
        loginFR.setVisible(true);
    }

    private void loginCheck(String frUsername,String frPW)
    {
        String inUsername = "COSC";
        String inPW = "22035";
        if(frUsername.equals(inUsername)&&frPW.equals(inPW)) {
            JOptionPane.showMessageDialog(null, "username or password correct");
        } else
            JOptionPane.showMessageDialog( null,"Incorrect");

    }
}

