package inventario;

public class Ejemplar {
    private String idUnico;
    private String lugarFisico;
    private Obra obra;
    private Baja baja;

    public Ejemplar() {
    }

    public Ejemplar(String idUnico, String lugarFisico,Obra obra) {
        this.idUnico = idUnico;
        this.lugarFisico = lugarFisico;
        this.obra = obra;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public String getLugarFisico() {
        return lugarFisico;
    }       
    
    
    
}
