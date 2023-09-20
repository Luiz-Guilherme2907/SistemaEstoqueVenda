/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.Conexao;
import DAO.VendasDAO;
import DAO.ProdutoDAO;
import Model.Vendas;
import View.DeletarVenda;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author GUI
 */
public class VendaController {

    private DeletarVenda view;

    public VendaController(DeletarVenda view) {
        this.view = view;
    }

    public void deleteVenda() {
        try {
            int id = Integer.parseInt(view.getTxtId().getText());
            Connection conexao = new Conexao().getConnection();
            VendasDAO vendasDAO = new VendasDAO(conexao);

            Vendas vendas = vendasDAO.buscarVenda(id);
            if(vendas == null){
                throw new NullPointerException("vendas não existe na base");
            
            } 
           Connection conexao1 = new Conexao().getConnection();
           VendasDAO vendasDAO1 = new VendasDAO(conexao1);
           vendasDAO1.deleteVendas(id);
            Connection conexao2 = new Conexao().getConnection();
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao2);
            produtoDAO.UpdateQuantidade(vendas.getQuantidade(), vendas.getIdProduto());
            
            JOptionPane.showMessageDialog(null, "Venda deletada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro deletar Venda " + e);
        }
    }

}
