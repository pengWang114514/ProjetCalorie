// -----------------------------------------------------
// Elena Ferreira
// -----------------------------------------------------

public class Journee {
	public Repas[] repasJournee;

	/**
	 * Constructor for Journee
	 */
	public Journee() {
		this.repasJournee = new Repas[4];
		Repas pDej = new Repas("Petit Dejeuner");
		Repas dej = new Repas("Repas");
		Repas col = new Repas("ColLation");
		Repas din = new Repas("Dinner");
		repasJournee[0]=pDej;
		repasJournee[1]=dej;
		repasJournee[2]=col;
		repasJournee[3]=din;
	}

	/**
	 * Procedure that's adding an Aliment to a Repas
	 * @param aliment is the Aliment to be added in the Repas
	 * @param id is the ID of the repas (1 to 4)
	 */
	public void addAlimentRepas(Aliment aliment, int id){
		repasJournee[id].add(aliment);
	}

	/**
	 * Procedure that's displaying the statistics of the Journee
	 */
	public void afficherJournee(){
		for (int i = 0; i < 4; i++){
			repasJournee[i].afficherRepas();
			System.out.println();
		}
	}
}
