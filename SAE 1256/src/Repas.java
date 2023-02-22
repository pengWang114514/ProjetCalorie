// -----------------------------------------------------
// Elena Ferreira
// -----------------------------------------------------


public  class Repas {
	int nbAliment; // Number of Aliment in the Repas
	Aliment[] aliments = new Aliment[20]; // table of Aliment
	String name; // name of Repas
	
	/**
	 * Constructor for Repas
	 * @param name is meant to be the name of the Repas
	 */
	Repas(String name){
		this.name = name;
	}

	/**
	 * Procedure made to add an Aliment to a Repas
	 * @param aliment
	 */
	void add(Aliment aliment) {
		aliments[nbAliment] = aliment;
		nbAliment++;
	}

	/**
	 * Procedure that displays a repas
	 */
	public void afficherRepas(){
		System.out.println("[" + name + "] : " 
							+ "		Calories : " + getCalorieRepas()
							+ "		Glucides : " + getGlucidesRepas()
							+ "		Lipides : " + getProteinesRepas()
							+ "		Proteines :" + getProteinesRepas());
	}

	/**
	 * @return Returns the Calories of a Repas
	 */
	int getCalorieRepas() {
		int calReturn = 0;
		for (int i = 0; i < nbAliment; i++){
			calReturn += aliments[i].calories;
		}
		return calReturn;
	}

	/**
	 * @return Returns the Glucids of a Repas
	 */
	int getGlucidesRepas() {
		int calReturn = 0;
		for (int i = 0; i < nbAliment; i++){
			calReturn += aliments[i].glucides;
		}
		return calReturn;
	}

	/**
	 * @return Returns the Lipids of a Repas
	 */
	int getLipidesRepas() {
		int calReturn = 0;
		for (int i = 0; i < nbAliment; i++){
			calReturn += aliments[i].lipides;
		}
		return calReturn;
	}

	/**
	 * @return Returns the Proteins of a Repas
	 */
	int getProteinesRepas() {
		int protReturn = 0;
		for (int i = 0; i < nbAliment; i++){
			protReturn += aliments[i].proteines;
		}
		return protReturn;
	}
}