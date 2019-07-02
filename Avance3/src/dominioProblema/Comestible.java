package dominioProblema;

public enum Comestible {

    HAMBURGUESAS("Hamburguesa", 1500),
    POLLOCONPAPAS("Pollo con papas", 2000),
    CARNEALAOLLA("Carne a la olla", 3000),
    PIZZANAPOLITANA("Pizza Napolitana", 3000),
    PIZZAVEGETARIANA("Pizza vegetariana", 2700);
    
    private double precio;
    private String comida;

    private Comestible(String nombre, double precio) {
        this.precio = precio;
        this.comida = nombre;
    }

    public String toString() {
        return getNombre() + "; " + "precio=" + getPrecio();
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        return this.comida;
    }

}
