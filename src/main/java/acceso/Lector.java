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

    public void devolver(Prestamo prestamo){    
    }
    
    public String toCSV(){
       LocalDate a=this.getFechaNacimiento();
       int dia=a.getDayOfMonth();
       int mes=a.getMonthValue();
       int anio=a.getYear();
       return "0"+","+this.getNombre()+","+this.getApellido()+","+dia+"/"+mes+"/"+anio+","+this.getNumDocumento()+","+this.getFechaNacimiento()+","+this.getSexo()+","+this.getCorreo()+","+this.getNroCelular()+","+this.getNacionalidad()+","+this.getDomicilio()+","+this.getCodigoPostal()+","+this.getDepartamento()+","+this.getLocalidad()+","+",";
     }

    
}
