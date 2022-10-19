package acceso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatosDeAcceso {

    // Todos los lectores se guardan en esta lista asd
    private List<Lector> lectores = new ArrayList();
        
    private List<Bibliotecario> usuarios = new ArrayList();

    public DatosDeAcceso() {
    }

    public void obtenerLectores(String direccion) {
        try {
            final String regex1 = "^(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)";

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
                    //System.out.println("MATCHEA");
                }
                //Tipo, si es 0 es publico general, si es 1 es Alumno, si es 2 es Docente
                String tipo = matcher.group(1);
                String nombre = matcher.group(2);
                String apellido = matcher.group(3);
                String tipoDeDocumento = matcher.group(4);
                String numDeDocumento = matcher.group(5);
                String fechaNacimiento = matcher.group(6);
                String sexo = matcher.group(7);
                String correo = matcher.group(8);
                String nroCelular = matcher.group(9);
                String nacionalidad = matcher.group(10);
                String domicilio = matcher.group(11);
                String codigoPostal = matcher.group(12);
                String departamento = matcher.group(13);
                String localidad = matcher.group(14);
                String carrera = matcher.group(15);
                String facultad = matcher.group(16);

                //Splitea el String obtenido desde el .txt para usar en LocalDate.of
                String[] fechaArr = fechaNacimiento.split("/");

                //LocalDate fecha = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));
                LocalDate fecha = LocalDate.now();
                switch (tipo) {
                    case "0":
                        this.lectores.add(new Lector(nombre, apellido, tipoDeDocumento, Integer.parseInt(numDeDocumento), fecha, sexo, correo, nroCelular, nacionalidad, domicilio, Integer.parseInt(codigoPostal), departamento, localidad));
                        break;
                    case "1":
                        this.lectores.add(new Alumno(nombre, apellido, tipoDeDocumento, Integer.parseInt(numDeDocumento), fecha, sexo, correo, nroCelular, nacionalidad, domicilio, Integer.parseInt(codigoPostal), departamento, localidad, carrera, facultad));
                        break;
                    case "2":
                        this.lectores.add(new Docente(nombre, apellido, tipoDeDocumento, Integer.parseInt(numDeDocumento), fecha, sexo, correo, nroCelular, nacionalidad, domicilio, Integer.parseInt(codigoPostal), departamento, localidad, carrera));
                        break;
                    default:
                        throw new AssertionError();
                }

            }

        } catch (Exception e) {
            //System.out.println(e.getStackTrace().toString());
            e.printStackTrace();
        }
    }

    public List<Bibliotecario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Bibliotecario> usuarios) {
        this.usuarios = usuarios;
    }

    // Retorar la lista de alumnos
    public List<Lector> getLectores() {
        return this.lectores;
    }
}
