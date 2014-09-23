
public class capitale {

//Attributs privés
private String nom;
private int nbhabitant;

public capitale(String Unnom, int Nbrnbhabitant) {
	this.nom = Unnom;
	this.nbhabitant = Nbrnbhabitant;
}


//Méthodes publiques
public String getNom() {
	return this.nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getNbhabitant() {
	return this.nbhabitant;
}
public void setNbhabitant(int nbhabitant) {
	this.nbhabitant = nbhabitant;
}

public String toString(){
	String chain ="" ;
	chain = chain + "population : " + this.nbhabitant;
	return chain;
}
}
