/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easycabinet;

import javax.swing.ImageIcon;

/**
 *
 * @author Amar
 */
public class Patient {
    
    private String nom;
    private String prenom;
    private String mobile;
    private String sexe;
    private String iconPath;
    private int anneDeNaissance ;
    private int id;

    public Patient(String nom, String prenom, String mobile, String sexe, int anneDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.mobile = mobile;
        this.sexe = sexe;
        this.anneDeNaissance = anneDeNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public void setAnneDeNaissance(int anneDeNaissance) {
        this.anneDeNaissance = anneDeNaissance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMobile() {
        return mobile;
    }

    public String getSexe() {
        return sexe;
    }

    public String getIconPath() {
        return iconPath;
    }

    public int getAnneDeNaissance() {
        return anneDeNaissance;
    }

    public int getId() {
        return id;
    }
    public ImageIcon getIcon(){
        String path="";
        if(sexe.equals("Homme")) {
            
            path="/easycabinet/Female Profile_24px.png";
        }
        else {
            path="/easycabinet/Female Profile_24px.png";
        }
        
        return new ImageIcon(getClass().getResource(path));
    }
    
    
    
}
