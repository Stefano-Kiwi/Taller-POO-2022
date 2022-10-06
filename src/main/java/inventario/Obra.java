package inventario;

import java.util.List;

public class Obra {
    //maty
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
}
