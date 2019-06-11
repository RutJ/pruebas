/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IProductoDAO;
import aplicacion.hibernate.dao.imp.ProductoDAOImp;
import aplicacion.modelo.dominio.Producto;

/**
 *
 * @author jack
 */
public class TestCreateProducto {
    public static void main(String[] args) {
        Producto primerproducto = new Producto();
        primerproducto.setCodigo("1234567");
        primerproducto.setDimension("20x24");
        primerproducto.setImagen("prod");
        primerproducto.setMarca("lego");
        primerproducto.setMaterial("plastico");
        primerproducto.setNombreProducto("bills");
        primerproducto.setOrigen("china");
        primerproducto.setSector("niños");
        primerproducto.setPrecio(Float.parseFloat("12.4"));
        primerproducto.setStock(Short.parseShort("12"));
       
        IProductoDAO productoDAO = new ProductoDAOImp();
        productoDAO.agregarProducto(primerproducto);
    }
}
