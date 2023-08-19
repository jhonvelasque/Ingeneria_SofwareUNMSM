package PRUEBA;

import BEAN.Alumno;

public class Test {
    public static void main(String args[]){
        int a;
        Alumno alJose;
        alJose = new Alumno();
        alJose.reportaDatos();
        System.out.println("==========================");
        
        Alumno alPedro;
        alPedro = new Alumno(101, "Vasquez el bravo");
        alPedro.reportaDatos();
        System.out.println("==========================");
        alPedro.asigNombre("Juan");
        alPedro.reportaDatos();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Solo el nombre "+alPedro.devNombre());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        alJose.asigIdAlumno(102);
        alJose.asigApell("Ramirez");
        alJose.asigNombre("Julio");
        alJose.asigEdad(18);
        alJose.reportaDatos();
        
        
        
        
        
        
        
    }
    
}
