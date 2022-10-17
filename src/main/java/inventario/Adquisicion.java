package inventario;

import java.time.LocalDate;

public class Adquisicion {
    private LocalDate fechaAdquisicion;
    private String formaDeCompra;
    private String areaDeReferencia;

    public Adquisicion() {
    }
    
    public Adquisicion(LocalDate fechaAdquisicion, String formaDeCompra,String areaDeReferencia) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaDeCompra = formaDeCompra;
        this.areaDeReferencia = areaDeReferencia;
    }  

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getFormaDeCompra() {
        return formaDeCompra;
    }

    public void setFormaDeCompra(String formaDeCompra) {
        this.formaDeCompra = formaDeCompra;
    }

    public String getAreaDeReferencia() {
        return areaDeReferencia;
    }

    public void setAreaDeReferencia(String areaDeReferencia) {
        this.areaDeReferencia = areaDeReferencia;
    }

    @Override
    public String toString() {
        return "Adquisicion{" + "fechaAdquisicion=" + fechaAdquisicion + ", formaDeCompra=" + formaDeCompra + ", areaDeReferencia=" + areaDeReferencia + '}';
    }
    
}
