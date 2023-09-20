/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import DAO.Conexao;
import DAO.ProdutoDAO;
import View.TelaPrincipal;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Principal {

    public static void main(String[] args) throws SQLException {

        TelaPrincipal TP = new TelaPrincipal();
        TP.setVisible(true);
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date); 

//     Connection conexao = new Conexao().getConnection();
//        EmprestimosDAO emprestimosDAO = new EmprestimosDAO(conexao);
//        List<Emprestimos> lista = emprestimosDAO.relatorioAmigos(1);
//        System.out.println(lista.get(1).getIdAmigos());
//        System.out.println(lista.get(1).getIdFerramentas());
//        System.out.println(data);
    }
}
