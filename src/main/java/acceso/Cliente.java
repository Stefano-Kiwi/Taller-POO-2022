package acceso;

import inventario.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author stefa
 */
public class Cliente {

    public static void main(String[] args) {
        Almacenamiento almacenamiento = new Almacenamiento();
        DatosDeAcceso datosDeAcceso = new DatosDeAcceso();
        //Almacenamiento.obtenerUsuarios();
        almacenamiento.obtenerObras("recursos/ListadoDeObras.txt");
        almacenamiento.obtenerEjemplares("recursos/ListadoDeEjemplares.txt");
        datosDeAcceso.obtenerAlumnos("recursos/ListadoDeAlumnos.txt");
        
        
        List<Obra> obras = almacenamiento.getObras();
        List<Alumno> alumnos = datosDeAcceso.getAlumnos();
        List<Ejemplar> ejemplares = almacenamiento.getEjemplares();
        /**
         * int i=0; for(Obra obra:obras){ i++; System.out.println("Obra "+i+":
         * "+obra); }
         *
         * for (Alumno alumno : alumnos) { System.out.println(alumno); }
        *
         */
        
        //Prueba escribir CSV
//        
//          almacenamiento.escribirCSV("recursos/PrestamosAConfirmar.txt", "hola;");
//          almacenamiento.escribirCSV("recursos/PrestamosAConfirmar.txt", "lala;");
//          almacenamiento.escribirCSV("recursos/PrestamosAConfirmar.txt", "lolo;");
//          almacenamiento.escribirCSV("recursos/PrestamosAConfirmar.txt", "laho;");
//          
        //Prueba borrar CSV
            //borra la primera linea
//          almacenamiento.borrarCSV("recursos/PrestamosAConfirmar.txt",1);

            //borra la ultima linea
//            almacenamiento.borrarCSV("recursos/PrestamosAConfirmar.txt",2);
            
            //borra todas las lineas
//          almacenamiento.borrarCSV("recursos/PrestamosAConfirmar.txt", 0);        
        
        
        // ----------------------------------------------------------------- Esqueleto del programa ---------------------------------------------
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("1: Consultas, 2: Iniciar sesion, 3: Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:         // TAREAS QUE SE PUEDEN REALIZAR: Consultar obras y cuantos ejemplares tiene cada una
                    System.out.println("BUSCAR POR:\n1: Titulo o subtítulo \n2: autor \n3: genero \n4: ISBN \n5 Nombre de colección");
                    int numOpcion = sc.nextInt();
                    System.out.println("Ingresa la búsqueda...");
                    String busqueda = sc.nextLine();
                    busqueda = sc.nextLine();
                    List<Obra> listaObras = almacenamiento.busquedaObras(numOpcion, busqueda);

                    if (listaObras.isEmpty()) {
                        System.out.println("No se encontraron obras.");
                    } else {

                        System.out.println("LISTA DE OBRAS ENCONTRADAS: \n");
                        int num = 0;
                        for (Obra listaObra : listaObras) {
                            num++;
                            System.out.println(num + ": " + listaObra.getTitulo() + ", autor: " + listaObra.getAutor1() + ", ISBN: " + listaObra.getISBN());
                        }

                        System.out.println("Elige una obra para más info...");
                        numOpcion = sc.nextInt();
                        if (listaObras.size() < numOpcion) {
                            System.out.println("La opcion ingresada es incorrecta");
                        } else {
                            
                            List<Ejemplar> ListEjemplares = listaObras.get(numOpcion -1).getListaejemplares();
                            if(!ListEjemplares.isEmpty()){
                                System.out.println("Los ejemplares disponibles son: ");
                                int cont = 0;
                                for (Ejemplar ListEjemplare : ListEjemplares) {
                                    cont++;
                                    System.out.println(cont+"= "+ListEjemplare+"\n");
                                }
                            }else{
                                System.out.println("Datos de la obra: \n" + listaObras.get(numOpcion - 1) + "\nDesea realizar una reserva de esta obra? si/no");
                                busqueda = sc.nextLine();
                            busqueda = sc.nextLine();
                            if (busqueda.equalsIgnoreCase("si")) {
                                System.out.println("Reserva hecha con exito");
                                // IMPLEMENTAR DEJAR RESERVADA UNA OBRA...
                            }
                            }
                            
                        }

                    }
                    break;
                case 2:         // TAREAS: Agregar obra, consultar ejemplares(), agregar ejemplar, dar de baja ejemplar, observaciones sobre un ejemplar, 
                    //realizar nuevo prestamo,consultar info sobre un prestamo, devolucion de un ejemplar, 
                    System.out.println("Ingresa tu nombre de usuario...");
                    String usuario = sc.nextLine();
                    System.out.println("Ingresa tu clave...");
                    String clave = sc.nextLine();

                    break;

            }

        }

        // ----------------------------------------------------------------- Fin Esqueleto del programa ---------------------------------------------
    }
}
