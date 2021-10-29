/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetointegrador.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author acer
 */
public class ConnectionFactory {
    public static Connection getConnection(){
       final String url = "jdbc:mysql://localhost:3306/nextlevel?verifyServerCertificate=false&useSSL=true";
       final String user = "Alencardev";
       final String password = "2021";
       
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
           //Lançar um erro na tela do usuario quando o programa executa.
            throw new RuntimeException(e);
        }
    }
}
