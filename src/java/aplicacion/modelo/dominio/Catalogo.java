/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jack
 */
public class Catalogo implements Serializable{
    private String sector;
    private Set<Producto> listaProductos;

    public Catalogo() {
        listaProductos = new HashSet<>();
    }

    /**
     * @return the listaProductos
     */
    public Set<Producto> getListaProductos() {
        return listaProductos;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(Set<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
}
