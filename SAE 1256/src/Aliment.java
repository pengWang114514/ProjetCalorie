// -----------------------------------------------------
// Zhi-Peng Wang
// -----------------------------------------------------



public class Aliment {
	String name; // name 
	int calories;	// calories
	int proteines; // proteins
	int glucides; // glucids
	int lipides; // lipids

	/**
	 * Blank constructor
	 */
	Aliment(){

	}

	/**
	 * Aliment's constructor, contains a name, calories, proteines, glucides and lipids
	 * 
	*/
	Aliment(String name, int calories, int proteines, int glucides, int lipides) {
		this.name = name;
		this.calories = calories;
		this.proteines = proteines;
		this.glucides = glucides;
		this.lipides = lipides;
	}

	/**
	 * A procedure that's displaying data about an aliment
	 */
	public void afficherAliment() {
		System.out.println("Nom : " + name);
		System.out.println("Calories : " + calories);
		System.out.println("Proteines : " + proteines);
		System.out.println("Glucides : " + glucides);
		System.out.println("Lipides : " + lipides);
		System.out.println("\n");
	}
	
	/**
	 * Function made to get the name of an aliment
	 * @return returns a String
	 */
	public String getName(){
		return name;
	}
}