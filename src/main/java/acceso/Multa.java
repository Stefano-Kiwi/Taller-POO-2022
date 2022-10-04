package acceso;
import java.time.LocalDate;

/**
 *
 * @author Daniel Altamirano
 */
public class Multa {
    
    private String multa;
    private LocalDate fecha;
    private Devolucion devolucion;
    private Lector lector;

    public Multa(String multa, LocalDate fecha, Devolucion devolucion, Lector lector) {
        this.multa = multa;
        this.fecha = fecha;
        this.devolucion = devolucion;
        this.lector = lector;
    }

    public String getMulta() {
        return multa;
    }

    public void setMulta(String multa) {
        this.multa = multa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Multa{" + "multa=" + multa + ", fecha=" + fecha + ", devolucion=" + devolucion + ", lector=" + lector + '}';
    }
    
    
   
}
