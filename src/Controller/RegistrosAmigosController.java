/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClientesDAO;
import DAO.Conexao;
import Model.Clientes;
import View.RegistrosAmigos;
import View.TelaPrincipal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class RegistrosAmigosController {

    private RegistrosAmigos view;
    TelaPrincipal TP = new TelaPrincipal();
    public RegistrosAmigosController(RegistrosAmigos view) {
        this.view = view;
    }

    public void  registrarCliente() {
        String nome = view.getTxtnome().getText();
        String telefone = view.getTxttelefone().getText();

        Clientes amigos = new Clientes(nome, telefone);

        if (view.getTxtnome().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe pelo menos o nome para efetuar o cadastro!");
        } else {
            try {
                Connection conexao = new Conexao().getConnection();
                ClientesDAO clientesDAO = new ClientesDAO(conexao);
                clientesDAO.insertBD(amigos);
                JOptionPane.showMessageDialog(null, "CLIENTE CADASTRADO COM SUCESSO!");
                view.getTxtnome().setText("");
                view.getTxttelefone().setText("");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrosAmigos.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuario" + ex);
            }
        }

    }

    public void updateCliente() {
        if (view.getTxtnome().getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe pelo menos o nome para alterar um cliente!");
        } else {
            int id = Integer.parseInt(view.getTxtId().getText());
            String nome = view.getTxtnome().getText();
            String telefone = view.getTxttelefone().getText();

            Clientes clientes = new Clientes(nome, telefone);
            Connection conexao = new Conexao().getConnection();
            ClientesDAO clientesDAO = new ClientesDAO(conexao);
            clientesDAO.UpdateAmigos(clientes, id);
            JOptionPane.showMessageDialog(null, "CLIENTE ALTERADO COM SUCESSO!");
            view.getTxtnome().setText("");
            view.getTxttelefone().setText("");
        }
    }

    public void deleteCliente() {
        int id = Integer.parseInt(view.getTxtId().getText());
        Clientes clientes = new Clientes();
        Connection conexao = new Conexao().getConnection();
        ClientesDAO clientesDAO = new ClientesDAO(conexao);
        clientesDAO.deleteClientes(id);
    }
    
}
