package BEAN;
public class Alumno {
    private int idAlumno;
    private String apell;
    private String nomb;
    private int edad;
    
    public Alumno(){
    }
    
    public Alumno(int i, String a){
        this.idAlumno = i;
        this.apell = a;
    }
    
    public int calcula(){
        return 10;
    }
    
    public void asigNombre(String n){
        this.nomb = n;
    }
    
    public void asigIdAlumno(int i){
        this.idAlumno = i;
    }
    public void asigApell(String a){
        this.apell = a;
    }
    public void asigEdad(int e){
        this.edad = e;
    }
    
    
    public String devNombre(){
        return this.nomb;
    }
    
    
    
    public void reportaDatos(){
        String aux;
        aux = "Id Alumno: "+this.idAlumno;
        aux += "\nApellidos: "+this.apell;
        aux += "\nNombres: "+this.nomb;
        aux += "\nedad: "+this.edad;
        System.out.println(aux);
    }
    
    
    
}
