package inventario;

/**
 * 
 * Clase usada únicamente en Obra
 */
public class Coleccion {
    private String nombre;
    private String ISBN;

    public Coleccion() {
    }

    public Coleccion(String nombre, String ISBN) {
        this.nombre = nombre;
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coleccion{");
        sb.append("nombre=").append(nombre);
        sb.append(", ISBN=").append(ISBN);
        sb.append('}');
        return sb.toString();
    }
    
}
