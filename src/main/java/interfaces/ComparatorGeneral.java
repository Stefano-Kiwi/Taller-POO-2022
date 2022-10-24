package interfaces;

import inventario.Obra;
import java.util.Comparator;

/**
 *
 * @author Daniel Altamirano
 */
public class ComparatorGeneral implements Comparator<Obra> {

    @Override
    public int compare(Obra o1, Obra o2) {

        if (o1 == null && o2 == null) {
            return 0;
        } else {
            if (o1 != null && o2 == null) {
                return 1;
            }

            if (o1 == null && o2 != null) {
                return -1;
            }
        }

        int resultado = -1;

        if (o1 != null && o2 != null) {
            if (o1.getPrestamosGenerales() < o2.getPrestamosGenerales()) {
                resultado = -1;
            }
            if (o1.getPrestamosGenerales() == o2.getPrestamosGenerales()) {
                resultado = 0;
            }
            if (o1.getPrestamosGenerales() > o2.getPrestamosGenerales()) {
                resultado = 1;
            }
        }
        return resultado;
    }

}
