package inventario;

import acceso.Alumno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Almacenamiento {

    private List<Obra> obras = new ArrayList();
    
    public Almacenamiento() {
    }

    public void obtenerObras(String direccion) {
        try {
            final String regex1 = "^(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$";

            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            Pattern pattern = Pattern.compile(regex1);
            String linea;

            linea = br.readLine();

            Matcher matcher;

            while ((linea = br.readLine()) != null) {
                matcher = pattern.matcher(linea);
                if (matcher.matches()) {
                   // System.out.println("MATCHEA");
                }
                /**
                 * System.out.println(matcher.group(1)+"\n");
                 * System.out.println(matcher.group(2)+"\n");
                 * System.out.println(matcher.group(3)+"\n");
                 * System.out.println(matcher.group(4)+"\n");
                 * System.out.println(matcher.group(5)+"\n");
                 * System.out.println(matcher.group(6)+"\n");
                 * System.out.println(matcher.group(7)+"\n");
                 * System.out.println(matcher.group(8)+"\n");
                 * System.out.println(matcher.group(9)+"\n");
                 * System.out.println(matcher.group(10)+"\n");
                 * System.out.println(matcher.group(11)+"\n");
                 * System.out.println(matcher.group(12)+"\n");
                 * System.out.println(matcher.group(13)+"\n");
                 * System.out.println(matcher.group(14)+"\n");
                 * System.out.println(matcher.group(15)+"\n");
                 * System.out.println(matcher.group(16)+"\n");
                 * System.out.println(matcher.group(17)+"\n");
                 * System.out.println(matcher.group(18)+"\n");
                 * System.out.println(matcher.group(19)+"\n");
                 * System.out.println(matcher.group(20)+"\n");
             *
                 */
                String titulo = matcher.group(1);
                String subtitulo = matcher.group(2);
                String autor1 = matcher.group(3);
                String autor2 = matcher.group(4);
                String autor3 = matcher.group(5);
                String genero = matcher.group(6);
                String caract = matcher.group(7);
                String isbn = matcher.group(8);
                String areaTematica = matcher.group(9);
                TipoObra tipoObra = TipoObra.LIBRO;
                switch (matcher.group(10)) {
                    case "LIBRO":
                        tipoObra = TipoObra.LIBRO;
                        break;
                    case "REVISTA":
                        tipoObra = TipoObra.REVISTA;
                        break;
                    case "ENSAYO":
                        tipoObra = TipoObra.ENSAYO;
                        break;
                    case "TESIS":
                        tipoObra = TipoObra.TESIS;
                        break;
                    case "MANUAL":
                        tipoObra = TipoObra.MANUAL;
                        break;
                }
                Edicion edicion = new Edicion(matcher.group(11), matcher.group(12), matcher.group(13), Integer.parseInt(matcher.group(14)), Integer.parseInt(matcher.group(15)),
                        matcher.group(16), Integer.parseInt(matcher.group(17)), matcher.group(18));

                Coleccion coleccion = new Coleccion(matcher.group(19), matcher.group(20));  // DE MOMENTO NO GUARDADA EN NINGUN LUGAR

                this.obras.add(new Obra(titulo, subtitulo, autor1, autor2, autor3, genero, caract, isbn, 0, areaTematica, tipoObra, edicion, "0", "observaciones:", 0, 0));

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public List<Obra> getObras(){
        return this.obras;
    }
    
    public List<Obra> busquedaObras(int tipoBusqueda,String busqueda){
        List<Obra> resultado = new ArrayList();     // 1 Titulo o subtítulo 2 autor 3 genero 4 ISBN 5 Nombre de colección
        switch(tipoBusqueda){
            case 1: // TITULO O SUBTITULO
                for (Obra obra : obras) {
                    if((obra.getTitulo().equalsIgnoreCase(busqueda))||(obra.getSubtitulo().equalsIgnoreCase(busqueda))){
                        resultado.add(obra);
                    }
                }
                
                break;
            case 2: // CUALQUIERA DE SUS 3 AUTORES
                for (Obra obra : obras) {
                    if((obra.getAutor1().equalsIgnoreCase(busqueda))||(obra.getAutor2().equalsIgnoreCase(busqueda))||(obra.getAutor3().equalsIgnoreCase(busqueda))){
                        resultado.add(obra);
                    }
                }
                break;
            case 3:
                for (Obra obra : obras) {
                    if((obra.getGenero().equalsIgnoreCase(busqueda))){
                        resultado.add(obra);
                    }
                }
                
                break;
                case 4:
                for (Obra obra : obras) {
                    if((obra.getISBN().equalsIgnoreCase(busqueda))){
                        resultado.add(obra);
                    }
                }
                
                break;
                /*          FALTA IMPLEMENTAR PARA COLECCIONES.
                case 5:
                for (Obra obra : obras) {
                    if((obra.getColeccion().getNombreColeccion().equalsIgnoreCase(busqueda))){
                        resultado.add(obra);
                    }
                }
                
                break; */
        }
        return resultado;
    }
}
