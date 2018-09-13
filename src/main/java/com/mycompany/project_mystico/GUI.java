/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_mystico;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author krum
 */
//public class GUI extends JFrame 
public class GUI extends JPanel
{
    private JPanel panel;
    
    public void GUI(){
       
       // JPanel newPanel = new JPanel(new GridLayout());
       // JLabel label = new JLabel("What's your name?");
       // JTextField name = new JTextField(25);
        
       //  newPanel.add(label, BorderLayout.NORTH);
       //  newPanel.add(name, BorderLayout.SOUTH);
        
        super("Test");
        panel = new JPanel();
        panel.setSize(255, 255);
        
    }
}
