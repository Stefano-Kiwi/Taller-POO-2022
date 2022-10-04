package acceso;

import inventario.Ejemplar;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lector extends Persona {
    
    private Multa multa;
    private List<Ejemplar> ListaDeEjemplares;

    public Lector() {
    }

    public Lector(String nombre, String apellido, String tipoDocumento, int numDocumento,
            LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad,
            String domicilio, int codigoPostal, String departamento, String localidad) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular, nacionalidad,
                domicilio, codigoPostal, departamento, localidad);
        ListaDeEjemplares = new ArrayList();
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public List<Ejemplar> getListaDeEjemplares() {
        return ListaDeEjemplares;
    }

    public void setListaDeEjemplares(List<Ejemplar> ListaDeEjemplares) {
        this.ListaDeEjemplares = ListaDeEjemplares;
    }
    
    
    
    public void devolver(Prestamo prestamo){
        
    }
}
