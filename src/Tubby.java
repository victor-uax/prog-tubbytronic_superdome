public class Tubby {

    // atributos
    private int id;
    private String nombre;
    private String color;
    private int nivelAbrazos;

    /**
     * Metodo constructor de la clase Tubby
     * @param id
     * @param nombre
     * @param color
     * @param nivelAbrazos
     */
    public Tubby(int id, String nombre, String color, int nivelAbrazos) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.nivelAbrazos = nivelAbrazos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getNivelAbrazos() {
        return nivelAbrazos;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
