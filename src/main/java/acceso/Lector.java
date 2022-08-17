package acceso;

import java.time.LocalDate;

public class Lector extends Persona {

    public Lector() {
    }

    public Lector(String nombre, String apellido, String tipoDocumento, int numDocumento,
            LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad,
            String domicilio, int codigoPostal, String departamento, String localidad) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular, nacionalidad,
                domicilio, codigoPostal, departamento, localidad);
    }
    
    public void devolver(Prestamo prestamo){
        
    }
}
