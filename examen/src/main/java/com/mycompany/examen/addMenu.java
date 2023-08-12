/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fmora
 */
public class addMenu {
    private JFrame frame;
    private JPanel panelN;
    private JPanel panelW;
    private JPanel panelE;
    private JPanel panelS;
    private JPanel panelWMiddle;
    private JPanel panelEMiddle;
    private JPanel panelMiddle;
    private JLabel labelN;
    private JLabel labelS;
    private JButton buttonExit;
    private JButton buttonSave;
    private JLabel description; 
    private JLabel participant1;
    private JLabel participant2;
    private JLabel participant3;
    private JLabel participant4;
    private JLabel participant5;  
    private JLabel participant6;
    private JLabel whoPaid;
    private JLabel total;
    private JLabel currency;    
    private JTextField TXdescription; 
    private JTextField TXparticipant1;
    private JTextField TXparticipant2;
    private JTextField TXparticipant3;
    private JTextField TXparticipant4;
    private JTextField TXparticipant5;
    private JTextField TXparticipant6;
    private JTextField TXwhoPaid;
    private JTextField TXtotal;
    private JTextField TXcurrency;
    private String xdescription;
    private String xparticipant1;
    private String xparticipant2;
    private String xparticipant3;
    private String xparticipant4;
    private String xparticipant5;
    private String xparticipant6; 
    private String xwhoPaid;
    private int xtotal;
    private String xcurrency;
    loadData loader = new loadData();
    data data = new data();
    
    public addMenu(){
        addMenu();
    }
    public void addMenu() {
        
        frame = new JFrame();
        frame.setSize(400, 300);
        
        panelN = new JPanel();
        panelW = new JPanel();
        panelE = new JPanel();
        panelS = new JPanel();
        panelWMiddle = new JPanel();
        panelEMiddle = new JPanel();
        panelMiddle = new JPanel();
        buttonExit = new JButton("Exit");
        buttonExit.addActionListener( new exitActionListener());
        buttonSave = new JButton("Save");
        buttonSave.addActionListener( new saveActionListener());
        
        labelN = new JLabel("Add Receipt Menu");
        labelS = new JLabel("");
        description = new JLabel("Description"); 
        description.setPreferredSize(new Dimension(135,19));
        participant1 = new JLabel("Participant 1");
        participant1.setPreferredSize(new Dimension(135,19));
        participant2 = new JLabel("Participant 2");
        participant2.setPreferredSize(new Dimension(135,19));
        participant3 = new JLabel("Participant 3");
        participant3.setPreferredSize(new Dimension(135,19));
        participant4 = new JLabel("Participant 4");
        participant4.setPreferredSize(new Dimension(135,19));
        participant5 = new JLabel("Participant 5");
        participant5.setPreferredSize(new Dimension(135,19));
        participant6 = new JLabel("Participant 6");
        participant6.setPreferredSize(new Dimension(135,19));
        whoPaid = new JLabel("Who Paid?");
        whoPaid.setPreferredSize(new Dimension(135,19));
        total = new JLabel("Total");
        total.setPreferredSize(new Dimension(135,19));
        currency = new JLabel("Currency");
        currency.setPreferredSize(new Dimension(135,19));
        
        TXdescription = new JTextField(20); 
        TXdescription.addActionListener(new descriptionActionListener());
        TXparticipant1 = new JTextField(20);
        TXparticipant1.addActionListener(new participant1ActionListener());
        TXparticipant2 = new JTextField(20);
        TXparticipant2.addActionListener(new participant2ActionListener());
        TXparticipant3 = new JTextField(20);
        TXparticipant3.addActionListener(new participant3ActionListener());
        TXparticipant4 = new JTextField(20);
        TXparticipant4.addActionListener(new participant4ActionListener());
        TXparticipant5 = new JTextField(20);
        TXparticipant5.addActionListener(new participant5ActionListener());
        TXparticipant6 = new JTextField(20);
        TXparticipant6.addActionListener(new participant6ActionListener());
        TXwhoPaid = new JTextField(20);
        TXwhoPaid.addActionListener(new whoPaidActionListener());
        TXtotal = new JTextField(20);
        TXtotal.addActionListener(new totalActionListener());
        TXcurrency = new JTextField(20);
        TXcurrency.addActionListener(new currencyActionListener());
        
        panelN.add(labelN);
        panelS.add(labelS);
        panelW.setLayout(new BoxLayout(panelW, BoxLayout.Y_AXIS));
        panelW.add(Box.createVerticalGlue());
        panelW.add(description);
        panelW.add(participant1);
        panelW.add(participant2);
        panelW.add(participant3);
        panelW.add(participant4);
        panelW.add(participant5);
        panelW.add(participant6);
        panelW.add(whoPaid);
        panelW.add(total);
        panelW.add(currency);
        panelW.add(buttonSave);
        panelW.add(buttonExit);
        panelW.add(Box.createVerticalGlue());
        
        panelWMiddle.add(Box.createHorizontalGlue());
        panelWMiddle.add(panelW);
        panelWMiddle.add(Box.createHorizontalGlue());
          
        panelE.setLayout(new BoxLayout(panelE, BoxLayout.Y_AXIS));
        panelE.add(Box.createVerticalGlue());
        panelE.add(TXdescription);
        panelE.add(TXparticipant1);
        panelE.add(TXparticipant2);
        panelE.add(TXparticipant3);
        panelE.add(TXparticipant4);
        panelE.add(TXparticipant5);
        panelE.add(TXparticipant6);
        panelE.add(TXwhoPaid);
        panelE.add(TXtotal);
        panelE.add(TXcurrency);
        panelE.add(Box.createVerticalGlue());
        
        
        panelEMiddle.add(Box.createHorizontalGlue());
        panelEMiddle.add(panelE);
        panelEMiddle.add(Box.createHorizontalGlue());
        
              
        frame.setTitle("Fincas Anónimas S.A");
        frame.getContentPane() .add(BorderLayout.NORTH, panelN);
        frame.getContentPane() .add(BorderLayout.WEST, panelWMiddle);
        frame.getContentPane() .add(BorderLayout.EAST, panelEMiddle);
        frame.getContentPane() .add(BorderLayout.SOUTH, panelS);
        frame.setVisible(true);
 
    }
    class descriptionActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xdescription = TXdescription.getText();
      }
   }
    class participant1ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xparticipant1 = TXparticipant1.getText();
      }
   }
    class participant2ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xparticipant2 = TXparticipant2.getText();
      }
   }
    class participant3ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xparticipant3 = TXparticipant3.getText();
      }
   }
    class participant4ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xparticipant4 = TXparticipant4.getText();
      }
   }
    class participant5ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xparticipant5 = TXparticipant5.getText();
      }
   }
    class participant6ActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xparticipant6 = TXparticipant6.getText();
      }
   }
    class whoPaidActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xwhoPaid = TXwhoPaid.getText();
      }
   }
    class totalActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xtotal = Integer.parseInt(TXtotal.getText());
      }
   }
    class currencyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xcurrency = TXcurrency.getText();
      }
   }
    class exitActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
      }
   }
    class saveActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) { 
            loader.addNew(data.getSourceReceipt());
        }
    }
}
