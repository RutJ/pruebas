/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jack
 */
public class ProductoOferta {
    private Integer codigoOferta;
    private Date fechaInicio;
    private Date fechaFinal;
    private Set<Producto> listaProdOferta;
    private Short descuento;

    public ProductoOferta() {
        listaProdOferta = new HashSet<>();
        fechaInicio = new Date();
        fechaFinal = new Date();
    }

    
    /**
     * @return the listaProdOferta
     */
    public Set<Producto> getListaProdOferta() {
        return listaProdOferta;
    }

    /**
     * @param listaProdOferta the listaProdOferta to set
     */
    public void setListaProdOferta(Set<Producto> listaProdOferta) {
        this.listaProdOferta = listaProdOferta;
    } 

    /**
     * @return the codigoOferta
     */
    public Integer getCodigoOferta() {
        return codigoOferta;
    }

    /**
     * @param codigoOferta the codigoOferta to set
     */
    public void setCodigoOferta(Integer codigoOferta) {
        this.codigoOferta = codigoOferta;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFinal
     */
    public Date getFechaFinal() {
        return fechaFinal;
    }

    /**
     * @param fechaFinal the fechaFinal to set
     */
    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * @return the descuento
     */
    public Short getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(Short descuento) {
        this.descuento = descuento;
    }
    
    
}
