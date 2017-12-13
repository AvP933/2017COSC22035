import DBConnect.dbConnect;
import sun.security.util.Password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        String inUsername = null;
        String inPW = null;
        dbConnect dbcon = new dbConnect();
        Statement stml = null;
        try{
            String query = "Select * userdetaills where UserName ='"+frUsername+"'";
            stml = dbcon.Conn2DB();
            ResultSet Rs = stml.executeQuery(query);
            Rs.first();
            inUsername = frUsername;
            inPW = Rs.getString("Password");

        } catch (SQLException e) {
            e.printStackTrace();
    }




        if(frUsername.equals(inUsername)&&frPW.equals(inPW)) {
            JOptionPane.showMessageDialog(null, "username or password correct");
            loginFR.setVisible(false);
            new userDetails(frUsername);
        } else
            JOptionPane.showMessageDialog( null,"Incorrect");

    }
}

