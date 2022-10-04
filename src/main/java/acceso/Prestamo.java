package acceso;

import inventario.Ejemplar;
import java.time.LocalDate;
import java.util.List;

public class Prestamo {
    private TipoPrestamo tipoPrestamo;
    private LocalDate fechaYHoraPrestamo;
    private int idBibliotecario;
    private LocalDate fechaDevolucion;
    private String codigoDeBarras;
    private Lector lector;
    private  List<Ejemplar> ejemplares;

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
