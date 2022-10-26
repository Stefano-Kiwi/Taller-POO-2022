package acceso;

import java.time.LocalDate;

public class Multa {

    private int DiasMulta;
    private LocalDate fecha;
    private Devolucion devolucion;
    private Lector lector;

    public Multa(int DiasMulta, LocalDate fecha) {
        this.DiasMulta = DiasMulta;
        this.fecha = fecha;
    }

    public Multa(int DiasMulta, LocalDate fecha, Lector lector) {
        this.DiasMulta = DiasMulta;
        this.fecha = fecha;
        this.lector = lector;
    }

    public String fechaVencimiento() {
        String resultado = "";
        LocalDate fechaVencimiento = null;
        int diaVen = fecha.getDayOfMonth() + DiasMulta;
        fechaVencimiento = LocalDate.of(fecha.getYear(), fecha.getMonthValue(), diaVen);
        int dia = fechaVencimiento.getDayOfMonth();
        int mes = fechaVencimiento.getMonthValue();
        int anio = fechaVencimiento.getYear();
        return dia + "/" + mes + "/" + anio;
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
        return "Multa{" + "multa=" + DiasMulta + ", fecha=" + fecha + '}';
    }

    /**
     * Este método se utiliza para crear una cadena de texto con los datos que
     * se quieren mostrar en la tabla de la interfaz gráfica
     *
     * @return String
     */
    public String toCSVMulta() {
        LocalDate a = this.fecha;
        int dia = a.getDayOfMonth();
        int mes = a.getMonthValue();
        int anio = a.getYear();
        return this.getLector().getNumDocumento() + "," + this.DiasMulta + "," + dia + "/" + mes + "/" + anio;
    }

    /**
     * Este método se utiliza para crear una cadena de texto con los datos que
     * se quieren mostrar en la tabla de la interfaz gráfica
     *
     * @return String
     */
    public String tablaGUI() {

        return this.lector.getNombre() + " " + this.lector.getApellido() + "," + this.lector.getNumDocumento() + "\n";
    }

}
