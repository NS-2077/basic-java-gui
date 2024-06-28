import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {
    //scope is now increaseed so deleate all the jstuff and make them private static var
            private static JLabel msg;
            private static JLabel user;
            private static JLabel pass;
            private static JTextField userText;  //instantiate variables, increases scope
            private static JPasswordField passText;
            private static JButton button;

    public static void main(String[] args) {

            JPanel panel = new JPanel();
            JFrame frame = new JFrame();
            frame.setSize(350,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            panel.setLayout(null);

            user = new JLabel("User");

            pass = new JLabel("Password");
            user.setBounds(10,20,80,25);
            pass.setBounds(10,50,80,25);
            panel.add(user);
            panel.add(pass);
            userText = new JTextField();
            passText = new JPasswordField();


            userText.setBounds(100,20,165,25);
            passText.setBounds(100,50,165,25);
            panel.add(userText);
            panel.add(passText);


            button = new JButton("Login");
            button.setBounds(180,80,80,25);
            button.addActionListener(new Main());
            panel.add(button);

            msg = new JLabel("");
            msg.setBounds(10,110,300,25);
            panel.add(msg);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passText.getText();
        System.out.println(user + ", "+ password);


        if (user.equals("Noor") && password.equals("12345")) {
            msg.setText("LOGIN VALID");
        }
        else {
            msg.setText("INVALID LOGIN");
        }
    }



}