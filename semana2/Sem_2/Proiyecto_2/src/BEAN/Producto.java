package BEAN;
public class Producto {
    private int idProducto;
    private String descripcion;
    private String tipo;
    private double precio;

    public Producto() {
    }

    public Producto(int idProducto, String descripcion, String tipo, double precio) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
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
}
