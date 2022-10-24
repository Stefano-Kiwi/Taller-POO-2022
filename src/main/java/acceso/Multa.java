package acceso;
import inventario.Almacenamiento;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel Altamirano
 */
public class Multa {
    
    private int DiasMulta;
    private LocalDate fecha;
    private Devolucion devolucion;
    private Lector lector;

    public Multa(int DiasMulta, LocalDate fecha) {
        this.DiasMulta = DiasMulta;
        this.fecha = fecha;
//        this.devolucion = devolucion;
//        this.lector = lector;
    }
    
    public Multa(int DiasMulta, LocalDate fecha,Lector lector) {
        this.DiasMulta = DiasMulta;
        this.fecha = fecha;
//        this.devolucion = devolucion;
        this.lector = lector;
    }
    
    public String fechaVencimiento(){
        String resultado="";
        LocalDate fechaVencimiento=null;
        int diaVen=fecha.getDayOfMonth()+DiasMulta;
        fechaVencimiento=LocalDate.of(fecha.getYear(),fecha.getMonthValue(),diaVen);
        int dia=fechaVencimiento.getDayOfMonth();
        int mes=fechaVencimiento.getMonthValue();
        int anio=fechaVencimiento.getYear();
        return dia+"/"+mes+"/"+anio;    
    }
    public int getDiasMulta() {
        return DiasMulta;
    }

    public void setDiasMulta(int DiasMulta) {
        this.DiasMulta = DiasMulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Devolucion getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Devolucion devolucion) {
        this.devolucion = devolucion;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Multa{" + "multa=" + DiasMulta + ", fecha=" + fecha +'}';
    }
    
    
    public String toCSVMulta(){
        LocalDate a = this.fecha;
        int dia = a.getDayOfMonth();
        int mes = a.getMonthValue();
        int anio = a.getYear();
        return this.getLector().getNumDocumento()+","+this.DiasMulta+","+dia+"/"+mes+"/"+anio;
    }
    
    
    public String tablaGUI() {
        
        Almacenamiento a = new Almacenamiento();
        DatosDeAcceso datos = new DatosDeAcceso();
        
        datos.obtenerLectores("recursos/ListadoDeLectores.txt");
        a.obtenerMultas("recursos/ListaMultas.txt");
        List<Lector> lectores = datos.getLectores();
        List<Multa> multas = a.getMultas();
        int cant = 0; // contador para contar multas
        List<Integer> dnis = new ArrayList();
        for (Multa multa : multas) {
            dnis.add(multa.getLector().getNumDocumento());
            for (Lector lector : lectores) {
                if(lector.getNumDocumento() == multa.getLector().getNumDocumento()){
                    cant++;
                }
        }
        }
        
        
        
        
        return this.lector.getNombre() +" "+ this.lector.getApellido() +","+this.lector.getNumDocumento()+","+cant+"\n";
    }
   
}
