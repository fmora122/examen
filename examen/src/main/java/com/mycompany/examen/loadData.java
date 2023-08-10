/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class loadData {
    private int size = 7;
    
    public static receipt[] load(receipt receipt[]){
        receipt[0] = new receipt("DesayunocoffePrime", "Joshua", "Greivin", "Guillermo", "Andres", "Tavo", "David", "Guillermo", 120, "dollar");
        receipt[1] = new receipt("Almuerzo PigFactory", "Joshua", "Greivin", "Guillermo", "Andres", "Tavo", "NA", "Guillermo", 200, "dollar");
        receipt[2] = new receipt("Cena FastFood", "Joshua", "David", "NA", "NA", "NA", "NA", "David", 50, "dollar");
        receipt[3] = new receipt("Pizza Hut", "Guillermo", "Andres", "Greivin", "Tavo", "NA", "NA", "Tavo", 100, "dollar");
        receipt[4] = new receipt("Quicksilver store", "Guillermo", "NA", "NA", "NA", "NA", "NA", "Greivin", 150, "dollar");
        receipt[5] = new receipt("Apple store", "Andres", "NA", "NA", "NA", "NA", "NA", "Joshua", 200, "dollar");
        receipt[6] = new receipt("Desayuno chillis", "Greivin", "Guillermo", "Andres", "Andres", "Tavo", "David", "Greivin", 150, "dollar");
        receipt[7] = new receipt("Almuerzo hooters", "Joshua", "Greivin", "Guillermo", "Andres", "Andres", "Tavo", "Tavo", 180, "dollar");
        //receipt[8] = new receipt("Almuerzo 222", "Joshua", "Greivin", "Guillermo", "Andres", "Andres", "Tavo", "Tavo", 180, "dollar");

        return receipt;
    }
    
    public receipt[] addNew(receipt receipt[]){
        size++;
        String description = JOptionPane.showInputDialog("Type Description");
        String participant1 = JOptionPane.showInputDialog("Type Participant1");
        String participant2 = JOptionPane.showInputDialog("Type Participant2");
        String participant3 = JOptionPane.showInputDialog("Type Participant3");
        String participant4 = JOptionPane.showInputDialog("Type Participant4");
        String participant5 = JOptionPane.showInputDialog("Type Participant5");
        String participant6 = JOptionPane.showInputDialog("Type Participant6");    
        String whoPaid = JOptionPane.showInputDialog("Type Who Paid");
        int total = Integer.parseInt(JOptionPane.showInputDialog("Type total"));
        String currency = JOptionPane.showInputDialog("Type Currency");       
        receipt[size] = new receipt(description, participant1, participant2, participant3, participant4, participant5, participant6, whoPaid, total, currency);
        return receipt;
    }
    
}
