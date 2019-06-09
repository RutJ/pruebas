/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.controlador.beans.ProductoBean;
import aplicacion.modelo.domonio.Producto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jack
 */
@ManagedBean
@ViewScoped
public class ABMProductoFormBean implements Serializable {
    
    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productBean;
    private Producto producto;
    
    public ABMProductoFormBean() {
        producto = new Producto();
        productBean= new ProductoBean();
    }
    public void agregarProducto(){
        productBean.agregarProducto(producto);
    }
    public void modificarProducto(){
        productBean.modificarProducto(producto);
    }
    public void eliminarProducto(){
        productBean.eliminarProducto(producto);
    }
    /**
     * @return the productBean
     */
    public ProductoBean getProductBean() {
        return productBean;
    }

    /**
     * @param productBean the productBean to set
     */
    public void setProductBean(ProductoBean productBean) {
        this.productBean = productBean;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}
