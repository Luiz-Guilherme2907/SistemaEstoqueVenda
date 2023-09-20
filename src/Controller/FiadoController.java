/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author GUI
 */
import DAO.Conexao;
import DAO.FiadoDAO;
import DAO.ProdutoDAO;
import DTO.FiadoDTO;
import Model.Fiado;
import Model.Produtos;
import View.VendasFiado;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Util.Util.buscarProdutos;

public class FiadoController {

    private VendasFiado view;

    public FiadoController(VendasFiado view) {
        this.view = view;
    }

    public void listarFiado() {
        //Faz a coenxao com a classe e manda os dados para a tela dentro da tabela;
        try {
            Connection conexao1 = new Conexao().getConnection();
            ProdutoDAO produtosDAO = new ProdutoDAO(conexao1);

            ArrayList<Produtos> listaProduto = produtosDAO.listarProdutos();

            Connection conexao = new Conexao().getConnection();
            FiadoDAO fiadoDAO = new FiadoDAO(conexao);

            DefaultTableModel model = (DefaultTableModel) view.getTableFiado().getModel();
            model.setNumRows(0);

            ArrayList<FiadoDTO> lista = new ArrayList<>();
            ArrayList<Fiado> listaBD = fiadoDAO.listarFiado();

            for (Fiado fiado : listaBD) {

                Produtos produtos = buscarProdutos(fiado.getIdProduto(), listaProduto);
                if (produtos != null) {
                    FiadoDTO fiadoDTO = new FiadoDTO(fiado.getId(), produtos.getNome(), fiado.getNomeCliente(), Util.Util.converterData(fiado.getDataVendaFiado()), fiado.getQuantidade());
                    model.addRow(new Object[]{
                        fiadoDTO.getId(),
                        fiadoDTO.getNomeCliente(),
                        fiadoDTO.getProdutos(),
                        fiadoDTO.getDataVendaFiado(),
                        fiadoDTO.getQuantidade()
                    });
                }

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro em listar Fiado" + erro);

        }

    }
}
