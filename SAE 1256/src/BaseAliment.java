// -----------------------------------------------------
// Zhi-Peng Wang
// -----------------------------------------------------

public class BaseAliment {
    Aliment[] alimentsBase = new Aliment[20]; // table of aliments, represents the content of the database
    int nbAlimentBase; // counter of aliments

    /**
     * Constructor of the aliments database
     */
    BaseAliment() {
        this.alimentsBase = new Aliment[20];
        this.nbAlimentBase = 0;
    }
    
    /**
     * Procedure that's adding and aliment to the database
     * @param aliment
     */
    public void addAlimentBase(Aliment aliment) {
        alimentsBase[nbAlimentBase] = aliment;
        nbAlimentBase++;
    }

    /**
     * Procedure that's displaying the full content of the database
     */
    public void afficherBase(){
        for(int i = 0; i < nbAlimentBase; i++){
            System.out.println(alimentsBase[i].getName());
        }
    }

    /**
     * Function that's returning a boolean, also printing some useful informations for the user. It's made to search if the input string is in the database.
     * @param search is the searched string
     * @return Returns a boolean
     */
    public boolean isInBase(String search){
        for(int i = 0; i < nbAlimentBase; i++){
            if (alimentsBase[i].name.equals(search)){
                System.out.println("Aliment trouve dans la base :");
                alimentsBase[i].afficherAliment();
                return true;
            }
        }
        return false;
    }

    /**
     * Function that's returning an Aliment, which matches with the String "aliment" in parameter. The returned aliment has the same name as the String "aliment"
     * @param aliment is the string we are searching for
     * @return Returns the Aliment found
     */
    public Aliment alimByName(String aliment){
        Aliment toReturn = new Aliment();
        for (int i = 0; i < nbAlimentBase; i++){
            if(aliment.equals(alimentsBase[i].getName())){
                toReturn = alimentsBase[i];
                break;
            }
        }
        return toReturn;
    }
}