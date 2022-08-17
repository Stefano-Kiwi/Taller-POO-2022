package acceso;

import java.time.LocalDate;

public class Bibliotecario extends Persona{

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
    public void a(){
        
    }
}
