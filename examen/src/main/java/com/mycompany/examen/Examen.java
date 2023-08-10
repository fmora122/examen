/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author fmora
 */
public class Examen {

    public static void main(String[] args) {
        receipt receipt1[] = new receipt[20];
        loadData loader = new loadData();        
        receipt1 = loader.load(receipt1);
        receipt1 = loader.addNew(receipt1);
        
        
        
    }
}
