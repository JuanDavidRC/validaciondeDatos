/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.camposValidados.controlador;


import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import javax.faces.view.ViewScoped;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author JUAN DAVID REYES
 * @author ALEJNDRO TORRES
 */
@Named(value = "vista")
@ViewScoped
public class Vista implements Serializable{
    /**
     * anotacion para validar campos vacios
     */
    @NotNull(message = "Diligencie el campo")
   /**
    * anotacion para validar nombre y letras
    */
    @Size(min = 3, max = 15)
    /**
     * anotacion para que los valores de el nombreno se exedan
     */
    @Pattern(regexp="[A-Za-z]{2,}",message = "Ingrese nombre valido")
    /**
     * atributo nombre a validar
     */
    private String nombre;
    /**
     * anotacion para validar el correo y sus caracteres
     */
    @Pattern(regexp ="[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{1,5}" , message = "Ingrese un correo correcto")
   /**
    * atributo correo  a validar
    */
    private String correo;
    /**
     * anotacion para validar fecha
     * 
     */
     @NotNull(message = "Diligencie el campo")
     /**
      * anotacion para validar compo vacio
      */
    @Past(message = "Ingrese una fecha pasada valida")
    /**
     * atributo fecha a validar
     */
    private Date fecha;
    /**
     * anotacion para validar los limetes de edad
     */
    @NotNull @Min(18) @Max(72) 
    /**
     * atributo edad a validar
     */
    private String edad;
    /**
     * anotacion para la validacion de el telefono y diez digitos
     */
    @Pattern(regexp ="[0-90-9]{10}" , message = "Ingrese un telefono valido")
    /**
     * atributo telefono a validar
     */
    private String telefono;
    /**
     * anotacion para validar el tipo de moneda
     */
    @DecimalMin(value = "10.00", message = "Escriba la cantidad correcta")
    /**
     * anotacion para validar la moneda
     */
    @DecimalMax(value = "100000.00", message = "Escriba la cantidad correcta")
    /**
     * atributo moneda a validar
     */
    private double moneda;
    
   
    /**
     * Construcutor vacio de la clase
     */
    public Vista() {
    }
    /**
     * metodo get que retorna el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo set con el parametro edad
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo get que retorna el correo
     * @return 
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * metodo con el parametro correo
     * @param correo 
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * metodo que retorna la fecha a validar
     * @return 
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * metodo con el parametro fecha
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        
        this.fecha = fecha;
    }
    /**
     * metodo que retorna la fecha a validar
     * @return 
     */
    public String getEdad() {
        return edad;
    }
    /**
     * metodo con el paraemtro edad 
     * @param edad 
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }
    /**
     * metodo con el escuchador enviar
     * @return 
     */
    public String enviar(){
         return "Correcto";
    }
    /**
     * metodo que retorna la edad a validar
     * @return 
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * metodo con el parametro telefo 
     * @param telefono 
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * metodo que retorna la moneda a validar
     * @return 
     */
    public double getMoneda() {
        return moneda;
    }
    /**
     * metodo con el parametro moneda 
     * @param moneda 
     */
    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }
    
    
    
}
