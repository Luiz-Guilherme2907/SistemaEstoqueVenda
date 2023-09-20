/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import Model.Vendas;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NEX
 */
public class VendasDAO {

    private final Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Vendas> listaEmp = new ArrayList<>();

    public VendasDAO(Connection connection) {
        this.connection = connection;
    }

    /* public static void main(String[] args) throws SQLException {
       Connection conexao = new Conexao().getConnection();
        VendasDAO emprestimosDAO = new VendasDAO(conexao);
        
        Vendas emprestimos = new Vendas(1, 1, LocalDateTime.now(), LocalDateTime.now());
        emprestimosDAO.insertBD(emprestimos);
        
    }*/
    //Inserir amigos no banco
    public void insertBD(Vendas vendas) throws SQLException {

        String sql = "INSERT INTO vendas (idProduto, valorProduto, dataVenda, quantidade) VALUES ('" + vendas.getIdProduto() + "', '" + vendas.getValorProduto() + "', '" + vendas.getDataVenda() + "', '" + vendas.getQuantidade() + "'); ";
        ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();
    }

    public ArrayList<Vendas> listarVendas() throws SQLException {

        String sql = "SELECT * FROM vendas";
        ArrayList<Vendas> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Date data = rs.getDate("dataVenda");

                Vendas vendas = new Vendas();
                vendas.setDataVenda(Util.Util.converterData(data));
                //emprestimos.setDataDevolvida(Util.Util.converterData(data2));
                vendas.setIdProduto(rs.getInt("idProduto"));
                vendas.setId(rs.getInt("id"));
                vendas.setQuantidade(rs.getInt("quantidade"));
                vendas.setValorProduto(rs.getBigDecimal("valorProduto"));
                lista.add(vendas);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendasDAO ListaEmp()" + erro);

        }
        connection.close();
        return lista;

    }

    public ArrayList<Vendas> listarVendasOrdenadoPeloIdDoProduto() throws SQLException {

        String sql = "SELECT * FROM vendas ORDER BY idProduto asc";
        ArrayList<Vendas> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Date data = rs.getDate("dataVenda");

                Vendas vendas = new Vendas();
                vendas.setDataVenda(Util.Util.converterData(data));
                //emprestimos.setDataDevolvida(Util.Util.converterData(data2));
                vendas.setIdProduto(rs.getInt("idProduto"));
                vendas.setId(rs.getInt("id"));
                vendas.setQuantidade(rs.getInt("quantidade"));
                vendas.setValorProduto(rs.getBigDecimal("valorProduto"));
                lista.add(vendas);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendasDAO ListaEmp()" + erro);

        }
        connection.close();
        return lista;

    }

    /* public ArrayList<Emprestimos> listarEmprestimosEmprestada() throws SQLException {
//Verificar sitax
        String sql = "SELECT * FROM emprestimos WHRERE estaEmprestada = ?";
        ArrayList<Emprestimos> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            ps.setBoolean(1, true);
            rs = ps.executeQuery();

            while (rs.next()) {
                Date data = rs.getDate("dataEmprestimo");

                Date data1 = rs.getDate("dataDevolucao");

                Vendas emprestimos = new Vendas();
                emprestimos.setDataDevolucao(Util.Util.converterData(data1));
                emprestimos.setDataEmprestimo(Util.Util.converterData(data));
                emprestimos.setId(rs.getInt("id"));
                emprestimos.setIdAmigos(rs.getInt("idAmigo"));
                emprestimos.setIdFerramentas(rs.getInt("idFerramenta"));

                lista.add(emprestimos);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VendasDAO ListaEmp()" + erro);

        }
        connection.close();
        return lista;

    }*/
 /* public void updateEmprestimos(int estaEmprestada, int id) {
        String sql = "UPDATE emprestimos SET estaEmprestada = ? WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);

            //add valores que deseja atualizar
            ps.setInt(1, estaEmprestada);
//Em testes!!!!{           
// ps.setDate(id, new Date());}
            //Qual o id do registro
            ps.setInt(2, id);

            //executar a query
            ps.execute();
            //fehcar conexao
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em update emprestimos" + ex);
        }

    }*/
    public Vendas buscarVenda(int id) throws SQLException {
        Vendas vendas = new Vendas();
        String sql = "SELECT * FROM vendas WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                vendas.setId(rs.getInt("id"));
                vendas.setIdProduto(rs.getInt("idProduto"));
                vendas.setQuantidade(rs.getInt("quantidade"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO BuscarEmprestimo()" + erro);

        }
        connection.close();
        return vendas;
    }

    public void deleteVendas(int id) {
        String sql = "DELETE FROM vendas WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            //Qual o id do registro
            ps.setInt(1, id);

            //executar a query
            ps.execute();
            //fehcar conexao
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void updateEstoque() {

    }

    public List<Vendas> relatorioVendas(LocalDate dataVenda) throws SQLException {

        String sql = "SELECT * FROM vendas WHERE dataVenda = ?";
        ArrayList<Vendas> lista = new ArrayList<>();
        try {
            ps = connection.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(dataVenda));
            rs = ps.executeQuery();

            while (rs.next()) {
                Date data = rs.getDate("dataVenda");
                Vendas vendas = new Vendas();
                vendas.setValorProduto(rs.getBigDecimal("valorProduto"));
                vendas.setDataVenda(Util.Util.converterData(data));
                vendas.setIdProduto(rs.getInt("idProduto"));
                lista.add(vendas);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO relatorioAmigos()" + erro);
        }
        return lista;
    }

}
