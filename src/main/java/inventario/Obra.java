package inventario;
import java.util.ArrayList;
import java.util.List;

public class Obra {
    private String titulo;
    private String subtitulo;
    private String autor1;
    private String autor2;
    private String autor3;
    private String genero;
    private String caracteristica;
    private String ISBN;
    private int ejemplares;
    private String areaTematica;
    private TipoObra tipo;
    private Edicion edicion;
    private String codigoDeBarras;
    private String observaciones;
    private int prestamosAlumnosODocentes;
    private int prestamosGenerales;
    private List<Edicion> ediciones;
    private List<Ejemplar> listaejemplares;

    public Obra() {
    }
    
    
    public Obra(String titulo, String subtitulo, String autor1, String autor2, String autor3, String genero, String caracteristica, String ISBN, int ejemplares,
            String areaTematica, TipoObra tipo, Edicion edicion,String codigoDeBarras, String observaciones, int prestamosAlumnosODocentes, int prestamosGenerales) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.autor1 = autor1;
        this.autor2 = autor2;
        this.autor3 = autor3;
        this.genero = genero;
        this.caracteristica = caracteristica;
        this.ISBN = ISBN;
        this.ejemplares = ejemplares;
        this.areaTematica = areaTematica;
        this.tipo = tipo;
        this.edicion = edicion;
        this.codigoDeBarras = codigoDeBarras;
        this.observaciones = observaciones;
        this.prestamosAlumnosODocentes = prestamosAlumnosODocentes;
        this.prestamosGenerales = prestamosGenerales;
        ediciones = new ArrayList();
        ediciones.add(edicion);
        listaejemplares = new ArrayList();    
    }
    
    
    public void AgregarEdicion(Edicion edicion){
        if(this.ediciones.isEmpty()){
            this.ediciones.add(edicion);
        }else{
            if(!this.ediciones.contains(edicion)){
                this.ediciones.add(edicion);
            }
        }
    }
       public void AgregarEjemplar(Ejemplar ejemplar){
        if(this.listaejemplares.isEmpty()){
            this.listaejemplares.add(ejemplar);
        }else{
            if(!this.listaejemplares.contains(ejemplar)){
                this.listaejemplares.add(ejemplar);
            }
        }
    }
   
    //GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public String getAutor1() {
        return autor1;
    }

    public String getGenero() {
        return genero;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAreaTematica() {
        return areaTematica;
    }

    public TipoObra getTipo() {
        return tipo;
    }

    public Edicion getEdicion() {
        return edicion;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getObservaciones() {
        return observaciones;
    }  

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obra{");
        sb.append("titulo=").append(titulo);
        sb.append(", subtitulo=").append(subtitulo);
        sb.append(", autor1=").append(autor1);
        sb.append(", autor2=").append(autor2);
        sb.append(", autor3=").append(autor3);
        sb.append(", genero=").append(genero);
        sb.append(", caracteristica=").append(caracteristica);
        sb.append(", ISBN=").append(ISBN);
        sb.append(", ejemplares=").append(ejemplares);
        sb.append(", areaTematica=").append(areaTematica);
        sb.append(", tipo=").append(tipo);
        sb.append(", edicion=").append(edicion);
        sb.append(", codigoDeBarras=").append(codigoDeBarras);
        sb.append(", observaciones=").append(observaciones);
        sb.append(", prestamosAlumnosODocentes=").append(prestamosAlumnosODocentes);
        sb.append(", prestamosGenerales=").append(prestamosGenerales);
        sb.append(", ediciones=").append(ediciones);
        sb.append(", listaejemplares=").append(listaejemplares);
        sb.append('}');
        return sb.toString();
    }
    
    
}
