package acceso;

import inventario.Ejemplar;
import java.time.LocalDate;
//import java.util.List;

public class Prestamo {
    private TipoPrestamo tipoPrestamo;
    private LocalDate fechaPrestamo;
    private int horaPrestamo;
    private int idBibliotecario;
    private LocalDate fechaDevolucion;
    private String codigoDeBarras;
    private Lector lector;
    //private List<Ejemplar> listaEjemplares;
    private  Ejemplar ejemplar;

    public Prestamo() {
    }

    public Prestamo(TipoPrestamo tipoPrestamo, LocalDate fechaPrestamo,int horaPrestamo, int idBibliotecario, LocalDate fechaDevolucion,Lector lector,Ejemplar ejemplar) {
        this.tipoPrestamo = tipoPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.horaPrestamo=horaPrestamo;
        this.idBibliotecario = idBibliotecario;
        this.fechaDevolucion = fechaDevolucion;
        //this.codigoDeBarras = codigoDeBarras; falta implementar codigo de barra del ejemplar
        this.lector=lector;
        this.ejemplar=ejemplar;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "tipoPrestamo=" + tipoPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", horaPrestamo=" + horaPrestamo + ", idBibliotecario=" + idBibliotecario + ", fechaDevolucion=" + fechaDevolucion + ", codigoDeBarras=" + codigoDeBarras + ", lector=" + lector + ", ejemplar=" + ejemplar + '}';
    }
    
    public String toCSV(int disponibilidad){
        //parametro disponibilidad (1:prestamo activo 2:prestamo terminado)
       String resultado="";
       LocalDate fechaprestamo=this.fechaPrestamo;
       int dia=fechaprestamo.getDayOfMonth();
       int mes=fechaprestamo.getMonthValue();
       int anio=fechaprestamo.getYear();
       LocalDate fechadevolucion=this.fechaPrestamo;
       int diaDev=fechadevolucion.getDayOfMonth();
       int mesDev=fechadevolucion.getMonthValue();
       int anioDev=fechadevolucion.getYear();
       if(disponibilidad==1 || disponibilidad==2 ){
        resultado="1"+","+this.tipoPrestamo+","+dia+"/"+mes+"/"+anio+","+this.horaPrestamo+","+this.idBibliotecario+","+diaDev+"/"+mesDev+"/"+anioDev+","+this.lector.getNumDocumento()+","+this.ejemplar.getIdUnico();
       }
       return resultado;
    }
}
