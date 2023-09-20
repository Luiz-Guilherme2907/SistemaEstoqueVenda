package DAO;

import Model.*;
import View.TelaPrincipal;
import java.math.BigDecimal;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    //executar a conexao
    private final Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Produtos> lista = new ArrayList<>();

    public ProdutoDAO(Connection conection) {
        this.connection = conection;
    }

    //Inserir Ferramenta no Banco de dados (Create) 
    public void insertBD(Produtos produtos) throws SQLException {
        String sql = "INSERT INTO produtos (nome, marca, preco, estaEmprestada, quantidade) VALUES ('" + produtos.getNome() + "', '" + produtos.getMarca() + "', '" + produtos.getPreco() + "', '" + produtos.getEstaEmprestada() + "', '" + produtos.getQuantidade() + "') ";
        ps = connection.prepareStatement(sql);
        ps.execute();
        connection.close();
    }

    //Atualizar Ferramenta Banco de dados (Upadate)
    public void UpdateProdutos(Produtos produtos, int id) {
        String sql = "UPDATE produtos SET nome = ?, marca = ?, preco = ?, quantidade = ? " + "WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);

            //add valores que deseja atualizar
            ps.setString(1, produtos.getNome());
            ps.setString(2, produtos.getMarca());
            ps.setBigDecimal(3, produtos.getPreco());
            ps.setInt(4, produtos.getQuantidade());
            //Qual o id do registro
            ps.setInt(5, id);

            //executar a query
            ps.execute();

            //fechar conexao
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void UpdateQuantidade(int quantidade, int id) {
        String sql = "UPDATE produtos SET quantidade = ? " + "WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            //add valores que deseja atualizar
            ;
            ps.setInt(1, quantidade);
            //Qual o id do registro
            ps.setInt(2, id);

            //executar a query
            ps.execute();

            //fechar conexao
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Add uma Ferramenta dentro de uma lista 
    public ArrayList<Produtos> listarProdutos() throws SQLException {

        String sql = "SELECT * FROM produtos";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Produtos produtos = new Produtos();
                produtos.setNome(rs.getString("nome"));
                produtos.setMarca(rs.getString("marca"));
                produtos.setValor(rs.getBigDecimal("preco"));
                produtos.setQuantidade(rs.getInt("quantidade"));
                produtos.setId(rs.getInt("id"));
                //produtos.setEstaEmprestada(rs.getInt("estaEmprestada"));

                lista.add(produtos);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro em listar produtos" + erro);

        }
        connection.close();
        return lista;

    }

     public ArrayList<Produtos> listarProdutosOrdenadoPeloId() throws SQLException {

        String sql = "SELECT * FROM produtos order by id asc";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Produtos produtos = new Produtos();
                produtos.setNome(rs.getString("nome"));
                produtos.setMarca(rs.getString("marca"));
                produtos.setValor(rs.getBigDecimal("preco"));
                produtos.setQuantidade(rs.getInt("quantidade"));
                produtos.setId(rs.getInt("id"));
                //produtos.setEstaEmprestada(rs.getInt("estaEmprestada"));

                lista.add(produtos);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro em listar produtos" + erro);

        }
        connection.close();
        return lista;

    }
    
    
    public ArrayList<Produtos> listarProdutosNaoEmprestados() throws SQLException {

        String sql = "SELECT * FROM produtos WHERE estaEmprestada = 1";

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Produtos produtos = new Produtos();
                produtos.setNome(rs.getString("nome"));
                produtos.setMarca(rs.getString("marca"));
                produtos.setValor(rs.getBigDecimal("preco"));
                produtos.setId(rs.getInt("id"));
                produtos.setEstaEmprestada(rs.getInt("estaEmprestada"));
                lista.add(produtos);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "listarProdutosNaoEmprestados()" + erro);

        }
        connection.close();
        return lista;

    }

    //Deleta uma ferramenta
    public void deleteProdutos(int id) {
        String sql = "DELETE FROM produtos WHERE id = ?";
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

    public Produtos buscarProdutos(int id) throws SQLException {

        Produtos produtos = new Produtos();
        String sql = "SELECT * FROM produtos WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                produtos.setId(rs.getInt("id"));
                produtos.setQuantidade(rs.getInt("quantidade"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO BuscarEmprestimo()" + erro);

        }
        connection.close();
        return produtos;

        /*   Produtos ferramentas = new Produtos();
        String sql = "SELECT * FROM produtos WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            ferramentas.setId(rs.getInt(id));
            ferramentas.setQuantidade(rs.getInt("quantidade"));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO buscarProduto" + erro);

        }
        connection.close();
        return ferramentas;*/
    }

    /*public void updateStatus(int estaEmprestada, int id) {
        String sql = "UPDATE produtos SET estaEmprestada = ? " + "WHERE id = ?";
        try {
            ps = connection.prepareStatement(sql);

            //add valores que deseja atualizar
            ps.setInt(1, estaEmprestada);

            //Qual o id do registro
            ps.setInt(2, id);

            //executar a query
            ps.execute();

            //fechar conexao
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }*/
    public BigDecimal getValor() throws SQLException {

        String sql = "SELECT SUM(CAST(preco AS DECIMAL(10,2))) AS total FROM produtos";
        BigDecimal value = null;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                value = rs.getBigDecimal("total");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro em listar produtos" + erro);
            erro.printStackTrace();

        }
        connection.close();
        return value;

    }

} //Fim classe
