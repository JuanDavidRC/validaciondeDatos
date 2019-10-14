/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.camposValidados.controlador;

import com.udec.camposValidados.modelo.Logica;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 * @author JUAN DAVID REYES
 * @author ALEJNDRO TORRES
 */
@Named(value = "vista")
@SessionScoped
public class Vista implements Serializable {
    /**
     * atributo nombre de la persona a validar
     */
    private String nombreV;
    /**
     * atrubuto edad de la paersona a validar
     */
    private String edadV;
    /**
     * atributo de el correo de la persona a validar
     */
    private String emailV;
    /**
     * atributo de telefono de la persona a validar
     */
    private String telefonoV;
    /**
     * atributo fecha de la persona a validar
     */
    private String fechaV;
    /**
     * atriburo moda de el sueldo a validar
     */
    private String monedaV;
    /**
     * atributo  boton de revision de los datos
     */
    
    Logica logica = new Logica();
    
    /**
     * constructor vacio de la clase
     */
    public Vista() {
    }
    /**
     * metodo de la validacion nombre que se envia a la vista
     */
    public void vNombre(){
        logica.nombre(nombreV);
        setNombreV(logica.getMostrar());
    }
    /**
     * metodo de la validacion edad que se envia a la vista
     */
    public void vEdad(){
        logica.nombre(edadV);
        setEdadV(logica.getMostrar());
    }
    /**
     * metodo de la validacion corro que se envia a la vista
     */
    public void vEmail(){
        
        logica.email(emailV);
        setEmailV(logica.getMostrar());
    }
    /**
     * metodo de la validacion telefono que se envia ala vista 
     */
    public void vTelefono(){
        logica.telefono(telefonoV);
        setTelefonoV(logica.getMostrar());
    }
    /**
     * metodo de la validacion fecha que se envia ala vista
     */
    public void vFecha(){
        logica.fecha(fechaV);
        setFechaV(logica.getMostrar());
    }
    /**
     * metodo validacion moneda que se envia a la vista
     */
    public void vMoneda(){
        logica.setMostrar(monedaV);
        logica.moneda(monedaV);
        setMonedaV(logica.getMostrar());
    }
    /**
     * metodo get retorna el nombre
     * @return 
     */
    public String getNombreV() {
        return nombreV;
    }
    /**
     * metodo set con el parametro nombre
     * @param nombreV 
     */
    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }
    /**
     * metodo get que retorna la edad
     * @return 
     */
    public String getEdadV() {
        return edadV;
    }
    /**
     * metodo set con el parametro edad
     * @param edadV 
     */
    public void setEdadV(String edadV) {
        this.edadV = edadV;
    }
    /**
     * metodo get que retorna e email de la persona
     * @return 
     */
    public String getEmailV() {
        return emailV;
    }
    /**
     * metodo set con el prametro email
     * @param emailV 
     */
    public void setEmailV(String emailV) {
        this.emailV = emailV;
    }
    /**
     * metodo set que retorna el correo
     * @return 
     */
    public String getTelefonoV() {
        return telefonoV;
    }
    /**
     * metodo get con el parametro de telefono de la persona
     * @param telefonoV 
     */
    public void setTelefonoV(String telefonoV) {
        this.telefonoV = telefonoV;
    }
    /**
     * metodo get que retona la fecha de la persona
     * @return 
     */
    public String getFechaV() {
        return fechaV;
    }
    /**
     * metodo set con el paramero fecha
     * @param fechaV 
     */
    public void setFechaV(String fechaV) {
        this.fechaV = fechaV;
    }
    /**
     * metodo get que retorna la moneda ingresada
     * @return 
     */
    public String getMonedaV() {
        return monedaV;
    }
    /**
     * metodo set con e parametro moneda
     * @param monedaV 
     */
    public void setMonedaV(String monedaV) {
        this.monedaV = monedaV;
    }
    /**
     * metodo get que 
     * @return 
     */
   
    
    
}
