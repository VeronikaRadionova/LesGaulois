package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private int nbVillageoisMaximum = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
		
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans un village du chef " + this.chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, 1, village);
		Gaulois asterix = new Gaulois ("Asterix", 8);
		Gaulois obelix = new Gaulois ("Obelix",25);
		village.setChef(abraracourcix);
		//village.ajouterHabitant(abraracourcix);
		village.ajouterHabitant(obelix);
		village.ajouterHabitant(asterix);
		village.trouverHabitant(1);
		//System.out.println(gaulois);
		village.afficherVillageois();
	}
}
