
public class ville {

	private String nom;
	private int population;
	
	
	public ville(){
		
	}
	
	
	public ville(String Unnom, int Unepopulation){
		this.setUnnom(Unnom);
		this.setUnepopulation(Unepopulation);
	}
	
	public String toString(){
		String chain = null;
		chain = chain +"population :" +this.population;
		return (chain);
	}
	
	public String getnom(){
		return nom;
	}
	
	public void setUnnom(String nom){
		this.nom = nom;
	}
	public int getUnepopulation(){
		return population;
	}
	
	public void setUnepopulation(int population){
		this.population = population;
	}
}
