package acceso;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Daniel Altamirano
 */
public class Devolucion {
    
    private LocalDate fechaYHoraDevolucion;
    private boolean FueraDeTermino;
   // private String codigoDeBarras;
    private Prestamo prestamo;

    public Devolucion(LocalDate fechaYHoraDevolucion, boolean FueraDeTermino,Prestamo prestamo) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
        this.FueraDeTermino = FueraDeTermino;
        //this.codigoDeBarras = codigoDeBarras;
        this.prestamo = prestamo;
    }

    public LocalDate getFechaYHoraDevolucion() {
        return fechaYHoraDevolucion;
    }

    public void setFechaYHoraDevolucion(LocalDate fechaYHoraDevolucion) {
        this.fechaYHoraDevolucion = fechaYHoraDevolucion;
    }

    public boolean isFueraDeTermino() {
        return FueraDeTermino;
    }

    public void setFueraDeTermino(boolean FueraDeTermino) {
        this.FueraDeTermino = FueraDeTermino;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Devolucion other = (Devolucion) obj;
        if (this.FueraDeTermino != other.FueraDeTermino) {
            return false;
        }
//        if (!Objects.equals(this.codigoDeBarras, other.codigoDeBarras)) {
//            return false;
//        }
        if (!Objects.equals(this.fechaYHoraDevolucion, other.fechaYHoraDevolucion)) {
            return false;
        }
        return Objects.equals(this.prestamo, other.prestamo);
    }

    @Override
    public String toString() {
        return "Devolucion{" + "fechaYHoraDevolucion=" + fechaYHoraDevolucion + ", FueraDeTermino=" + FueraDeTermino + ", prestamo=" + prestamo + '}';
    }   
}
