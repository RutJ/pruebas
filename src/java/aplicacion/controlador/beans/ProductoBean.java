/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans;

import aplicacion.hibernate.dao.IProductoDAO;
import aplicacion.hibernate.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;

/**
 *
 * @author jack
 */
public class ProductoBean implements Serializable{
    private IProductoDAO productoDAO;

    public ProductoBean() {
        productoDAO = new ProductoDAOImp();
    }
    
    public void agregarProducto(Producto nuevo){
        productoDAO.agregarProducto(nuevo);
    }
    /**
    public void modificarProducto(Producto borrado){
        productoDAO.modificarProducto(borrado);
    }
    
    public void eliminarProducto(Producto modificado){
       productoDAO.eliminarProducto(modificado);
    }
    
    
    /**
     * @return the productoDAO
     */
    public IProductoDAO getProductoDAO() {
        return productoDAO;
    }

    /**
     * @param productoDAO the productoDAO to set
     */
    public void setProductoDAO(IProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
    
    
    
}
