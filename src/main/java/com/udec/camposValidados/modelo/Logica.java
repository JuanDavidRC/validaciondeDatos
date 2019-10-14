/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.camposValidados.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 *
 * @author JUAN DAVID REYES
 * @author ALEJANDRO TORRES
 */
public class Logica {
    /**
    * atributo mostrar que envia los datos a la vista
    */ 
   private String mostrar;
    /**
     * metodo que tiene la validacion de el nombre por codigo
     * @param nombre
     * @return 
     */
    public boolean nombre(String nombre){
        Pattern pattern = Pattern.compile("[A-Za-z]{2,}");
        Matcher mather = pattern.matcher(nombre);
        if (mather.find() == true) {
            this.setMostrar("correcto");
            return true;
        } else {
            this.setMostrar("Debe escribir un nombre correcto");
            return false;
        }
    }
    /**
     * metodo booleano que contiene la validacion de la edad
     * @param Edad
     * @return 
     */
    public boolean edad(String Edad) {
        if (Edad.length() < 18) {
            this.setMostrar("La edad mayor o igual a 18");
            return false;
        }
        if (Edad.length() >= 72) {
            this.setMostrar("La edad ser menor a 72");
            return false;
        }
        this.setMostrar("");
        return true;
    }
    /**
     * metodo booleano que tiene la validacion de el correo por codigo
     * @param Email
     * @return 
     */
    public boolean email(String Email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(Email);
        if (mather.find() == true) {
            this.setMostrar("");
            return true;
        } else {
            this.setMostrar("El correo no es correcto");
            return false;
        }
    }
   /**
    * metodo booleano que tiene la validacion 
    * de el telefono por codigo
    * @param telefono
    * @return 
    */
    public boolean telefono(String telefono) {
        Pattern pattern = Pattern.compile("[0-90-9]{10}");
        Matcher mather = pattern.matcher(telefono);
        if (mather.find() == true) {
            this.setMostrar("");
            return true;
        } else {
            this.setMostrar("El telefono no es correcto");
            return false;
        }
    }
    /**
     * metodo booleno que valida la fecha en el formato especificado
     * @param fecha
     * @return 
     */
    public boolean fecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            this.setMostrar("Fecha no valida");
            return false;
        }
        this.setMostrar("");
        return true;
    }
    /**
     * metodo que valida la moneda por medio de el dimbolo pesos
     * @param moneda
     * @return 
     */
    public boolean moneda(String moneda){
        if(moneda.charAt(0)!= '$'){
            this.setMostrar("Formato de moneda no valido");
            return false;
        }
        this.setMostrar("");
        return true;
    }
    /**
     * metodo get que retorna el mostrar 
     * @return 
     */
    public String getMostrar() {
        return mostrar;
    }
    /**
     * metodo set que tiene el parametro 
     * mostrar
     * @param mostrar 
     */
    public void setMostrar(String mostrar) {
        this.mostrar = mostrar;
    }
}
