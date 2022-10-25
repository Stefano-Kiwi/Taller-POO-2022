package acceso;

import java.time.LocalDate;
import java.util.List;

public class Bibliotecario extends Persona{
    private String nombreUsuario;
    private String contraseña;
    private List<Devolucion> devoluciones;
    private List<Prestamo> prestamos;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, String apellido, String tipoDocumento, int numDocumento,
            LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad,
            String domicilio, int codigoPostal, String departamento, String localidad, String nombreusuario, String contraseña) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular,
                nacionalidad,domicilio, codigoPostal, departamento, localidad);
        this.nombreUsuario = nombreusuario;
        this.contraseña = contraseña;
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Devolucion> getDevoluciones() {
        return devoluciones;
    }

    public void setDevoluciones(List<Devolucion> devoluciones) {
        this.devoluciones = devoluciones;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    public String toString(){
        return this.getApellido() + " " + this.getNombre();
    }
    
}
