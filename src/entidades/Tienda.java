/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Edgardo
 */
public class Tienda implements Comparable<Tienda> {
    
    private String producto;
    private Double precio;

    public Tienda() {
    }

    public Tienda(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto=" + producto + ", precio=" + precio + '}';
    }

    @Override
    public int compareTo(Tienda t) {
     
        return this.producto.compareToIgnoreCase(t.getProducto());
    }

    
    
    
    
}
