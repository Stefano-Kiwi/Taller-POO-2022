package acceso;

import inventario.Ejemplar;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Daniel Altamirano
 */
public class Devolucion {

    private LocalDate fechaDevolucion;
    private boolean FueraDeTermino;
    private Bibliotecario bibliotecario;
    private Ejemplar Ejemplar;

    public Devolucion(LocalDate fechaDevolucion, Bibliotecario bibliotecario, Ejemplar Ejemplar) {
        this.fechaDevolucion = fechaDevolucion;
        this.bibliotecario = bibliotecario;
        this.Ejemplar = Ejemplar;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isFueraDeTermino() {
        return FueraDeTermino;
    }

    public void setFueraDeTermino(boolean FueraDeTermino) {
        this.FueraDeTermino = FueraDeTermino;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Ejemplar getEjemplar() {
        return Ejemplar;
    }

    public void setEjemplar(Ejemplar Ejemplar) {
        this.Ejemplar = Ejemplar;
    }

    @Override
    public String toString() {
        return "Devolucion{" + "fechaDevolucion=" + fechaDevolucion + ", FueraDeTermino=" + FueraDeTermino + ", bibliotecario=" + bibliotecario + ", Ejemplar=" + Ejemplar + '}';
    }

    /**
     * Este método es utilizado para cargar los datos de las devoluciones a un
     * bloc de notas que contiene todas las devoluciones que se hayan realizado
     *
     * @return String
     */
    public String toCSV() {
        LocalDate fechadevolucion = this.fechaDevolucion;
        int diaDev = fechadevolucion.getDayOfMonth();
        int mesDev = fechadevolucion.getMonthValue();
        int anioDev = fechadevolucion.getYear();
        String DDev;
        String MDev;
        if (diaDev < 10) {
            DDev = "0" + String.valueOf(diaDev);
        } else {
            DDev = String.valueOf(diaDev);
        }
        if (mesDev < 10) {
            MDev = "0" + String.valueOf(mesDev);
        } else {
            MDev = String.valueOf(mesDev);
        }
        return this.bibliotecario.getNumDocumento() + "," + this.Ejemplar.getIdUnico() + "," + DDev + "/" + MDev + "/" + anioDev;
    }

}
