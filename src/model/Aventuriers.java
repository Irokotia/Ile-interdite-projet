/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
//test


/**
 *
 * @author fernathi
 */
public abstract class Aventuriers {
private int NbrActionUtilise;  
private Tuile positionActuelle;


        

public static enum Aventurier {
       
    }


public int getNbrActions(){
    return this.NbrActionUtilise;
    }

public void demandeDeplacementPossible(Grille g){
    
    }

public void setAction(){
    this.NbrActionUtilise = this.NbrActionUtilise+1;
    }

public void deplacer(Tuile tuile){
    if(NbrActionUtilise >= 3){
        
    }
    }
public Tuile getPositionactuelle(){
return this.positionActuelle;
}
    
}
