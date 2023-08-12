/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fmora
 */
public class mainMenu {
    private JFrame frame;
    private JPanel panelN;
    private JPanel panelC;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JButton buttonAdd;
    private JButton buttonAnalytics;
    loadData loader = new loadData();
    data data = new data();
    
    public mainMenu(){
        //receipt receipt1[] = new receipt[20];
        loader.load(data.getSourceReceipt());
        mainMenu();
        
    }
    public void mainMenu() {
        
        
        frame = new JFrame();
        frame.setSize(300, 300);
        
        panelN = new JPanel();
        panelC = new JPanel();
        panelMiddle = new JPanel();
        labelN = new JLabel("Main Menu");
        
        buttonAdd = new JButton("Add New Receipt");
        buttonAdd.setMaximumSize(new Dimension(215, 25));
        buttonAdd.addActionListener( new addActionListener());
        buttonAnalytics = new JButton("Debt Analytics");
        buttonAnalytics.setMaximumSize(new Dimension(215, 25));
        buttonAnalytics.addActionListener( new analyticsActionListener());
        
        frame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
        });
        
        panelN.add(labelN);
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.Y_AXIS));
        panelC.add(Box.createVerticalGlue());
        panelC.add(buttonAdd);
        panelC.add(buttonAnalytics);
        panelC.add(Box.createVerticalGlue());
        
        panelMiddle.add(Box.createHorizontalGlue());
        panelMiddle.add(panelC);
        panelMiddle.add(Box.createHorizontalGlue());
        
        frame.setTitle("Buddies Debt Calculator");
        frame.getContentPane() .add(BorderLayout.NORTH, panelN);
        frame.getContentPane() .add(BorderLayout.CENTER, panelMiddle);
        frame.setVisible(true);
 
    }
    class addActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          receipt receipt[] = new receipt[20];
          receipt = data.getSourceReceipt();
          receipt = loader.addNew(receipt);
          data.setSourceReceipt(receipt);
      }
   }    
    class analyticsActionListener implements ActionListener{
      public void actionPerformed(ActionEvent e) {
          receipt receipt[] = new receipt[20];
          receipt = data.getSourceReceipt();
          receipt = loader.calc(receipt);
      }
   }
}
