package acceso;

import inventario.Ejemplar;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Lector extends Persona {

    private Multa multaActiva;
    private List<Multa> multas;
    private List<Ejemplar> ListaDeEjemplares;

    public Lector() {
    }

    public Lector(String nombre, String apellido, String tipoDocumento, int numDocumento,
            LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad,
            String domicilio, int codigoPostal, String departamento, String localidad) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular, nacionalidad,
                domicilio, codigoPostal, departamento, localidad);
        
        TerminarMulta();
        ListaDeEjemplares = new ArrayList<Ejemplar>();
        multas=new ArrayList<Multa>();
    }

    public Multa getMulta() {
        return multaActiva;
    }

    public void setMulta(Multa multa) {
        this.multaActiva = multa;
        multas.add(multa);
    }
    public void TerminarMulta(){
        LocalDate hoy=null;
        hoy=LocalDate.now();
        
        if(multaActiva!=null){
         LocalDate fechaMulta = multaActiva.getFecha();
         LocalDate fechaVencimiento=null;
         int DiafechaMulta=fechaMulta.getDayOfMonth();
         int dias=multaActiva.getDiasMulta(); 
         int diaVencimiento=DiafechaMulta+dias;
       
         fechaVencimiento=LocalDate.of(fechaMulta.getYear(),fechaMulta.getMonthValue(), diaVencimiento);
        
         if(hoy.isAfter(fechaVencimiento)){
            this.multaActiva=null;
         }
        }
    }
    
    public List<Multa> getMultas() {
        return multas;
    }
    
    public List<Ejemplar> getListaDeEjemplares() {
        return ListaDeEjemplares;
    }
    
    public void AgregarEjemplar(Ejemplar ejemplar){
    this.ListaDeEjemplares.add(ejemplar);
    }
            

    public void devolver(Prestamo prestamo) {
    }

    public String toCSV() {
        LocalDate a = this.getFechaNacimiento();
        int dia = a.getDayOfMonth();
        int mes = a.getMonthValue();
        int anio = a.getYear();
        return "0" + "," + this.getNombre() + "," + this.getApellido() + "," + this.getTipoDocumento() + "," + this.getNumDocumento() + "," + dia + "/" + mes + "/" + anio + "," + this.getSexo() + "," + this.getCorreo() + "," + this.getNroCelular() + "," + this.getNacionalidad() + "," + this.getDomicilio() + "," + this.getCodigoPostal() + "," + this.getDepartamento() + "," + this.getLocalidad() + "," + ",";
    }

    public String tablaGUI() {
        return getNombre()+ ","+getApellido()+","+getTipoDocumento()+","+getNumDocumento()+"," +getNroCelular()+ "," +this.ListaDeEjemplares+"\n";
    }

}
