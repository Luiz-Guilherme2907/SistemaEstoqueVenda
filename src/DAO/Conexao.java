/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Guilherme
 */
public class Conexao {

    public Connection getConnection() {
        Connection conn = null;
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbquiosque", "root", "1234");
            System.out.println("Conexão bem-sucedida!");

        } catch (SQLException ex) {
            System.out.println("Erro ao conectar ao banco de dados: " + ex.getMessage());

        }

        return conn;
    }
}
