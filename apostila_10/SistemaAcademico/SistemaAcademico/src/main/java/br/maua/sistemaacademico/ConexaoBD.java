/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.sistemaacademico;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mamaz
 */
public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "sistema_academico";
    private static String usuario = "root";
    private static String senha = "123456";
    
    
    public static Connection obterConexao() throws Exception {
        String url = String.format(
            "jdbc:mysql://%s:%s/%s",
                host,
                porta,
                db
        );
        return DriverManager.getConnection(url,usuario,senha);
    }
    
    
    
    
}
