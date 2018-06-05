/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import util.Utils.EtatTuile;

/**
 *
 * @author fernathi
 */
public class Tuile {
    private String nomTuile;
    private int l;
    private int c;
    private EtatTuile etat;
    private int aventurierSurLaCase;
    


    Tuile(String nomTuile, int l, int c, EtatTuile etat, int aventurierSurLaCase) {
        this.nomTuile = nomTuile;
        this.l = l;
        this.c = c;
        this.etat = etat;
        this.aventurierSurLaCase = aventurierSurLaCase;
    }
    public EtatTuile getEtatTuile(String nomTuile, int l, int c){
        return this.etat;
    }

    public String getNomTuile() {
        return this.nomTuile;
    }

    public int getL() {
        return this.l;
    }

    public int getC() {
        return this.c;
    }

    public EtatTuile getEtat() {
        return this.etat;
    }

    public int getAventurierSurLaCase() {
        return this.aventurierSurLaCase;
    }
    
}
