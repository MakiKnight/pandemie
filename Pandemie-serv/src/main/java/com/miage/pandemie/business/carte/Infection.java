
package com.miage.pandemie.business.carte;

import com.miage.pandemie.business.enumparam.ECouleur;
import com.miage.pandemie.business.enumparam.EVille;
import com.miage.pandemie.business.enumparam.EVilleBleu;
import com.miage.pandemie.business.enumparam.EVilleJaune;
import com.miage.pandemie.business.enumparam.EVilleNoir;
import com.miage.pandemie.business.enumparam.EVilleRouge;
import java.util.Objects;

/**
 *
 * @author alex
 */
public class Infection extends Carte{

    /**
     * @return the couleur
     */
    public ECouleur getCouleur() {
        return couleur;
    }
    private ECouleur couleur;
    
    public Infection(String path,ECouleur couleur,EVille ville) {
        super("/Infection"+path+"/"+couleur.name(),ville.name());  
        this.couleur = couleur;
    }
    public Infection(String path,ECouleur couleur,EVilleBleu ville) {
        super("/Infection"+path+"/"+couleur.name(),ville.name());  
        this.couleur = couleur;
    }
    public Infection(String path,ECouleur couleur,EVilleRouge ville) {
        super("/Infection"+path+"/"+couleur.name(),ville.name());  
        this.couleur = couleur;
    }
    public Infection(String path,ECouleur couleur,EVilleJaune ville) {
        super("/Infection"+path+"/"+couleur.name(),ville.name());  
        this.couleur = couleur;
    }
    public Infection(String path,ECouleur couleur,EVilleNoir ville) {
        super("/Infection"+path+"/"+couleur.name(),ville.name());  
        this.couleur = couleur;
    }
    
    @Override
    public String linkImgVerso(){
        return ("/com/miage/pandemie/image/Infection/Verso").concat(".jpg");
    }
    
    @Override
    public boolean equals(Object obj){
        
        if(super.equals(obj)){
            Infection tmp =(Infection) obj;
            if(this.getCouleur().equals(tmp.getCouleur())){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.couleur);
        return hash;
    }
}
