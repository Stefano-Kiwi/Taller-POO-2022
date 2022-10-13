package inventario;

public class Edicion {
    private String nombreEditorial;
    private String pais;
    private String numero;
    private int anio;
    private int volumenes;
    private String idioma;
    private int paginas;
    private String formato;
    
    public Edicion() {
    }

    public Edicion(String nombreEditorial, String pais, String numero, int anio, int volumenes, String idioma, int paginas, String formato) {
        this.nombreEditorial = nombreEditorial;
        this.pais = pais;
        this.numero = numero;
        this.anio = anio;
        this.volumenes = volumenes;
        this.idioma = idioma;
        this.paginas = paginas;
        this.formato = formato;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Edicion{");
        sb.append("nombreEditorial=").append(nombreEditorial);
        sb.append(", pais=").append(pais);
        sb.append(", numero=").append(numero);
        sb.append(", anio=").append(anio);
        sb.append(", volumenes=").append(volumenes);
        sb.append(", idioma=").append(idioma);
        sb.append(", paginas=").append(paginas);
        sb.append(", formato=").append(formato);
        sb.append('}');
        return sb.toString();
    }
    
    
}
