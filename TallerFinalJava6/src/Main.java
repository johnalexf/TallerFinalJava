import clases.Escuela;
import clases.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

//    public static void pedirDatosUsuario(String acccion) {
//        System.out.println("Ingrese el numero de identificacion");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el numero de identificacion");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el numero de identificacion");
//        Scanner sc = new Scanner(System.in);
//    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Escuela generation = new Escuela();

        generation.agragarEstudiante("john",1,5);
        generation.agragarEstudiante("Leidy",2,5);
        generation.agragarEstudiante("Angelly",3,5);
        generation.agragarEstudiante("cristian",4,5);

        String[] menu = {"Agregar un nuevo estudiante",
                "Buscar un estudiante por numero de identificacion",
                "Actualizar estudiante por numero de identificacion",
                "Eliminar un estudiante por numero de identificacion",
                "Salir"
        };
        int opcion = 0;
        int numIdentificacion = 0;
        String nombreEstudiante = "";
        double  calificacionEstudiante = 0;
        boolean continuar = true;

        System.out.println("\nBienvenido a tu gestion de lista de estudiantes de la materia programacion");
        do{
            System.out.println("\nSelecciona una de las siguientes opciones");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(i + " : " + menu[i]);
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    //Agregar Nuevo estudiante
                    System.out.println("Escriba el numero de identificacion del nuevo estudiante");
                    numIdentificacion = sc.nextInt();
                    sc.nextLine();
                    if(!generation.buscarEstudiante(numIdentificacion)){
                        System.out.println("Escriba el nuevo nombre del estudiante");
                        nombreEstudiante = sc.next();
                        sc.nextLine();
                        System.out.println("Escriba la nueva calificacion del estudiante");
                        calificacionEstudiante = sc.nextDouble();
                        while( !(calificacionEstudiante >=0 && calificacionEstudiante <=10) ){
                            System.out.println("La calificacion del estudiante no es correcta, debe estar entre 0 y 10");
                            System.out.println("Escriba la nueva calificacion del estudiante");
                            calificacionEstudiante = sc.nextDouble();
                        }
                        generation.agragarEstudiante(nombreEstudiante,numIdentificacion,calificacionEstudiante);
                    }else{
                        System.out.println("el estudiante ya existe");
                    }
                    break;
                case 1:
                    //Buscar estudiante
                    System.out.println("Escriba el numero de identificacion del nuevo estudiante");
                    numIdentificacion = sc.nextInt();
                    generation.buscarEstudiante(numIdentificacion);
                    break;
                case 2:
                    //Actualizar estudiante
                    System.out.println("Escriba el numero de identificacion del nuevo estudiante");
                    numIdentificacion = sc.nextInt();
                    sc.nextLine();
                    if(generation.buscarEstudiante(numIdentificacion)){
                        System.out.println("Escriba el nuevo nombre del estudiante");
                        nombreEstudiante = sc.next();
                        sc.nextLine();
                        System.out.println("Escriba la nueva calificacion del estudiante");
                        calificacionEstudiante = sc.nextDouble();
                        while( !(calificacionEstudiante >=0 && calificacionEstudiante <=10) ){
                            System.out.println("La calificacion del estudiante no es correcta, debe estar entre 0 y 10");
                            System.out.println("Escriba la nueva calificacion del estudiante");
                            calificacionEstudiante = sc.nextDouble();
                        }
                        generation.actualizarEstudiante(numIdentificacion,nombreEstudiante,calificacionEstudiante);
                    }
                    break;
                case 3:
                    //Eliminar estudiante
                    System.out.println("Escriba el numero de identificacion del estudiante que desea eliminar");
                    numIdentificacion = sc.nextInt();
                    generation.eliminarEstudiante(numIdentificacion);
                    break;
                case 4:
                    //Salir del menu
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while(opcion != 4);

        System.out.println("Gracias por usar nuestro servicio");

    }
}