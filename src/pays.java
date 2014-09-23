/* TEST  RAPHAEL SOUAMA  TEST*/

import java.util.ArrayList;

public class pays {

private	String nom;
private	String langue;
private	String monnaie;
private	String capitale;
private static int compteurpays;
private ArrayList<ville>listeVille;

//Constructeur par défaut
public pays() {
	compteurpays++;
}

//Constructeur
public pays(String unNom,String uneLangue,String uneMonnaie,String uneCapitale){
	this.nom = unNom;
	this.langue = uneLangue;
	this.monnaie = uneMonnaie;
	this.capitale = uneCapitale;
}

//Méthodes publiques
public String getNom() {
	return this.nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getLangue() {
	return this.langue;
}

public void setLangue(String langue) {
	this.langue = langue;
}

public String getMonnaie() {
	return this.monnaie;
}

public void setMonnaie(String monnaie) {
	this.monnaie = monnaie;
}

public String getCapitale() {
	return this.capitale;
}

public void setCapitale(String capitale) {
	this.capitale = capitale;
}

public static int getCompteurpays() {
	return compteurpays;
}

public static void setCompteurpays(int compteurpays) {
	pays.compteurpays = compteurpays;
}

//Retourne le nom en formalisé (Nom)
public String getNomFormalise(){
	return(this.nom.toUpperCase().charAt(0) + this.nom.substring(1, this.nom.length()).toLowerCase());
}

public String toString(){
	String chain = ("Nom : " + getNomFormalise() + "  \n langue : " + getLangue() + 
			" \n monnaie : " + getMonnaie() + " \n capitale : " + getCapitale());
	return chain;
}
//Retourne le nom en majuscules
public String getNomMaj(){
	return getNom().toUpperCase();
}

}
//Méthodes privées

