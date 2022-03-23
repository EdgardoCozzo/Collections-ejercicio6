/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package principal;

import entidades.Tienda;
import java.util.HashMap;
import java.util.Scanner;
import servicio.TiendaServicio;

/**
 *
 * @author Edgardo
 */
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaServicio serv = new TiendaServicio();
        HashMap<String, Double> listaTienda = new HashMap(); // Primero la llave y despues de los valores
        Tienda t1;
        String rta = "";
        
        do {
            t1 = serv.cargaProductos();
            listaTienda.put(t1.getProducto(), t1.getPrecio());

            System.out.println("Desea ingresar otro Producto a la Lista?");
            rta = leer.next();
        } while (rta.equalsIgnoreCase("S"));

        System.out.println("===================================");
        
        serv.mostrar(listaTienda);
        
        System.out.println("===================================");
        
        serv.modificaPrecio(listaTienda);
        
        System.out.println("===================================");
        
        serv.eliminarProducto(listaTienda);
    }
    
    

}
