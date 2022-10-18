package inventario;

import acceso.*;
import java.time.LocalDate;

public class Reserva {
    private Obra obra;
    private Lector lector;
    private LocalDate fecha;

    public Reserva(Obra obra, Lector lector, LocalDate fecha) {
        this.obra = obra;
        this.lector = lector;
        this.fecha = fecha;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Reserva{" + "obra=" + obra + ", lector=" + lector + ", fecha=" + fecha + '}';
    }

   
}
