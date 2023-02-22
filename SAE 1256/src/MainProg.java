// -----------------------------------------------------
// Haolong Li
// -----------------------------------------------------


import java.util.Scanner;

public class MainProg {

	// -------------------------------
	// PARTIE MODELE
	// -------------------------------

	// creating aliments
	static Aliment pates = new Aliment("Pâtes", 115, 4, 23, 1);
	static Aliment oeuf = new Aliment("Oeuf", 145, 12, 1, 10);
	static Aliment tomate = new Aliment("Tomate", 18, 1, 4, 1);
	static Aliment pomme = new Aliment("Pomme", 52, 1, 14, 1);
	static Aliment baouf = new Aliment("Boeuf", 234, 35, 0, 9);
	static Aliment jambon = new Aliment("Jambon", 120, 21, 1, 4);
	static Aliment eau = new Aliment("Eau", 0, 0, 0, 0);
	static Aliment soda = new Aliment("Soda", 40, 0, 10, 0);

	// creation journee
	static Journee j = new Journee();

	// creating basealiment
	static BaseAliment BDalim = new BaseAliment();

	// -----------------------------------------------------
	// PARTIE VUE
	// -----------------------------------------------------

	public static void main(String[] args) {
		// adding aliments to base
		BDalim.addAlimentBase(pates);
		BDalim.addAlimentBase(oeuf);
		BDalim.addAlimentBase(tomate);
		BDalim.addAlimentBase(pomme);
		BDalim.addAlimentBase(baouf);
		BDalim.addAlimentBase(jambon);
		BDalim.addAlimentBase(eau);
		BDalim.addAlimentBase(soda);

		// start function to show main menu
		start();
	}

	/**
	 * Start procedure. It's displaying the main menu
	 */
	private static void start() { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("------------------------------\r\n"
				+ "---     APPLICATION CBon   ---\r\n"
				+ "- Calcul des calories repas  -\r\n"
				+ "------------------------------\r\n"
				+ "0 - Quitter \r\n"
				+ "1 - Ajouter un aliment\r\n"
				+ "2 - Afficher le bilan actuel de la journee\r\n"
				+ "=>\r\n"
				+ "Veuillez saisir un nombre : \r\n"
				+ "");

		int nbchoix = scanner.nextInt();

		while (nbchoix != 0) {
			if (nbchoix == 1) {
				ajoutAliment();
			} else if (nbchoix == 2) {
				afficher();
			}
			quitter();
		}
	}

	/**
	 * Procedure that closes the program
	 */
	private static void quitter() { // exit app
		System.out.println("Quitter.");
		System.exit(0);
	}

	/**
	 * Menu to add an Aliment
	 */
	private static void ajoutAliment() { // menu add aliment
		System.out.println("Liste des aliments disponibles :");
		// displays every aliments from the database
		BDalim.afficherBase(); // function afficherBase
		// asks for aliment to search
		System.out.println("\n\nNom de l'aliment consomme :");
		Scanner aliment = new Scanner(System.in);
		String nomAliment = aliment.next();
		if (BDalim.isInBase(nomAliment)) // .equals pour comparer deux String
		{
			Scanner repas = new Scanner(System.in); 
			System.out.println("Ajouter au repas : \r\n" // menu choix repas
					+ "1 - Petit Dejeuner \r\n"
					+ "2 - Repas \r\n"
					+ "3 - Collation \r\n"
					+ "4 - Diner \r\n"
					+ "Veuillez saisir un nombre : \r\n");
			int choixRepas = repas.nextInt();
			Aliment alimToAdd = BDalim.alimByName(nomAliment);

			if (choixRepas == 1) {
				System.out.println(nomAliment + " a ete ajoute au Petit Dejeuner. \n");
				j.addAlimentRepas(alimToAdd, 0);
			} else if (choixRepas == 2) {
				System.out.println(nomAliment + " a été ajoute au Dejeuner. \n");
				j.addAlimentRepas(alimToAdd, 1);
			} else if (choixRepas == 3){
				System.out.println(nomAliment + " a été ajoute au Collation. \n");
				j.addAlimentRepas(alimToAdd, 2);
			} else if (choixRepas == 4) {
				System.out.println(nomAliment + " a été ajoute au Diner. \n");
				j.addAlimentRepas(alimToAdd, 3);
			}

			start();

		} else {
			System.out.println("Aliment non trouve, veuillez entrer le bon nom ou refaire votre choix: \n");
			System.out.println("0 - Entre un autre aliment \r\n"
					+ "1 - Revenir au menu");
			Scanner rechoice = new Scanner(System.in);
			int choice = rechoice.nextInt();
			if (choice == 0)
				ajoutAliment();
			else
				start();
		}
	}

	/**
	 * Menu to display the statistics of a day
	 */
	private static void afficher() {
		j.afficherJournee();
		start();
	}
}
