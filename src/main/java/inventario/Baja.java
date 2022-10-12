package inventario;

import java.time.LocalDate;

public class Baja {

private LocalDate fechaDadoDeBaja;
private String motivoBaja;
private String  UbicacionBaja;

    public Baja(LocalDate fechaDadoDeBaja, String motivoBaja, String UbicacionBaja) {
        this.fechaDadoDeBaja = fechaDadoDeBaja;
        this.motivoBaja = motivoBaja;
        this.UbicacionBaja = UbicacionBaja;
    }

    public LocalDate getFechaDadoDeBaja() {
        return fechaDadoDeBaja;
    }

    public void setFechaDadoDeBaja(LocalDate fechaDadoDeBaja) {
        this.fechaDadoDeBaja = fechaDadoDeBaja;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    public String getUbicacionBaja() {
        return UbicacionBaja;
    }

    public void setUbicacionBaja(String UbicacionBaja) {
        this.UbicacionBaja = UbicacionBaja;
    }

    @Override
    public String toString() {
        return "Baja{" + "fechaDadoDeBaja=" + fechaDadoDeBaja + ", motivoBaja=" + motivoBaja + ", UbicacionBaja=" + UbicacionBaja + '}';
    }   
}
