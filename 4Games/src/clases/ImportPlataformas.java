/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Budha
 */
public class ImportPlataformas{
        
    public ImportPlataformas(){
        //leer();
    }
    
    public ArrayList <String> leer(){
        ArrayList <String> lista = new ArrayList();
        
        String stoken;
        try {
            FileReader fix = new FileReader ("src/plataformes.csv"); //ini fichero de lectura.
            BufferedReader br = new BufferedReader(fix); //buffer reader, leer de fichero. vuelca informacion al buffer. 
        
        while ((stoken=br.readLine())!=null){
            StringTokenizer st = new StringTokenizer (stoken , ";:");
            String plataforma = st.nextToken();
            //JOptionPane.showMessageDialog(null, "El contingut del fitxer es: plataforma: " + plataforma + ".");
            lista.add(plataforma);
        }
        
        br.close(); //cierro buffer
        fix.close(); //cierro fichero
        
        return lista;
        
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "error al lletgir de fitxer");
            return null;
        } //fi
        
    }

}