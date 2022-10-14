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
    private List<Alumno> alumnos = new ArrayList();
    private List<Bibliotecario> usuarios = new ArrayList();

    public DatosDeAcceso() {
    }
    
    
    public void obtenerAlumnos(String direccion) {
        try {
            final String regex1 = "^(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$";

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
               
                 
                String nombre = matcher.group(1);
                String apellido = matcher.group(2);
                String tipoDeDocumento = matcher.group(3);
                String numDeDocumento = matcher.group(4);
                String fechaNacimiento = matcher.group(5);
                String sexo = matcher.group(6);
                String correo = matcher.group(7);
                String nroCelular = matcher.group(8);
                String nacionalidad = matcher.group(9);
                String domicilio = matcher.group(10);
                String codigoPostal = matcher.group(11);
                String departamento = matcher.group(12);
                String localidad = matcher.group(13);
                String carrera = matcher.group(14);
                String facultad = matcher.group(15);
                
                //Splitea el String obtenido desde el .txt para usar en LocalDate.of
                String[] fechaArr = fechaNacimiento.split("-");
               
                LocalDate fecha = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));
  
                this.alumnos.add(new Alumno(nombre, apellido, tipoDeDocumento, Integer.parseInt(numDeDocumento), fecha, sexo, correo, nroCelular, nacionalidad, domicilio, Integer.parseInt(codigoPostal), departamento, localidad, carrera, facultad));

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Bibliotecario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Bibliotecario> usuarios) {
        this.usuarios = usuarios;
    }
    
    // Retorar la lista de alumnos
    public List<Alumno> getAlumnos(){
        return this.alumnos;
    }
}
