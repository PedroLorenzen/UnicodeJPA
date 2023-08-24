package com.example.unicodejpa.model;

import jakarta.persistence.*;

@Entity
public class UniCode
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unicode;
    @Column
    private char bogstav;
    @Column
    private String beskrivelse;

    public int getUnicode()
    {
        return unicode;
    }

    public void setUnicode(int unicode)
    {
        this.unicode = unicode;
    }

    public char getBogstav()
    {
        return bogstav;
    }

    public void setBogstav(char bogstav)
    {
        this.bogstav = bogstav;
    }

    public String getBeskrivelse()
    {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse)
    {
        this.beskrivelse = beskrivelse;
    }
}
