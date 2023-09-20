/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import DAO.ProdutoDAO;
import DAO.VendasDAO;
import DTO.VendasDTO;
import Model.Clientes;
import Model.Produtos;
import Model.Vendas;
import View.RelatorioDetalhado;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import View.TelaPrincipal;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Guilherme
 */
public class ListaClientesProdutosController {

    private TelaPrincipal view;

    public ListaClientesProdutosController(TelaPrincipal view) {
        this.view = view;
    }

    public void listarClientes() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao = new Conexao().getConnection();
            ClientesDAO clientesDAO = new ClientesDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTable_clientes().getModel();
            model.setNumRows(0);

            ArrayList<Clientes> lista = clientesDAO.listarClientes();

            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getTelefone(),});

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Clientes" + erro);

        }

    }

    public void listarProdutos() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao = new Conexao().getConnection();
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTable_produtos().getModel();
            model.setNumRows(0);

            ArrayList<Produtos> lista = produtoDAO.listarProdutos();

            for (int i = 0; i < lista.size(); i++) {
                //BigDecimal value = new BigDecimal(lista.get(i).getPreco());
                model.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNome(),
                    lista.get(i).getMarca(),
                    lista.get(i).getPreco(),
                    lista.get(i).getQuantidade(),});
                //Util.Util.converterPreco(value)
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Produtos" + erro);

        }
        listarSomatoria();
    }

    public void listarVendas() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao1 = new Conexao().getConnection();
            ProdutoDAO produtosDAO = new ProdutoDAO(conexao1);

            ArrayList<Produtos> listaProduto = produtosDAO.listarProdutos();

            Connection conexao = new Conexao().getConnection();
            VendasDAO emprestimodao = new VendasDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTableVendas().getModel();
            model.setNumRows(0);

            ArrayList<VendasDTO> lista = new ArrayList<>();
            ArrayList<Vendas> listaBD = emprestimodao.listarVendas();

            for (Vendas vendas : listaBD) {

                Produtos produtos = buscarFerramentas(vendas.getIdProduto(), listaProduto);
                if (produtos != null) {
                    VendasDTO vendasDTO = new VendasDTO(vendas.getId(), produtos.getNome(), vendas.getValorProduto(), Util.Util.converterData(vendas.getDataVenda()), vendas.getQuantidade());
                    model.addRow(new Object[]{
                        vendasDTO.getId(),
                        vendasDTO.getProdutos(),
                        Util.Util.converterValorBigDecimalparaValorMonetario(vendasDTO.getValor()),
                        vendasDTO.getQuantidade(),
                        vendasDTO.getDataVenda(),});
                }

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Ferramentas" + erro);

        }

    }

    private Clientes busqueAmigo(int id, ArrayList<Clientes> listaAmigos) {
        Clientes amigos = null;
        for (Clientes amigo : listaAmigos) {
            if (amigo.getId() == id) {
                amigos = amigo;

            }

        }
        return amigos;

    }

    private Produtos buscarFerramentas(int id, ArrayList<Produtos> listaFerramentas) {
        Produtos ferramentas = null;
        for (Produtos ferramenta : listaFerramentas) {

            if (ferramenta.getId() == id) {
                ferramentas = ferramenta;

            }

        }
        return ferramentas;

    }

    /*public void updateDate() {
        int id = Integer.parseInt(view.getIdid().getText());

        String dataDevolucao = view.getTxtDated().getText();
        Emprestimos emprestimos = new Emprestimos();
        emprestimos.setDataDevolucao(Util.Util.converterData(dataDevolucao));
        Connection conexao = new Conexao().getConnection();
        VendasDAO emprestimosDAO = new VendasDAO(conexao);

        emprestimosDAO.updateDataDevolucao(emprestimos, id);
        JOptionPane.showMessageDialog(null, "Data Alterada com sucesso!");

    }*/
    public void listarSomatoria() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao = new Conexao().getConnection();
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTotalSoma().getModel();
            model.setNumRows(0);
            model.addRow(new Object[]{
                Util.Util.converterPreco(produtoDAO.getValor())

            });
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Produtos" + erro);

        }

    }

    public void listarSomatoriaRelatorio(BigDecimal valorTotal) {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        //  try {
        //Connection conexao = new Conexao().getConnection();
        // ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

        DefaultTableModel model = (DefaultTableModel) view.getTotalSomaRelatorio().getModel();
        model.setNumRows(0);
        model.addRow(new Object[]{
            Util.Util.converterValorBigDecimalparaValorMonetarioNegativo(valorTotal)

        });
        /*  } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Produtos" + erro);

        }*/

    }

   
    public void relatorio() {
        try {
            Connection conexao1 = new Conexao().getConnection();
            Connection conexao = new Conexao().getConnection();
            BigDecimal valorTotal = new BigDecimal("0");
            DefaultTableModel model = (DefaultTableModel) view.getTableRelatorio().getModel();
            model.setNumRows(0);
            VendasDAO vendasDAO = new VendasDAO(conexao);
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao1);
            ArrayList<Vendas> lista1 = vendasDAO.listarVendasOrdenadoPeloIdDoProduto();
            ArrayList<Produtos> lista2 = produtoDAO.listarProdutosOrdenadoPeloId();
           // Vendas vendas = lista1.get(0);

            BigDecimal valorVendidoAux = new BigDecimal("0");
            
            
            Map<Produtos, List<Vendas>> mapProduto = new HashMap();
            for (Produtos prod: lista2) {
                            
                BigDecimal valorVendido = BigDecimal.ZERO;
                BigDecimal valorTotalVEndaProduto = prod.getPreco();
                for (Vendas vendas: lista1) {
                    if( vendas.getIdProduto() == prod.getId()){
                       valorVendido = valorVendido.add(vendas.getValorProduto());  
                       
                       model.addRow(new Object[]{
                        vendas.getId(),
                        Util.Util.converterData(vendas.getDataVenda()),
                        Util.Util.converterValorBigDecimalparaValorMonetario(vendas.getValorProduto()),
                        Util.Util.converterValorBigDecimalparaValorMonetario(prod.getPreco())
                    });
                    }
                }
                if(valorVendido.compareTo(BigDecimal.ZERO) > 0){
                   valorTotal = valorTotal.add(valorVendido.subtract(valorTotalVEndaProduto));
                } 
            }

            
           /* Map<Produtos, List<Vendas>> mapProduto = new HashMap();
            
            for (int i = 0; i < lista1.size(); i++) {
                Produtos produtoAux = Util.Util.buscarProdutos(lista1.get(i).getIdProduto(), lista2);
                Vendas vendaAux = lista1.get(i);
                if (produtoAux != null) {
                    if(mapProduto.containsKey(produtoAux)){
                        mapProduto.put(produtoAux, vendaAux); 
                    }else{
                        
                    }
                }               
            }
            
            for (Map.Entry<Produtos, Vendas> mapVendas : mapProduto.entrySet()) {
                Pro key = mapVendas.getKey();
                int value = entry.getValue();
                System.out.println("Key: " + key + ", Value: " + value);
            }*/
            
            
            /*for (int i = 0; i < lista1.size(); i++) {
                //Inicio
                BigDecimal valorTotalAux = new BigDecimal("0");

                Produtos produtoAux = Util.Util.buscarProdutos(lista1.get(i).getIdProduto(), lista2);
                if (produtoAux != null) {
                    BigDecimal valorVendido = lista1.get(i).getValorProduto();
                    valorVendidoAux = valorVendidoAux.add(valorVendido);

                    BigDecimal valorProduto = produtoAux.getPreco();
                    if (i == lista1.size() - 1) {
                        valorTotal = valorVendidoAux.subtract(valorProduto);
                    } else {

                    }

                    Vendas vendaAux = lista1.get(i);
                    if (vendas.getIdProduto()!= vendaAux.getIdProduto()) {
                        vendas = vendaAux;
                    } else {

                    }
                }//Fim */
                /* BigDecimal valorAux = lista1.get(i).getValorProduto(); 
                Produtos produtoAux = Util.Util.buscarProdutos(lista1.get(i).getIdProduto(), lista2);
                if (produtoAux != null) {
                   valorTotal = valorTotal.add(valorAux.subtract(produtoAux.getPreco()));
                    model.addRow(new Object[]{
                        lista1.get(i).getId(),
                        Util.Util.converterData(lista1.get(i).getDataVenda()),
                        Util.Util.converterValorBigDecimalparaValorMonetario(lista1.get(i).getValorProduto()),
                        Util.Util.converterValorBigDecimalparaValorMonetario(produtoAux.getPreco())
                    });

                } */

            //}
            listarSomatoriaRelatorio(valorTotal);
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Relatório" + erro);

        }

    }

    public static void main(String[] args) {
        List<String> myList = List.of("Apple", "Banana", "Orange");

        // Assuming you have an iterator or a loop to iterate through the list
        for (int i = 0; i < myList.size(); i++) {
            String currentItem = myList.get(i);

            // Check if the current item is the last element
            if (i == myList.size() - 1) {
                System.out.println("This is the last element: " + currentItem);
            } else {
                System.out.println("Not the last element: " + currentItem);
            }
        }
    }

}
