package acceso;

import java.time.LocalDate;

public class Prestamo {
    private TipoPrestamo tipoPrestamo;
    private LocalDate fechaYHoraPrestamo;
    private int idBibliotecario;
    private LocalDate fechaDevolucion;
    private String codigoDeBarras;

    public Prestamo() {
    }

    public Prestamo(TipoPrestamo tipoPrestamo, LocalDate fechaYHoraPrestamo, int idBibliotecario, LocalDate fechaDevolucion, String codigoDeBarras) {
        this.tipoPrestamo = tipoPrestamo;
        this.fechaYHoraPrestamo = fechaYHoraPrestamo;
        this.idBibliotecario = idBibliotecario;
        this.fechaDevolucion = fechaDevolucion;
        this.codigoDeBarras = codigoDeBarras;
    }
    
}
