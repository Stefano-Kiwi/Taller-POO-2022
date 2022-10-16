package inventario;

import java.util.Objects;

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
    
    

    public String getIdUnico() {
        return idUnico;
    }

    public String getLugarFisico() {
        return lugarFisico;
    }       
    
    
    
}
