package acceso;

import inventario.Ejemplar;
import java.time.LocalDate;

public class Prestamo {

    private TipoPrestamo tipoPrestamo;
    private LocalDate fechaPrestamo;
    private int horaPrestamo;
    private int idBibliotecario;
    private LocalDate fechaDevolucion;
    private Lector lector;
    private Ejemplar ejemplar;
    private Bibliotecario bibliotecario;

    public Prestamo() {
    }

    public Prestamo(TipoPrestamo tipoPrestamo, LocalDate fechaPrestamo, int horaPrestamo, Bibliotecario bibliotecario, LocalDate fechaDevolucion, Lector lector, Ejemplar ejemplar) {
        this.tipoPrestamo = tipoPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.horaPrestamo = horaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.bibliotecario = bibliotecario;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "tipoPrestamo=" + tipoPrestamo + ", fechaPrestamo=" + fechaPrestamo + ", horaPrestamo=" + horaPrestamo + ", idBibliotecario=" + idBibliotecario + ", fechaDevolucion=" + fechaDevolucion + ", lector=" + lector + ", ejemplar=" + ejemplar + '}';
    }

    /**
     * Este método se utiliza para cargar los datos de los nuevos prestamos a un
     * bloc de notas según su estado(1:préstamo activo 2:préstamo terminado) que
     * se pasa por parametro
     *
     * @param disponibilidad
     * @return String
     */
    public String toCSV(int disponibilidad) {
        //parametro disponibilidad (1:prestamo activo 2:prestamo terminado)
        String resultado = "";
        LocalDate fechaprestamo = this.fechaPrestamo;
        int dia = fechaprestamo.getDayOfMonth();
        int mes = fechaprestamo.getMonthValue();
        int anio = fechaprestamo.getYear();
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

        if (disponibilidad == 1 || disponibilidad == 2) {
            resultado = disponibilidad + "," + this.tipoPrestamo + "," + DPres + "/" + MPres + "/" + anio + "," + this.horaPrestamo + "," + this.bibliotecario.getNumDocumento() + "," + DDev + "/" + MDev + "/" + anioDev + "," + this.lector.getNumDocumento() + "," + this.ejemplar.getIdUnico();
        }
        return resultado;
    }

    /**
     * Este método se utiliza para mostrar todos los prestamos vigentes con los
     * datos que se quieren es la tabla de la interfaz gráfica
     * “EjemplaresPrestados” en la sección de consulta
     *
     * @return String
     */
    public String tablaPestamosActivo() {

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

        return this.ejemplar.getObra().getTitulo() + "," + this.ejemplar.getIdUnico() + "," + diaDev + "/" + mesDev + "/" + anioDev;
    }

    /**
     * Retorna una cadena de texto con los datos que se desean mostrar en la
     * interfaz “GenerarDevolucion”
     *
     * @return String
     */
    public String tablaDevolucion() {

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

        return this.lector.getNumDocumento() + "," + this.ejemplar.getIdUnico() + "," + diaDev + "/" + mesDev + "/" + anioDev;
    }

    public TipoPrestamo getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(TipoPrestamo tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getHoraPrestamo() {
        return horaPrestamo;
    }

    public void setHoraPrestamo(int horaPrestamo) {
        this.horaPrestamo = horaPrestamo;
    }

    public int getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(int idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    /**
     * Retorna una cadena de texto con los datos que se desean mostrar en la
     * interfaz “PrestamosVigentes”
     *
     * @return String
     */
    public String tablaGUI() {
        LocalDate fechaprestamo = this.fechaPrestamo;
        int dia = fechaprestamo.getDayOfMonth();
        int mes = fechaprestamo.getMonthValue();
        int anio = fechaprestamo.getYear();

        return lector.getNombre() + "," + lector.getApellido() + "," + ejemplar.getObra().getTitulo() + "," + dia + "/" + mes + "/" + anio + "\n";
    }
}
