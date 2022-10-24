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
    private int prestamosPublicoGeneral;
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
        this.prestamosPublicoGeneral = prestamosGenerales;
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

    public String getAutor2() {
        return autor2;
    }

    public void setAutor2(String autor2) {
        this.autor2 = autor2;
    }

    public String getAutor3() {
        return autor3;
    }

    public void setAutor3(String autor3) {
        this.autor3 = autor3;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestamosAlumnosODocentes() {
        return prestamosAlumnosODocentes;
    }

    public void setPrestamosAlumnosODocentes(int prestamosAlumnosODocentes) {
        this.prestamosAlumnosODocentes = prestamosAlumnosODocentes;
    }
    
    public void agregarNuevoPrestamoAlumnoODocente(){
        this.prestamosAlumnosODocentes=this.prestamosAlumnosODocentes+1;
    }
    public int getPrestamosGenerales() {
        return prestamosPublicoGeneral;
    }
    public void agregarNuevoPrestamoPublicoGeneral(){
        this.prestamosAlumnosODocentes=this.prestamosAlumnosODocentes+1;
    }
    
    public void setPrestamosGenerales(int prestamosGenerales) {
        this.prestamosPublicoGeneral = this.prestamosPublicoGeneral+1;
    }

    public List<Edicion> getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(List<Edicion> ediciones) {
        this.ediciones = ediciones;
    }

    public List<Ejemplar> getListaejemplares() {
        return listaejemplares;
    }

    public void setListaejemplares(List<Ejemplar> listaejemplares) {
        this.listaejemplares = listaejemplares;
    }

    @Override
    public String toString() {
        return "Obra{" + "titulo=" + titulo + ", subtitulo=" + subtitulo + ", autor1=" + autor1 + ", autor2=" + autor2 + ", autor3=" + autor3 + ", genero=" + genero + ", ISBN=" + ISBN + ", areaTematica=" + areaTematica + ", tipo=" + tipo + ", edicion=" + edicion + '}';
    }
    //NO TOCAR POR AHORA. PARA INTERFAZ GRAFICA.
    public String tablaGUI() {
        return titulo +","+autor1+","+ISBN+","+genero+"\n";
    }
    
    
    
    
}
