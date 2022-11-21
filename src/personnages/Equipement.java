package personnages;

public enum Equipement {
	CASQUE("une casque"), BOUCLIER("un bouclier");
	
	private String nom;
	
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return nom;
	}
}
