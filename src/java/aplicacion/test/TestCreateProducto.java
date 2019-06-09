/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IProductoDAO;
import aplicacion.hibernate.dao.imp.ProductoDAOImp;
import aplicacion.modelo.domonio.Producto;

/**
 *
 * @author jack
 */
public class TestCreateProducto {
    public static void main(String[] args) {
        Producto primerproducto = new Producto();
        primerproducto.setProdOferta(Boolean.TRUE);
        primerproducto.setCodigo("1234");
        primerproducto.setDimension("20x24");
        primerproducto.setImagen("prod");
        primerproducto.setMarca("lego");
        primerproducto.setMaterial("plastico");
        primerproducto.setNombreProducto("bills");
        primerproducto.setOrigen("china");
        primerproducto.setSector("niños");
        IProductoDAO productoDAO = new ProductoDAOImp();
        productoDAO.agregarProducto(primerproducto);
    }
}
