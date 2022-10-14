package acceso;

import inventario.*;
import java.util.List;

/**
 *
 * @author stefa
 */
public class Cliente {

    public static void main(String[] args) {
        Almacenamiento almacenamiento = new Almacenamiento();
        
        almacenamiento.obtenerObras("recursos/ListadoDeObras.txt");
        
        almacenamiento.obtenerAlumnos("recursos/ListadoDeAlumnos.txt");
        
        List<Obra> obras = almacenamiento.getObras();
        List<Alumno> alumnos= almacenamiento.getAlumnos();
        int i=0;
        for(Obra obra:obras){
            i++;
           System.out.println("Obra "+i+": "+obra);
        }
        
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        

    }
}
