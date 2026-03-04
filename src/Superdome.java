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

    /**
     * Metodo que busca por id el teletubbi buscado
     * @param id
     * @return Teletubbi teletibbiBuscado si lo encuentra o null si no lo ha encontrado
     */
    public Teletubbi buscarTeletubbi(int id){
        boolean seguirBuscando = true;
        Teletubbi teletubbiBusacado = null;

        for( int i = 0; i < NUM_MAX_TELETUBBIES && seguirBuscando; i++){
            if( teletubbies[i] != null && teletubbies[i].getId() == id){
                seguirBuscando = false;
                teletubbiBusacado = teletubbies[i];
            }
        }
        return teletubbiBusacado;
    }


}
