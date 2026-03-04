public class Superdome {

    // atributos de la clase Superdome
    private Teletubbi[] teletubbies;
    private final int NUM_MAX_TELETUBBIES;

    /**
     * Metodo constructor de la clase Superdome
     * @param cant_max_teletubbies
     */
    public Superdome(int cant_max_teletubbies){

        NUM_MAX_TELETUBBIES = cant_max_teletubbies;
        if( cant_max_teletubbies > 0){
            teletubbies = new Teletubbi[NUM_MAX_TELETUBBIES];
        }else{
            teletubbies = new Teletubbi[15];
        }
    }
}
