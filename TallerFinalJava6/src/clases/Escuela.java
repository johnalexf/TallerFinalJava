package clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Escuela extends Estudiante {

    private Set<Estudiante> escuela = new HashSet<>();

    public Escuela() {
    }

    public void agragarEstudiante(String nombre, int identificacion, double calificacion) {
        boolean noExiste = true;
        for (Estudiante estudiante : escuela) {
            if (estudiante.getNumeroIdentificacion() == (identificacion)) {
                noExiste = false;
            }
        }
        if (noExiste) {
            Estudiante estudiante = new Estudiante(nombre, identificacion, calificacion);
            escuela.add(estudiante);
            System.out.println("Estudiante agragado");
        }else{
            System.out.println("El estudiante ya existe");
        }

    }

    public boolean buscarEstudiante(int numeroIdentificacion) {
        boolean existe = false;
       for (Estudiante estudiante : escuela) {
           if (estudiante.getNumeroIdentificacion() == (numeroIdentificacion)) {
               existe = true;
               System.out.println("Se encontro el estudiante");
               System.out.println("El nombre del estudiante es : " + estudiante.getNombre());
               System.out.println("El numero de identificacion es : " +estudiante.getNumeroIdentificacion());
               System.out.println("La calificacion del estudiante es : " + estudiante.getCalificacion());
           }
       }
       if (!existe) {
           System.out.println("El estudiante no existe");
       }
       return existe;
    }

    public void actualizarEstudiante(int numeroIdentificacion, String nuevoNombre, double nuevaCalificacion) {
        for (Estudiante estudiante : escuela) {
            if (estudiante.getNumeroIdentificacion() == (numeroIdentificacion)) {
                estudiante.setNombre(nuevoNombre);
                estudiante.setCalificacion(nuevaCalificacion);
                System.out.println("El estudiante con la identificacion " + estudiante.getNumeroIdentificacion() + "se ha actualizado");
                System.out.println("El nombre del estudiante  ahora es : " + estudiante.getNombre());
                System.out.println("La calificacion del estudiante  ahora es : " + estudiante.getCalificacion());
            }
        }
    }

    public void eliminarEstudiante(int numeroIdentificacion) {
        boolean existe = false;
        for (Estudiante estudiante : escuela) {
            if (estudiante.getNumeroIdentificacion() == (numeroIdentificacion)) {
                existe = true;
                System.out.println("El estudiante con identificacion " + numeroIdentificacion + " ha sido eliminado");
                escuela.remove(estudiante);
                break;
            }
        }
        if (!existe) {
            System.out.println("El estudiante no existe");
        }
    }

}
