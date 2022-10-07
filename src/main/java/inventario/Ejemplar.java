package inventario;

public class Ejemplar {
    private String idUnico;
    private String lugarFisico;

    public Ejemplar() {
    }

    public Ejemplar(String idUnico, String lugarFisico) {
        this.idUnico = idUnico;
        this.lugarFisico = lugarFisico;
    }

    public String getIdUnico() {
        return idUnico;
    }

    public String getLugarFisico() {
        return lugarFisico;
    }
    
    
    
}
