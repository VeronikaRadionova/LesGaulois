package personnages;

import java.util.Random;

public class Druide {
	private String nom; 
	private int effetPotionMin; 
	private int effetPotionMax;
	private int forcePotion = 0;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	     this.nom = nom;
	     this.effetPotionMin = effetPotionMin;
	     this.effetPotionMax = effetPotionMax;
	     parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
	               + effetPotionMax + ".");
	}
	   
	public String getNom() {
	     return nom;
	}
	   
	public void parler(String texte) {
	     System.out.println(prendreParole() + "� " + texte + "�");
	}
	   
	private String prendreParole() {
	     return "Le druide " + nom + " : ";
	}
	
	public int preparerPotion() {
		Random forceP = new Random();
		forcePotion = effetPotionMin + forceP.nextInt(1+effetPotionMax-effetPotionMin);
		if (forcePotion > 7) {
			parler("J'ai prépare ́une super potion de force  " + forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + forcePotion);
		}
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois) {
		System.out.println(prendreParole() + "Non,  " + gaulois.getNom() + " !... Tu n'auras pas de potion magique ! ");
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		Gaulois obelix = new Gaulois ("Obelix", 8);
		panoramix.booster(obelix);
	}
}
