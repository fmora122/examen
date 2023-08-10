/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author fmora
 */
public class receipt {
    private String description;
    private String participant1;
    private String participant2;
    private String participant3;
    private String participant4;
    private String participant5;
    private String participant6;    
    private String whoPaid;
    private int total;
    private String currency;

    public receipt(String description, String participant1, String participant2, String participant3, String participant4, String participant5, String participant6, String whoPaid, int total, String currency) {
        this.description = description;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.participant3 = participant3;
        this.participant4 = participant4;
        this.participant5 = participant5;
        this.participant6 = participant6;
        this.whoPaid = whoPaid;
        this.total = total;
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParticipant1() {
        return participant1;
    }

    public void setParticipant1(String participant1) {
        this.participant1 = participant1;
    }

    public String getParticipant2() {
        return participant2;
    }

    public void setParticipant2(String participant2) {
        this.participant2 = participant2;
    }

    public String getParticipant3() {
        return participant3;
    }

    public void setParticipant3(String participant3) {
        this.participant3 = participant3;
    }

    public String getParticipant4() {
        return participant4;
    }

    public void setParticipant4(String participant4) {
        this.participant4 = participant4;
    }

    public String getParticipant5() {
        return participant5;
    }

    public void setParticipant5(String participant5) {
        this.participant5 = participant5;
    }

    public String getParticipant6() {
        return participant6;
    }

    public void setParticipant6(String participant6) {
        this.participant6 = participant6;
    }

    public String getWhoPaid() {
        return whoPaid;
    }

    public void setWhoPaid(String whoPaid) {
        this.whoPaid = whoPaid;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
    
    
}
