package PRUEBA;

import BEAN.Producto;

public class Test {
    public static void main(String args[]){
        Producto prod1;
        prod1 = new Producto();
        prod1.setIdProducto(101);
        prod1.setDescripcion("Impresora Epson");
        prod1.setTipo("Cómputo");
        prod1.setPrecio(1200.55);
        System.out.println(prod1.reportaDatos());
        System.out.println("================================================");
        Producto prod2;
        prod2 = new Producto(102, "Laptop HP", "Cómputo", 1250.5);
        System.out.println("Id Producto: "+prod2.getIdProducto());
        System.out.println("Descripcion: "+prod2.getDescripcion());
        System.out.println("Tipo: "+prod2.getTipo());
        System.out.println("Precio: "+prod2.getPrecio());
    }
    
}
