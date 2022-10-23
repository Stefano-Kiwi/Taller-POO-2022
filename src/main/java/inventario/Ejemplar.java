package inventario;

import java.time.LocalDate;
import java.util.Objects;

public class Ejemplar {
    private static int contadorEj = 0;  // Cuando se crea un nuevo ej aumenta
    private String idUnico;
    private String lugarFisico;
    private Obra obra;
    private Baja baja;
    private Adquisicion adquisicion;

    public Ejemplar(String lugarFisico,Obra obra, Adquisicion adquisicion) {
        this.contadorEj++;
        this.lugarFisico = lugarFisico;
        this.obra = obra;
        this.idUnico = lugarFisico+String.valueOf(contadorEj);
        this.adquisicion = adquisicion;
        
    }
    public Ejemplar(String lugarFisico,Obra obra,Adquisicion adquisicion,Baja baja) {
        this.contadorEj++;
        this.lugarFisico = lugarFisico;
        this.obra = obra;
        this.idUnico = lugarFisico+String.valueOf(contadorEj);
        this.baja = baja;
        this.adquisicion = adquisicion;
    }

    public Ejemplar() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idUnico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ejemplar other = (Ejemplar) obj;
        return Objects.equals(this.idUnico, other.idUnico);
    }

    public static int getContadorEj() {
        return contadorEj;
    }

    public static void setContadorEj(int contadorEj) {
        Ejemplar.contadorEj = contadorEj;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Baja getBaja() {
        return baja;
    }

    public void setBaja(Baja baja) {
        this.baja = baja;
    }

    public Adquisicion getAdquisicion() {
        return adquisicion;
    }

    public void setAdquisicion(Adquisicion adquisicion) {
        this.adquisicion = adquisicion;
    }
    
    

    public String getIdUnico() {
        return idUnico;
    }

    public String getLugarFisico() {
        return lugarFisico;
    }       

    @Override
    public String toString() {
        return "Ejemplar{" + "idUnico=" + idUnico + ", lugarFisico=" + lugarFisico + ", obra=" + obra + ", baja=" + baja + ", adquisicion=" + adquisicion + '}';
    }

    
      public String tablaGUI() {
        return obra.getTitulo() +","+ this.lugarFisico;
    }
    
    public String toCSV(int disponibilidad){
          //disponibilidad =(1: disponible 2: prestado)
        LocalDate fAdquisicion=adquisicion.getFechaAdquisicion();
        int dia=fAdquisicion.getDayOfMonth();
        int mes=fAdquisicion.getMonthValue();
        int año=fAdquisicion.getYear();
        
        String DIA;
        String MES;
        if(dia<10){
            DIA="0"+String.valueOf(dia);
        }else{
            DIA=String.valueOf(dia);
        }
        if(mes<10){
            MES="0"+String.valueOf(mes);
        }else{
            MES=String.valueOf(mes);
        }
        String resultado="";
        if(disponibilidad==1 || disponibilidad==2 ){
           resultado= disponibilidad+","+obra.getISBN()+","+lugarFisico+","+DIA+"/"+MES+"/"+año+","+adquisicion.getFormaDeCompra()+","+"no"+","+",";
        }
        return resultado;
    }
}
