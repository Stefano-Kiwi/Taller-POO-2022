package interfaces;

import inventario.Obra;
import java.util.Comparator;


public class ComparatorAlumnoDocente implements Comparator<Obra> {

    @Override
    public int compare(Obra o1, Obra o2) {

        int resultado = -1;

        if (o1 != null && o2 != null) {
            if (o1.getPrestamosAlumnosODocentes() < o2.getPrestamosAlumnosODocentes()) {
                resultado = 1;
            }
            if (o1.getPrestamosAlumnosODocentes() == o2.getPrestamosAlumnosODocentes()) {
                resultado = 0;
            }
            if (o1.getPrestamosAlumnosODocentes() > o2.getPrestamosAlumnosODocentes()) {
                resultado = -1;
            }
        }
        return resultado;
    }
}
