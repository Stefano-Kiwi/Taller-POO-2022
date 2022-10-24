package acceso;

import interfaces.Login;
import inventario.Almacenamiento;
import inventario.Ejemplar;
import inventario.Obra;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteInterfaces {
    public static void main(String[] args) {
       
        Almacenamiento almacenamiento = new Almacenamiento();
        DatosDeAcceso datosDeAcceso = new DatosDeAcceso();
        //Almacenamiento.obtenerUsuarios();
        almacenamiento.obtenerObras("recursos/ListadoDeObras.txt");
        almacenamiento.obtenerEjemplares("recursos/ListadoDeEjemplares.txt");
        datosDeAcceso.obtenerLectores("recursos/ListadoDeLectores.txt");
        
        
        List<Obra> obras = almacenamiento.getObras();
        List<Lector> lectores = datosDeAcceso.getLectores();
        List<Ejemplar> ejemplares = almacenamiento.getEjemplares();
        
        
       
        
        // ----------------------------------------------------------------- Esqueleto del programa ---------------------------------------------
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        
            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:         // TAREAS QUE SE PUEDEN REALIZAR: Consultar obras y cuantos ejemplares tiene cada una
                    System.out.println("BUSCAR POR:\n1: Titulo o subtítulo \n2: autor \n3: genero \n4: ISBN \n5: Nombre editorial\n6: Nombre de colección");
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
                            
                            Obra obraDeseada = listaObras.get(numOpcion -1);
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
                                System.out.println("Ingresa tu dni para reservar...");
                                int dni = sc.nextInt();
                                System.out.println("Reserva hecha con exito");
                                almacenamiento.agregarReserva(obraDeseada,dni);
                            }
                            }
                            
                        }

                    }
                    break;
                case 2:         // TAREAS: 1 Agregar obra,2 consultar ejemplares(),3 agregar ejemplar,4 dar de baja ejemplar,5 observaciones sobre un ejemplar, 
                    //realizar nuevo prestamo,consultar info sobre un prestamo, devolucion de un ejemplar, 
                    System.out.println("Ingresa tu nombre de usuario...");
                    String vacio = sc.nextLine();
                   String usuario = sc.nextLine();
                    
                    System.out.println("Ingresa tu clave...");
                    
                    String clave = sc.nextLine();
                   
                    if((usuario.equals("admin")&&(clave.equals("admin")))){
                        boolean cerrarSesion = false;
                        int opcionDeseada = 0;
                        while(cerrarSesion==false){
                            System.out.println("1: Agregar obra\n2: Consultar ejemplares\n3: Agregar ejemplar\n4: Dar de baja ejemplar\n5: Hacer una observacion sobre un ejemplar"
                                    + "\n6: Realizar un préstamo\n7: Consultar prestamos\n8: Devolución de un ejemplar\n0: Cerrar sesión actual");
                            opcion = sc.nextInt();
                        switch(opcionDeseada){
                            case 1: 
                                System.out.println("Titulo, subtitulo, autor1, autor2, autor3, genero, caract, isbn, ejemplares,areaTematica,tipo,nombreEditorial,pais,numeroEdicion,anio,volumenes,idioma,paginas,formato,codigoBarras,observaciones");
                                String datosNuevaObra = sc.nextLine();
                                final String regex1 = "^(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$";
                                Pattern pattern = Pattern.compile(regex1);
                                Matcher matcher = pattern.matcher(datosNuevaObra);
                                 if (matcher.matches()) {   // Guardando los datos de la nueva obra
                             //        almacenamiento.agregarObra(new Obra(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4), matcher.group(5), matcher.group(6), matcher.group(7), matcher.group(8), Integer.parseInt(matcher.group(9)), matcher.group(10), TipoObra.LIBRO, new Edicion(matcher.group(11), matcher.group(12), matcher.group(13), matcher.group(14), matcher.group(15), matcher.group(16), matcher.group(17), matcher.group(18)), matcher.group(13), matcher.group(14), 0, 0));
                                 }else{
                                     System.out.println("Los datos ingresados son incorrectos, asegurarse de usar bien las comas");
                                 }
                        }
                        
                        }
                    }
                    break;

            }

        }

        // ----------------------------------------------------------------- Fin Esqueleto del programa ---------------------------------------------
    }

    

