/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Budha
 */
public class Conexio {
    public String bd="Juegos"; //nombre de la base de datos
    public String login="root"; //usuario
    public String password=""; //contraseña
    public String url="jdbc:mysql://localhost/"+bd;

    public Connection conectar(){
        Connection link=null;    
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            link=DriverManager.getConnection(this.url,this.login,this.password);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     return link;
    }
}
