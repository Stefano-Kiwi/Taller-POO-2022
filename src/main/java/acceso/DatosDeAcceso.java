package acceso;

import interfaces.Login;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

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

                LocalDate fecha = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));
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
    
    public Bibliotecario obtenerBibliotecario() {
        BufferedReader br = null;
        Bibliotecario biblio = null;
        try {
            br = new BufferedReader(new FileReader("recursos/usuarios.txt"));
            String line = br.readLine();
            while (line != null) {
                String[] campos = line.split(",");
 
            
                    String fecha = campos[6];
                    String[] fechaArr = fecha.split("/");
                    LocalDate fechaNa = LocalDate.of(Integer.parseInt(fechaArr[2]),Integer.parseInt(fechaArr[1]),Integer.parseInt(fechaArr[0]));
                    biblio = new Bibliotecario(campos[2],campos[3],campos[4],Integer.parseInt(campos[5]),fechaNa,campos[7],campos[8],campos[9],campos[10],campos[11],Integer.parseInt(campos[12]),campos[13],campos[14],campos[0],campos[1]);
                    usuarios.add(biblio);
                line = br.readLine();
            }

          
            br.close();

        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Component frame = null;
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
        return biblio;
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
