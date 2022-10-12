package acceso;

import inventario.Obra;

public class PerfilDeudas {
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private int numeroDocumento;
    private String nroCelular;
    private Obra [] debeEjemplares;

    public PerfilDeudas() {
   }

    public PerfilDeudas(String nombre, String apellido, String tipoDocumento, int numeroDocumento, String nroCelular, Obra[] debeEjemplares) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nroCelular = nroCelular;
        this.debeEjemplares = debeEjemplares;
    }
    
    
}
