/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.modelobd;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 *
 * @author mamaz
 */
public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "123456";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoas";
    
    
    public Connection obtemConexao() {
        try {
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + bd,
                    usuario,
                    senha
            );
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
    
}
