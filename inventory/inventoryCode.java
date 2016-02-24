/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 
 */


public class inventoryCode {
    private JFrame LogFrame = new JFrame();
    private JButton JbLogin = new JButton ("Login");
    private JLabel JlUser   = new JLabel ("Username:");
    private JLabel JlPass   = new JLabel ("Password:");
    private JTextField JtUser = new JTextField (5);
    private JPasswordField JpPass = new JPasswordField (5);
    
    public inventoryCode(){
        
        
        LogFrame.setPreferredSize (new Dimension (344, 225));
        LogFrame.setLayout (null);
        //add components
        LogFrame.add (JbLogin);
        LogFrame.add (JlUser);
        LogFrame. add (JlPass);
        LogFrame.add (JtUser);
        LogFrame.add (JpPass);

        //set component bounds (only needed by Absolute Positioning)
        JbLogin.setBounds (120, 130, 115, 35);
        JlUser.setBounds (35, 45, 100, 25);
        JlPass.setBounds (35, 80, 100, 25);
        JtUser.setBounds (115, 45, 190, 25);
        JpPass.setBounds (115, 80, 190, 25);
        LogFrame.setTitle("MRSSSSS MACAVINTAAA");
        
        LogFrame.pack();
        LogFrame.setLocationRelativeTo(null);
        LogFrame.setVisible(true);
        LogFrame.setResizable(false);
        LogFrame.setDefaultCloseOperation(3);
    }
}
