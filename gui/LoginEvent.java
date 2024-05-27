package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginEvent implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getActionCommand().equals("Login"))
        {
            JOptionPane.showMessageDialog(null,"User login");
        }
    }
}
