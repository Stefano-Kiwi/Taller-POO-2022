package inventario;

/**
 * 
 * Clase utilizada en clase Obra.
 */
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

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getVolumenes() {
        return volumenes;
    }

    public void setVolumenes(int volumenes) {
        this.volumenes = volumenes;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
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
