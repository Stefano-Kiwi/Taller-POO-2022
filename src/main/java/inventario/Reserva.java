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

    /**
     * Este método es utilizado para cargar los datos de las reservas a un bloc
     * de notas en el formato correspondiente que contiene a todas las reservas
     *
     * @return String
     */
    public String toCSV(int disponibilidad) {
        //parametro disponibilidad (1:prestamo activo 2:prestamo terminado)
        String resultado = "";
        LocalDate fechaReserva = this.fecha;
        int dia = fecha.getDayOfMonth();
        int mes = fecha.getMonthValue();
        int anio = fecha.getYear();
        String DPres;
        String MPres;
        if (dia < 10) {
            DPres = "0" + String.valueOf(dia);
        } else {
            DPres = String.valueOf(dia);
        }
        if (mes < 10) {
            MPres = "0" + String.valueOf(mes);
        } else {
            MPres = String.valueOf(mes);
        }

        if (disponibilidad == 1 || disponibilidad == 2) {
            resultado = disponibilidad + "," + this.obra.getTitulo() + "," + this.lector.getNumDocumento() + "," + dia + "/" + mes + "/" + anio;
        }
        return resultado;
    }

    /**
     * Este método se utiliza para crear una cadena de texto con los datos que
     * se quieren mostrar en la tabla de la interfaz gráfica
     *
     * @return String
     */
    public String tablaGUI() {
        LocalDate fechaReserva = this.fecha;
        int dia = fecha.getDayOfMonth();
        int mes = fecha.getMonthValue();
        int anio = fecha.getYear();
        return obra.getTitulo() + "," + lector.getNumDocumento() + "," + dia + "/" + mes + "/" + anio + "\n";
    }
}
