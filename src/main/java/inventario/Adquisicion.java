package inventario;

import java.time.LocalDate;

public class Adquisicion {
    private LocalDate fechaAdquisicion;
    private String formaDeCompra;
    private LocalDate fechaDadoDeBaja;
    private String motivoBaja;
    private String ubicacionBaja;
    private String areaDeReferencia;

    public Adquisicion() {
    }

    public Adquisicion(LocalDate fechaAdquisicion, String formaDeCompra, LocalDate fechaDadoDeBaja, String motivoBaja, String ubicacionBaja, String areaDeReferencia) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.formaDeCompra = formaDeCompra;
        this.fechaDadoDeBaja = fechaDadoDeBaja;
        this.motivoBaja = motivoBaja;
        this.ubicacionBaja = ubicacionBaja;
        this.areaDeReferencia = areaDeReferencia;
    }
    
}
