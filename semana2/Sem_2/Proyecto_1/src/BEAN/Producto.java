package BEAN;
public class Producto {
    private int idProducto;
    private String descripcion;
    private String tipo;
    private double precio;

    public Producto() {
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(int idProducto, String descripcion, String tipo, double precio) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    public String reportaDatos(){
        String aux;
        aux = "Id Producto: "+this.idProducto;
        aux += "\nDescripción: "+this.descripcion;
        aux += "\nTipo: "+this.tipo;
        aux += "\nPrecio: "+this.precio;
        return aux;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    
    
    
    
    
}
