# INTORDUCCION A FORMULARIOS
- Buenas practicas nombrar de manera intuitiva los tipos de contenedores,ejemplo :
  - [tipo de contendor][nombre descriptivo]
  - txtNombre (haces referencia a un txt que contiene la varibale nombre)
- Antes de hacer la logica tenemos que crear la clase que vamos hacer referencia
```java
    public class Producto{
        private int producto;
        private String descipcion;
        private String tipo;
        private double precio;
        //apartir de esto pudes crear los constructtores ,metodo set,y get de manera mas eficiente con el ID  que estes usando
        
    }

```
- NO TE OLVIDES CREAR LOS METODOS(FUNCIONES) QUE VAS A NECESITAR COMO EJEMPLO reportar Datos
```java
    
    public String reportaDatos(){
        String aux;
        aux = "Id Producto: "+this.idProducto;
        aux += "\nDescripción: "+this.descripcion;
        aux += "\nTipo: "+this.tipo;
        aux += "\nPrecio: "+this.precio;
        return aux;
    }
```
- Agregar Datos ?
  - el metodo Integer.parseInt() convierte los valores a int
  - el metodo Double.paseDouble() convirte los valores a double
- como se adsede al contenido de un txt?
    - se usa el metos .getText()
 - Como se adsede al como se adcesede al contenido de un cmd ?
    - se usa el metodo .getSelecdItem().toString()
 - Como usar agredar datos a  un vector en string?
    -   vector.addElemt(prod);

```java 
    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {                                          
            Producto prod;
            prod = new Producto();
            prod.setIdProducto(Integer.parseInt(this.txtIdProducto.getText()));//covertiendo a entero un txt
            prod.setDescripcion(this.txtDescripcion.getText());
            prod.setTipo(this.cmbTipo.getSelectedItem().toString());
            prod.setPrecio(Double.parseDouble(this.txtPrecio.getText()));
            
            vecProd.addElement(prod);
            limpia();
    }    
```

- Como limpiar datos ?
- Como Reportar datos ?
