/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Clientes;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ClientesDAO {

    //executar a conexao
    private final Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Clientes> lista = new ArrayList<>();

    public ClientesDAO(Connection conection) {
        this.connection = conection;
    }

    //Inserir clientes no banco
    public void insertBD(Clientes clientes) throws SQLException {

        String sql = "INSERT INTO clientes (nome,telefone) VALUES ('" + clientes.getNome() + "','" + clientes.getTelefone() + "'); ";
        ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();
    }

    public void UpdateAmigos(Clientes clientes, int id) {
        String sql = "UPDATE clientes SET nome = ?, telefone = ? " + "WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);

            //add valores que deseja atualizar
            ps.setString(1, clientes.getNome());
            ps.setString(2, clientes.getTelefone());

            //Qual o id do registro
            ps.setInt(3, id);

            //executar a query
            ps.execute();
            //fehcar conexao
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Add clientes dentro de uma lista 
    public ArrayList<Clientes> listarClientes() throws SQLException {

        String sql = "SELECT * FROM clientes";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Clientes clientes = new Clientes();
                clientes.setNome(rs.getString("nome"));
                clientes.setTelefone(rs.getString("telefone"));
                clientes.setId(rs.getInt("id"));

                lista.add(clientes);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Listar Clientes" + erro);

        }
        connection.close();
        return lista;

    }

    public void deleteClientes(int id) {
        String sql = "DELETE FROM clientes WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            //Qual o id do registro
            ps.setInt(1, id);

            //executar a query
            ps.execute();
            //fehcar conexao
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public Clientes buscarClientes(int id) throws SQLException {
        Clientes clientes = new Clientes();
        String sql = "SELECT * FROM clientes WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            clientes.setNome(rs.getString("nome"));



        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "BuscarClientes()" + erro);

        }
        connection.close();
        return clientes;
    }

}
