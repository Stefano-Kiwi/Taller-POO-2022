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
}
