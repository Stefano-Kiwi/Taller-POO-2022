package inventario;

import acceso.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Almacenamiento {

    private List<Obra> obras;
    private List<Ejemplar> ejemplares;
    private List<Reserva> reservasRealizas;
    private List<Reserva> reservas;
    private List<Ejemplar> ejemplarDisponibles;
    private List<Ejemplar> ejemplaresPrestados;
    private List<Ejemplar> ejemplaresDadosDeBaja;
    private List<Prestamo> prestamosActivos;
    private List<Prestamo> prestamosTerminados;
    private List<Multa> multas;
    private Lector LectorMultado;

    public Almacenamiento() {
    }

    public void obtenerObras(String direccion) {
        obras = new ArrayList();
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
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Reserva> getReservasRealizas() {
        return reservasRealizas;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }
    
    public List<Obra> getObras() {
        return this.obras;
    }

    public List<Obra> busquedaObras(int tipoBusqueda, String busqueda) {
        List<Obra> resultado = new ArrayList();     // 1 Titulo o subtítulo 2 autor 3 genero 4 ISBN 5 Editorial 6 Nombre de colección
        switch (tipoBusqueda) {
            case 1: // TITULO O SUBTITULO
                for (Obra obra : obras) {
                    if ((obra.getTitulo().equalsIgnoreCase(busqueda)) || (obra.getSubtitulo().equalsIgnoreCase(busqueda))) {
                        resultado.add(obra);
                    }
                }

                break;
            case 2: // CUALQUIERA DE SUS 3 AUTORES
                for (Obra obra : obras) {
                    if ((obra.getAutor1().equalsIgnoreCase(busqueda)) || (obra.getAutor2().equalsIgnoreCase(busqueda)) || (obra.getAutor3().equalsIgnoreCase(busqueda))) {
                        resultado.add(obra);
                    }
                }
                break;
            case 3:
                for (Obra obra : obras) { // GENERO
                    if ((obra.getGenero().equalsIgnoreCase(busqueda))) {
                        resultado.add(obra);
                    }
                }

                break;
            case 4:
                for (Obra obra : obras) {   // ISBN
                    if ((obra.getISBN().equalsIgnoreCase(busqueda))) {
                        resultado.add(obra);
                    }
                }

                break;
            case 5:
                for (Obra obra : obras) {   // Nombre editorial
                    if ((obra.getEdicion().getNombreEditorial().equalsIgnoreCase(busqueda))) {
                        resultado.add(obra);
                    }
                }

                break;
            /*          FALTA IMPLEMENTAR PARA COLECCIONES.
                case 6:
                for (Obra obra : obras) {
                    if((obra.getColeccion().getNombreColeccion().equalsIgnoreCase(busqueda))){
                        resultado.add(obra);
                    }
                }
                
                break; */
        }
        return resultado;
    }

    public void agregarObra(Obra obra) {
        obras.add(obra);

    }

    public void obtenerEjemplares(String direccion) {
        this.ejemplares = new ArrayList();
        this.ejemplarDisponibles = new ArrayList();
        this.ejemplaresPrestados = new ArrayList();
        this.ejemplaresDadosDeBaja = new ArrayList();
        try {
            final String regex1 = "^(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$";

            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            Pattern pattern = Pattern.compile(regex1);
            String linea;

            linea = br.readLine();

            Matcher matcher;

            while ((linea = br.readLine()) != null) {
                matcher = pattern.matcher(linea);
                if (matcher.matches()) {    // ISBN, lugarFisico,fechaAdquisicion, formaDeCompra, si/no, fechaDeBaja,motivoBaja

                    String disponibilidad = matcher.group(1);

                    String isbn = matcher.group(2);
                    String lugar = matcher.group(3);
                    String idunico = matcher.group(6);
                    String estaDadoDeBaja = matcher.group(7);

                    String fechaAd = matcher.group(4);
                    String[] fechaArr = fechaAd.split("/");

                    LocalDate fechaAdquisicion = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));

                    String fechaBA = matcher.group(8);

                    LocalDate fechaBAJA = null;
                    if (!(fechaBA == "")) {
                        String[] fechaAr = fechaBA.split("/");

                        fechaBAJA = LocalDate.of(Integer.parseInt(fechaAr[2]), Integer.parseInt(fechaAr[1]), Integer.parseInt(fechaAr[0]));
                    }

                    String motivo = matcher.group(9);

                    for (Obra obra : obras) {
                        Ejemplar ej = new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico);
                                ej.generarQR(); // CON ESTO GENERO SU QR UNICAMENTE.
                        if (obra.getISBN().equals(isbn)) {
                            obra.setEjemplares(obra.getEjemplares() + 1);  // ESTO LO AGREGA A LA OBRA EN SÍ.

                            switch (disponibilidad) {
                                case "1":
                                    this.ejemplarDisponibles.add(new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico));
                                    break;
                                case "2":
                                    this.ejemplaresPrestados.add(new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico));
                                    break;
                                case "3":
                                    this.ejemplaresDadosDeBaja.add(new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico, new Baja(fechaBAJA, motivo, lugar)));
                                    break;
                            }

                            if (estaDadoDeBaja.equalsIgnoreCase("no")) {          // ESTO LO AGREGA A LA LISTA DE EJEMPLARES GENERAL.
                                ejemplares.add(new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico));
                                obra.AgregarEjemplar(new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico));

                            } else {
                                ejemplares.add(new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico, new Baja(fechaBAJA, motivo, lugar)));
                                obra.AgregarEjemplar(new Ejemplar(lugar, obra, new Adquisicion(fechaAdquisicion, matcher.group(5), obra.getAreaTematica()), idunico, new Baja(fechaBAJA, motivo, lugar)));
                            }
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Lector buscarLector(int dni) {    // Implementar
        return null;
    }

    public void agregarReserva(Obra obra, int dni) {

        reservas.add(new Reserva(obra, this.buscarLector(dni), LocalDate.now()));
    }

    public void quitarReserva(int id) {
        reservas.remove(id);
    }

    public void escribirCSV(String direccion, String linea) {
        /* metodo para escribir una linea en un .txt ; dos parametros
          1er paramatro direccion del .txt a modificar
          2do parametro linea a escribir
         */

        try {
            File archivo = new File(direccion);

            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String a = "";
            if ((a = br.readLine()) == null) {
                br.close();
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(linea + "\n");
                bw.close();
                fw.close();
            } else {
                String lineas = "";
                lineas = a;
                while ((a = br.readLine()) != null) {
                    lineas = (lineas + "\n" + a);
                }
                br.close();
                fr.close();

                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                lineas = (lineas + "\n" + linea + "\n");
                bw.write(lineas);
                bw.close();
                fw.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void agregarNuevoRenglonCSV(String direccion, String contenido) {
        try {
            Writer output;
            output = new BufferedWriter(new FileWriter(new File(direccion), true));
            output.append("New Line!");
            output.close();
        } catch (Exception e) {

        }

    }

    public void borrarCSV(String direccion, int opcion) {
        /*borra lineas del .txt pasado por parametro dependiendo de la opcion
         opcion 0 = borra todo
         opcion 1 = borra la primera linea
         opcion 3 = borra la ultima linea
         */
        switch (opcion) {
            case 0://borra todo lo que hay en la direccion
               try {
                File archivo = new File(direccion);
                FileWriter fw = new FileWriter(archivo);
                fw.flush();
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            break;
            case 1://borra la primera linea de la direccion
               try {
                File archivo = new File(direccion);
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String l = "";
                if ((l = br.readLine()) == null) {
                    System.out.println("vacio 1");
                    break;
                } else {
                    ArrayList<String> lineas = new ArrayList<>();
                    lineas.add(l);
                    while ((l = br.readLine()) != null) {
                        lineas.add(l);
                    }

                    br.close();
                    fr.close();
                    FileWriter fw = new FileWriter(archivo);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String resultado = "";
                    for (int i = 1; i < lineas.size(); i++) {
                        resultado = (resultado + lineas.get(i) + "\n");
                    }
                    bw.write(resultado);
                    bw.close();
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            break;
            case 2://borra la ultima linea de la direccion
               try {
                File archivo = new File(direccion);
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String la = "";
                if ((la = br.readLine()) == null) {
                    System.out.println("vacio 2");
                    break;
                } else {
                    ArrayList<String> lineas = new ArrayList<>();
                    lineas.add(la);
                    while ((la = br.readLine()) != null) {
                        lineas.add(la);
                    }
                    br.close();
                    fr.close();
                    FileWriter fw = new FileWriter(archivo);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String resultado = "";
                    for (int i = 0; i < (lineas.size() - 1); i++) {
                        resultado = (resultado + lineas.get(i) + "\n");
                    }
                    bw.write(resultado);
                    bw.close();
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            break;

        }

    }

    public void obtenerPrestamos(String direccion) {

        this.prestamosActivos = new ArrayList();
        this.prestamosTerminados = new ArrayList();

        DatosDeAcceso da = new DatosDeAcceso();
        da.obtenerLectores("recursos/ListadoDeLectores.txt");
        List<Lector> lectores = da.getLectores();

        try {
            String regex1 = "^(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$";
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
                    String opcion = matcher.group(1);
                    Lector lector = null;
                    int dniLector = Integer.parseInt(matcher.group(7));
                    for (Lector lector1 : lectores) {
                        if (lector1.getNumDocumento() == dniLector) {
                            lector = lector1;
                            break;
                        }
                    }

                    String idunico = matcher.group(8);
//              String isbn = matcher.group(9);//no es necesario ya que la busqueda por idunico funciona
                    Ejemplar ejemplar = null;
                    for (Ejemplar ejemplar1 : ejemplares) {
//                  if(ejemplar1.getObra().getISBN().equals(isbn)){
                        if (idunico.equalsIgnoreCase(ejemplar1.getIdUnico())) {
                            ejemplar = ejemplar1;
                            break;
                        }                       
                    }
                    
                    if (lector instanceof Docente || lector instanceof Alumno) {
                        ejemplar.getObra().agregarNuevoPrestamoAlumnoODocente();
                    } else {
                        ejemplar.getObra().agregarNuevoPrestamoPublicoGeneral();
                    }

                    TipoPrestamo tp = null;
                    String Tipo = matcher.group(2);
                    switch (Tipo) {
                        case "SALA":
                            tp = tp.SALA;
                            break;
                        case "DOMICILIO":
                            tp = tp.DOMICILIO;
                            break;
                    }

                    String fechaPrestamo = matcher.group(3);
                    String[] fechaArr = fechaPrestamo.split("/");
                    LocalDate fecha = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));

                    String fechaDevolucion = matcher.group(6);
                    String[] fechaArr2 = fechaDevolucion.split("/");
                    LocalDate fechaDev = LocalDate.of(Integer.parseInt(fechaArr2[2]), Integer.parseInt(fechaArr2[1]), Integer.parseInt(fechaArr2[0]));

                    switch (opcion) {
                        case "1":
                            this.prestamosActivos.add(new Prestamo(tp, fecha, Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), fechaDev, lector, ejemplar));
                            break;
                        case "2":
                            this.prestamosTerminados.add(new Prestamo(tp, fecha, Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), fechaDev, lector, ejemplar));
                            break;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modificarCSV(String direccion, String lineaaModificar, String lineaNueva) {
        /*
        metodo para modificar un txt pensado para actualizar el txt
        luego de un prestamo o devolucion
         */

        File archivo = new File(direccion);
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String a = "";
            String lineas = "";
            a = br.readLine();
            lineas = a;
            while ((a = br.readLine()) != null) {
                if (lineaaModificar.equalsIgnoreCase(a)) {
                    lineas = lineas + "\n" + lineaNueva;
                } else {
                    lineas = lineas + "\n" + a;
                }
            }
            br.close();
            fr.close();
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(lineas);

            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void obtenerMultas(String direccion) {
        this.multas = new ArrayList();
        try {
            String regex1 = "^(.*),(.*),(.*)$";
            File archivo = new File(direccion);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            Pattern pattern = Pattern.compile(regex1);
            String linea;
            linea = br.readLine();
            Matcher matcher;

            DatosDeAcceso da = new DatosDeAcceso();

            da.obtenerLectores("recursos/ListadoDeLectores.txt");

            List<Lector> lectores = da.getLectores();

            while ((linea = br.readLine()) != null) {
                matcher = pattern.matcher(linea);
                if (matcher.matches()) {
                    String dniLector = matcher.group(1);
                    String cantDiasMulta = matcher.group(2);
                    String fechaDevolucion = matcher.group(3);

                    String[] fechaArr = fechaDevolucion.split("/");

                    LocalDate fecha = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));
                    Lector lector = null;
                    for (Lector lector1 : lectores) {
                        if (lector1.getNumDocumento() == Integer.parseInt(dniLector)) {
                            lector = lector1;
                            break;
                        }
                    }

                    Multa multa2 = new Multa(Integer.parseInt(cantDiasMulta), fecha, lector);

                    this.multas.add(multa2);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void obtenerMulta(Lector lector) {
        for (Multa multa : multas) {
            if (multa.getLector().getNumDocumento() == lector.getNumDocumento()) {
                lector.setMulta(multa);
            }
        }
    }

    public List<Prestamo> getPrestamosActivos() {
        return prestamosActivos;
    }

    public void setPrestamosActivos(List<Prestamo> prestamosActivos) {
        this.prestamosActivos = prestamosActivos;
    }

    public List<Prestamo> getPrestamosTerminados() {
        return prestamosTerminados;
    }

    public void setPrestamosTerminados(List<Prestamo> prestamosTerminados) {
        this.prestamosTerminados = prestamosTerminados;
    }

    public List<Ejemplar> getEjemplarDisponibles() {
        return ejemplarDisponibles;
    }

    public void setEjemplarDisponibles(List<Ejemplar> ejemplarDisponibles) {
        this.ejemplarDisponibles = ejemplarDisponibles;
    }

    public List<Ejemplar> getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(List<Ejemplar> ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public List<Ejemplar> getEjemplaresDadosDeBaja() {
        return ejemplaresDadosDeBaja;
    }

    public void setEjemplaresDadosDeBaja(List<Ejemplar> ejemplaresDadosDeBaja) {
        this.ejemplaresDadosDeBaja = ejemplaresDadosDeBaja;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public List<Multa> getMultas() {
        return multas;
    }

    public void setMultas(List<Multa> multas) {
        this.multas = multas;
    }

    public void ObtenerReservas(String direccion) {
        //carga los lectores
        DatosDeAcceso da = new DatosDeAcceso();
        da.obtenerLectores("recursos/ListadoDeLectores.txt");
        List<Lector> lectores = da.getLectores();

        reservas = new ArrayList();

        File archivo = new File(direccion);
        try {
            int disponibilidad = 0;
            final String regex1 = "^(.*),(.*),(.*),(.*)$"; //disponibilidad,titulo,nrodni,fechareserva
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            Pattern pattern = Pattern.compile(regex1);
            String linea;

            linea = br.readLine();
            Matcher matcher;

            while ((linea = br.readLine()) != null) {
                matcher = pattern.matcher(linea);
                if (matcher.matches()) {
                    disponibilidad = Integer.parseInt(matcher.group(1));
                    String titulo = matcher.group(2);
                    int NumDNI = Integer.parseInt(matcher.group(3));
                    String fechaReserva = matcher.group(4);

                    //busca obra por titulo
                    Obra obra = null;
                    for (Obra obra1 : this.obras) {
                        if (obra1.getTitulo().equalsIgnoreCase(titulo)) {
                            obra = obra1;
                        }
                    }
                    //busca lector por documento
                    Lector lector = null;
                    for (Lector lector1 : lectores) {
                        if (lector1.getNumDocumento() == NumDNI) {
                            lector = lector1;
                        }
                    }

                    //parsea la fecha a tipo Localdate
                    String[] fechaArr = fechaReserva.split("/");
                    LocalDate fecha = LocalDate.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1]), Integer.parseInt(fechaArr[0]));

                    Reserva reserva;

                    switch (disponibilidad) {
                        case 1:
                            reserva = new Reserva(obra, lector, fecha);
                            this.reservas.add(reserva);
                            break;
                        case 2:
                            reserva = new Reserva(obra, lector, fecha);
                            this.reservasRealizas.add(reserva);
                            break;
                    }
                }
            }

        } catch (Exception e) {

        }
    }
}
