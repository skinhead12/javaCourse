public class SuperPersonaje {
    /* ATRIBUTOS (CARACTERISTICAS O CUALIDADES) */
    private String nombre, poder, equipo;
    private int edad, vidas;
    private double valorComercial, nivelPoder;
    private boolean tieneAlas;
    private char genero;

    /*
     * METODO CONSTRUCTOR ESTE SE CREA YA QUE AL COLOCAR
     * LAS VARIABLES COMO PRIVATE NO PODEMOS ASIGNAR VALORES POR ELLO EL CONSTRUCTOR
     * SE PUEDE ACCEDER DESDE FUERA DE LA CLASE
     */

    public SuperPersonaje(String nombre, String poder, double valorComercial, boolean tieneAlas) {
        this.nombre = nombre;
        this.poder = poder;
        this.valorComercial = valorComercial;
        this.tieneAlas = true;
    }

    /* GETTER OBTENER LOS DATOS */

    public String getNombre() {
        return this.nombre;
    }

    public String getPoder() {
        return this.poder;
    }

    public double getValorComercial() {
        return this.valorComercial;
    }

    /* SETTER permite modificar los atributos de clase */

    public void setValorComercial(double valorComercial) {
        if (valorComercial > 0) {
            this.valorComercial = valorComercial;
        }
    }

    /* METODOS (ACCIONES) */
    void correr() {
        System.out.println("el jugador esta corriendo");
    }

    void atacar() {
    }

    void saltar() {
    }

    void defender() {
    }

    void volar() {
    }

    void jugar() {
    }
}
