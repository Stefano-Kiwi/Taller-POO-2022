package acceso;

import inventario.Almacenamiento;
import inventario.Ejemplar;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Lector extends Persona implements Comparable<Lector>{

    private Multa multaActiva;
    private List<Multa> multas= new ArrayList();
    private List<Ejemplar> ListaDeEjemplares=new ArrayList();
    private int cantMultas = 0;
    
    public Lector(){
    }

    public Lector(String nombre, String apellido, String tipoDocumento, int numDocumento,
            LocalDate fechaNacimiento, String sexo, String correo, String nroCelular, String nacionalidad,
            String domicilio, int codigoPostal, String departamento, String localidad) {
        super(nombre, apellido, tipoDocumento, numDocumento, fechaNacimiento, sexo, correo, nroCelular, nacionalidad,
                domicilio, codigoPostal, departamento, localidad);
        TerminarMulta();
    }

    public Multa getMulta() {
        return multaActiva;
    }

    public void setMulta(Multa multa) {
        this.multaActiva = multa;
        multas.add(multa);
        TerminarMulta();
    }
    public void TerminarMulta(){
        //verifica si la multa ya caducó
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
    
    public void agregarMulta(Multa multa){
        this.multas.add(multa);
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
        
        String ejemplares="";
        for (Ejemplar ej: this.ListaDeEjemplares) {
            ejemplares += ej.getObra().getTitulo() + "/";
        }
        
        return getNombre()+ ","+getApellido()+","+getTipoDocumento()+","+getNumDocumento()+"," +getNroCelular()+ ","+ejemplares+"\n";
    }
    
    public String toCSVMulta(){
        LocalDate a = this.multaActiva.getFecha();
        int dia = a.getDayOfMonth();
        int mes = a.getMonthValue();
        int anio = a.getYear();
        return getNumDocumento()+","+this.multaActiva.getDiasMulta()+","+dia+"/"+mes+"/"+anio;
    }

    
    public String tablaGUIRanking() {
        
        Almacenamiento a = new Almacenamiento();
        DatosDeAcceso datos = new DatosDeAcceso();

        datos.obtenerLectores("recursos/ListadoDeLectores.txt");
        a.obtenerMultas("recursos/ListaMultas.txt");
        List<Multa> multas = a.getMultas();
        List<Lector> lectores = datos.getLectores();

        
        List<String> multados = new ArrayList();
        int cant= 0;
        for (Multa multa : multas) {
            if(multa.getLector().getNumDocumento() == this.getNumDocumento()){
                cant++;
            }
            
        }
        this.cantMultas = cant;
        
        return getNombre()+ " "+getApellido()+","+getNumDocumento()+","+cant+"\n";
    }

    @Override
    public int compareTo(Lector o) {
        if(o.getCantMultas() < this.getCantMultas()){
            return -1;
        }
        if(o.getCantMultas() > this.cantMultas){
            return 1;
        }else{
            return 0;
        }
    }

    public int getCantMultas() {
        return cantMultas;
    }

  
    
    
    
}
