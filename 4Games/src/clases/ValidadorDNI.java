/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author Myk
 */
public class ValidadorDNI {
    
    //Atributos
    
    /**Variable que contiene las letras que corresponde a cada número de DNI.*/
    private final String letra="TRWAGMYFPDXBNJZSQVHLCKE";
    
    //Constructor
    public ValidadorDNI(){}
    
    
    /**
     * Método que comprueba que la longitud del nif sea igual a 9, ni mayor ni
     * menor.
     * @param nif
     * @return 
     */
    public boolean comprobarLongitud(String nif){
        
        //Variables
        boolean comprobado=false;
        
        //Proceso
        if(nif.length()==9){
            
            comprobado=true;
        }
        
        return comprobado;
    }
    
    /**
     * Divide el dni introducido por parámetro entre 23, coge su módulo y busca
     * esa posición en el String letra para obtener la letra.
     */
    private char calcularLetraNIF (int dni){
        
        //Variables
        int num;
        
        //Proceso
        num=dni%23;
        return letra.charAt(num);
    }
    
    /**
     * Compara la letra que calcula calcularLetraNIF con la letra que extrae 
     * de la cadena de carácteres que ha introducido el usuario, y dice si 
     * coincide (true) o si por el contrario son diferentes (false).
     * @param nif
     * @return 
     */
    public boolean validarNIF (String nif){
        
        //Variables
        boolean loEs=false;        
        
        //Proceso
        if(calcularLetraNIF(extraerNumeroNIF(nif))==extraerLetraNIF(nif)){
            loEs=true;
        }
        return loEs;
    }
    
    /**
     * Ya que el NIF tiene un formato fijo, este método simplemente devuelve el
     * carácter que hay en la posición que coincide con la letra en el NIF.
     */
    private char extraerLetraNIF (String nif){
        return nif.charAt(8);
    }
    
    /**
     * De un NIF introducido por el usuario, extrae solamente los 8 primeros
     * carácteres, que tocan ser dígitos, lo guarda en una variable String y
     * lo transforma a entero, que devuelve este a donde ha sido llamado.
     */
    private int extraerNumeroNIF (String nif){
        
        //Variables
        String dni;
        
        //Proceso
        dni=nif.substring(0, 8);
        return Integer.parseInt(dni);
    }
    
    
    /**
     * Admito que cogí este método de internet, se nota de lejos, pero me gustó
     * como se las ingenia para con try-catch obtener un resultado así, y creo
     * que tendré en cuenta este tipo de "idea" para un futuro.
     * @param sms
     * @return 
     */
    public boolean esNumero(String sms){
	
        try{
            Integer.parseInt(sms);
            return true;
	} 
        catch (NumberFormatException maaaaaaaaal){
            return false;
	}
    }
}
