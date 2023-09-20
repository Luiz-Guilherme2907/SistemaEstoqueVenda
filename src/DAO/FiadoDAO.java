/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Fiado;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author GUI
 */
public class FiadoDAO {

    private final Connection connection;
    PreparedStatement ps;
    ResultSet rs;

    public FiadoDAO(Connection connection) {
        this.connection = connection;
    }

    public void insertBD(Fiado fiado) throws SQLException {
        String sql = "INSERT INTO fiado (nomeCliente, idProduto, dataVendaFiado, quantidade) VALUES ('" + fiado.getNomeCliente() + "', '" + fiado.getIdProduto() + "','"+ fiado.getDataVendaFiado() +"' ,'"+ fiado.getQuantidade() +"'); ";
        ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();
    }

    public ArrayList<Fiado> listarFiado() throws SQLException {

        String sql = "SELECT * FROM fiado";
        ArrayList<Fiado> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Date data = rs.getDate("dataVendaFiado");

                Fiado fiado = new Fiado();
                fiado.setDataVendaFiado(Util.Util.converterData(data));
                //emprestimos.setDataDevolvida(Util.Util.converterData(data2));
                fiado.setIdProduto(rs.getInt("idProduto"));
                fiado.setNomeCliente(rs.getString("nomeCliente"));
                fiado.setId(rs.getInt("id"));
                fiado.setQuantidade(rs.getInt("quantidade"));
                lista.add(fiado);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FiadoDAO ListarFiado()" + erro);

        }
        connection.close();
        return lista;

    }

    
    public void deleteFiado(int id) {
        String sql = "DELETE FROM fiado WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            //Qual o id do registro
            ps.setInt(1, id);

            //executar a query
            ps.execute();
            //fehcar conexao
            connection.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro em deletar Fiado" + ex);

        }

    }
    
    
}
