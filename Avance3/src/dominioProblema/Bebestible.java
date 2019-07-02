package dominioProblema;

public enum Bebestible {

    BEBIDA("Bebida", 1000),
    NECTAR("Nectar", 1000),
    JUGONATURAL("Jugo natural", 1500),
    AGUAMINERAL("Agua mineral", 1000);

    private double precio;
    private String bebestible;

    private Bebestible(String nombre, double precio) {
        this.precio = precio;
        this.bebestible = nombre;
    }

    public String toString() {
        return getNombre() + "; " + "precio=" + getPrecio();
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getNombre() {
        return this.bebestible;
    }
}
