package acceso;

import inventario.Ejemplar;
import java.time.LocalDate;

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
       
       String DIAPrestamo;
       String MESPrestamo;
       if(dia<10){
          DIAPrestamo="0"+String.valueOf(dia);
       }else{
           DIAPrestamo=String.valueOf(dia);
       }
       if(mes<10){
           MESPrestamo="0"+String.valueOf(mes);
       }else{
           MESPrestamo=String.valueOf(mes);
       }
       
       LocalDate fechadevolucion=this.fechaPrestamo;
       int diaDev=fechadevolucion.getDayOfMonth();
       int mesDev=fechadevolucion.getMonthValue();
       int anioDev=fechadevolucion.getYear();
       
       String DIADevolucion;
       String MESDevolucion;
       if(diaDev<10){
          DIADevolucion="0"+String.valueOf(diaDev);
       }else{
          DIADevolucion=String.valueOf(diaDev);
       }
       if(mesDev<10){
           MESDevolucion="0"+String.valueOf(mesDev);
       }else{
           MESDevolucion=String.valueOf(mesDev);
       }
       if(disponibilidad==1 || disponibilidad==2 ){
        resultado="1"+","+this.tipoPrestamo+","+DIAPrestamo+"/"+MESPrestamo+"/"+anio+","+this.horaPrestamo+","+this.idBibliotecario+","+DIADevolucion+"/"+MESDevolucion+"/"+anioDev+","+this.lector.getNumDocumento()+","+this.ejemplar.getIdUnico();
       }
       return resultado;
    }

    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getHoraPrestamo() {
        return horaPrestamo;
    }

    public void setHoraPrestamo(int horaPrestamo) {
        this.horaPrestamo = horaPrestamo;
    }

    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }
    
    
    
}
