/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.Conexao;
import DAO.ProdutoDAO;
import Model.Produtos;
import View.RegistroProdutos;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author NEX
 */
public class RegistroProdutosController {

    private RegistroProdutos view;

    public RegistroProdutosController(RegistroProdutos view) {
        this.view = view;
    }

    public void registrarProduto() {
        String valor = view.getjFormattedTextField1().getText();
        String nome = view.getTxtnomeFerramenta().getText();
        String marca = view.getTxtMarca().getText();
        BigDecimal valor1 = Util.Util.converteValue(valor);
        int quantidade = Integer.parseInt(view.getTxtQuantidade().getText());
        Produtos produtos = new Produtos(nome, marca, valor1, quantidade);

        if (view.getTxtnomeFerramenta().getText().equals("") || view.getTxtMarca().getText().equals("") || view.getjFormattedTextField1().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe todos os dados para efetuar o cadastro!");
        } else {
            try {
                Connection conexao = new Conexao().getConnection();
                ProdutoDAO ferramentaDAO = new ProdutoDAO(conexao);
                ferramentaDAO.insertBD(produtos);
                JOptionPane.showMessageDialog(null, "PRODUTO CADASTRADO COM SUCESSO!");
                view.getTxtnomeFerramenta().setText("");
                view.getTxtMarca().setText("");
                view.getjFormattedTextField1().setText("");
                view.getTxtQuantidade().setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto" + ex);
            }
        }

    }

    public void updateProduto() {

        if (view.getTxtnomeFerramenta().getText().equals("") || view.getTxtMarca().getText().equals("") || view.getjFormattedTextField1().getText().equals("") || view.getTxtQuantidade().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe todos os dados para alterar um Produto!");
        } else {
            int id = Integer.parseInt(view.getTxtId().getText());
            String nome = view.getTxtnomeFerramenta().getText();
            String marca = view.getTxtMarca().getText();
            String preco = view.getjFormattedTextField1().getText();
            BigDecimal preco1 = Util.Util.converteValue(preco);
            int quantidade = Integer.parseInt(view.getTxtQuantidade().getText());
            Produtos produtos = new Produtos(nome, marca, preco1, quantidade);
            Connection conexao = new Conexao().getConnection();
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
            produtoDAO.UpdateProdutos(produtos, id);
            JOptionPane.showMessageDialog(null, "PRODUTO ALTERADO COM SUCESSO!");
            view.getTxtnomeFerramenta().setText("");
            view.getTxtMarca().setText("");
            view.getjFormattedTextField1().setText("");
        }
    }
    
      public void deleteProduto() {
        int id = Integer.parseInt(view.getTxtId().getText());
        Produtos produtos = new Produtos();
        Connection conexao = new Conexao().getConnection();
        ProdutoDAO ferramentaDAO = new ProdutoDAO(conexao);
        ferramentaDAO.deleteProdutos(id);
    }
      
      
 
}
