package acceso;

import java.time.LocalDate;
import java.util.List;

public class Bibliotecario extends Persona{
    
    private List<Devolucion> devoluciones;
    private List<Prestamo> prestamos;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String apellido, String tipoDocumento, int numDocumento,
            LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad,
            String domicilio, int codigoPostal, String departamento, String localidad) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular,
                nacionalidad,domicilio, codigoPostal, departamento, localidad);
    }
    
    public void accederSistema(){
        System.out.println("Acceso permitido");
    }
    
    public void AgregarPrestamo(Prestamo prestamo){
        if(this.prestamos.isEmpty()){
            this.prestamos.add(prestamo);
        }else{
            if(!this.prestamos.contains(prestamo)){
                this.prestamos.add(prestamo);
            }
        }
    }
    public void AgregarDevolucion(Devolucion devolucion){
        if(this.devoluciones.isEmpty()){
            this.devoluciones.add(devolucion);
        }else{
            if(!this.devoluciones.contains(devolucion)){
                this.devoluciones.add(devolucion);
            }
        }
    }
}
