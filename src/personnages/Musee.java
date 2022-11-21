package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee = 0;
	
	public Musee(Trophee[] trophees, int nbTrophee) {
		super();
		this.nbTrophee = nbTrophee;
		
	}
	
	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		Trophee don = new Trophee(gaulois,equipement);
		trophees[nbTrophee] = don;
		nbTrophee += 1 ;
	}
	
}
