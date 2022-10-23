package acceso;
import java.time.LocalDate;

/**
 *
 * @author Daniel Altamirano
 */
public class Multa {
    
    private int DiasMulta;
    private LocalDate fecha;
    private Devolucion devolucion;
    private Lector lector;

    public Multa(int DiasMulta, LocalDate fecha) {
        this.DiasMulta = DiasMulta;
        this.fecha = fecha;
//        this.devolucion = devolucion;
//        this.lector = lector;
    }

    public int getDiasMulta() {
        return DiasMulta;
    }

    public void setDiasMulta(int DiasMulta) {
        this.DiasMulta = DiasMulta;
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
        return "Multa{" + "multa=" + DiasMulta + ", fecha=" + fecha +'}';
    }
    
    
   
}
