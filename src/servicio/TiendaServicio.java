/*
 * {}To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class TiendaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Tienda cargaProductos() {

        Tienda t = new Tienda();
        System.out.print("Ingrese un Producto a la Lista = ");
        t.setProducto(leer.next());
        System.out.print("Ingrese su valor = $ ");
        t.setPrecio(leer.nextDouble());

        return t;
    }

    public void mostrar(HashMap<String, Double> listaTienda) {

        for (Map.Entry<String, Double> mos : listaTienda.entrySet()) {
            System.out.println(mos.getKey() + "    $" + mos.getValue());

        }
    }

    public void modificaPrecio(HashMap<String, Double> listaTienda) {

        System.out.print("Ingrese el producto a modificar si precio= ");
        String producto = leer.next();
        System.out.println("Ingrese el valor a modificar = ");
        Double valor = leer.nextDouble();
        listaTienda.replace(producto, valor);

        for (Map.Entry<String, Double> entry : listaTienda.entrySet()) {

            System.out.println(entry.getKey() + "    $" + entry.getValue());

        }

    }

    public void eliminarProducto(HashMap<String, Double> listaTienda) {

        System.out.println("Ingrese el producto a quitar de la Lista..");
        String producto = leer.next();

        listaTienda.remove(producto);

        System.out.println("********Lista Final********");
        for (Map.Entry<String, Double> entry : listaTienda.entrySet()) {

            System.out.println(entry.getKey() + "    $" + entry.getValue());

        }

    }
}
