package View;

import Controller.ListaClientesProdutosController;
import DAO.Conexao;
import DAO.ProdutoDAO;
import DAO.VendasDAO;
import Model.Produtos;
import Model.Vendas;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import View.RelatorioDetalhado;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/*
IMPORTANTE, EM CASO DE ERRO NO CÓDIGO, Verifique o caminho das imagens em todas as classes View

É simples, vá ate sua pasta do netbeans no explorador de arquivos e encontre o projeto do ToolTracker, depois copie e cole seu caminho
sobrescrevendo o existente até a parte (facul)


exemplo antes : "C:\\Users\\caiop\\OneDrive\\Documentos\\NetBeansProjects\\Facul\\ToolTracker\\src\\I_Icons\\lua_tema.png"));

exemplo depois: "C:\\Users\\SeuZÉ\\Documentos\\NetBeansProjects\\ToolTracker\\src\\I_Icons\\lua_tema.png")); 

 */

 /*
author @Caio / @Guilherme
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private boolean b_editarOuDeletar;

    public static boolean tema = true;   // True = Claro / False = Escuro //

    private final ListaClientesProdutosController controller;

    //Indica qual tela é mostrada
    private boolean cardHome = true;
    private boolean cardAmigos = false;
    private boolean cardFerramentas = false;
    private boolean cardRelatorio = false;

    public TelaPrincipal() {
        initComponents();
        //Colocando o icone do Sistema/Janela
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/M_B_LOGO_OFICIAL-removebg-preview.png")).getImage());

        this.label_indicar_sair.setVisible(false);

        controller = new ListaClientesProdutosController(this);

        // Codigo para iniciar os carregamentos de tabelas.
        controller.listarClientes();
        controller.listarProdutos();
        controller.listarVendas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPop_botoes = new javax.swing.JPopupMenu();
        popupHome = new javax.swing.JMenuItem();
        popupAmigos = new javax.swing.JMenuItem();
        popupFerramentas = new javax.swing.JMenuItem();
        popupRelatorio = new javax.swing.JMenuItem();
        Separator_botoes = new javax.swing.JPopupMenu.Separator();
        popupOpcoes = new javax.swing.JMenuItem();
        popupSair = new javax.swing.JMenuItem();
        JPop_Home = new javax.swing.JPopupMenu();
        popup_home_RE = new javax.swing.JMenuItem();
        Separator_home = new javax.swing.JPopupMenu.Separator();
        popup_home_refresh = new javax.swing.JMenuItem();
        JPop_Amigos = new javax.swing.JPopupMenu();
        popup_amigos_cadastrar = new javax.swing.JMenuItem();
        Separator_amigos = new javax.swing.JPopupMenu.Separator();
        popup_amigos_refresh = new javax.swing.JMenuItem();
        JPop_Ferramentas = new javax.swing.JPopupMenu();
        popup_ferramentas_cadastrar = new javax.swing.JMenuItem();
        Separator_ferramentas = new javax.swing.JPopupMenu.Separator();
        popup_ferramentas_refresh = new javax.swing.JMenuItem();
        divisoria = new javax.swing.JPanel();
        JP_Principal = new javax.swing.JPanel();
        JP_Home = new javax.swing.JPanel();
        CadastrarAmigoHome = new javax.swing.JButton();
        CadastrarFerramentaHome = new javax.swing.JButton();
        b_refreshEmprestimos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label_titulo_home = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonVendas = new javax.swing.JButton();
        buttonDeleteVenda = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableVendas = new javax.swing.JTable();
        b_fiado = new javax.swing.JButton();
        label_fundo_home = new javax.swing.JLabel();
        JP_ListaAmigos = new javax.swing.JPanel();
        label_titulo_amigos = new javax.swing.JLabel();
        b_cadastrarAmigos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_clientes = new javax.swing.JTable();
        b_editarAmigo = new javax.swing.JButton();
        deleteAmigo = new javax.swing.JButton();
        atualizarTabela = new javax.swing.JButton();
        label_logo_amigos = new javax.swing.JLabel();
        label_fundo_amigos = new javax.swing.JLabel();
        JP_ListaFerramentas = new javax.swing.JPanel();
        label_titulo_ferramentas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_produtos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        b_cadastrarFerramenta = new javax.swing.JButton();
        b_editarFerramenta = new javax.swing.JButton();
        b_apagarFerramenta = new javax.swing.JButton();
        AtualizarFerramentas = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        totalSoma = new javax.swing.JTable();
        label_fundo_ferramentas = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JP_Relatorio = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableRelatorio = new javax.swing.JTable();
        label_titulo_relatorio = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        totalSomaRelatorio = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label_fundo_relatorio = new javax.swing.JLabel();
        JP_Lista = new javax.swing.JPanel();
        b_mudarTema = new javax.swing.JButton();
        b_Home = new javax.swing.JButton();
        b_ListaAmigos = new javax.swing.JButton();
        b_ListaFerramentas = new javax.swing.JButton();
        b_relatorio = new javax.swing.JButton();
        b_opcoes = new javax.swing.JButton();
        label_sair = new javax.swing.JLabel();
        label_indicar_sair = new javax.swing.JLabel();
        label_botoes = new javax.swing.JLabel();

        popupHome.setText("Home");
        popupHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupHomeActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupHome);

        popupAmigos.setText("Amigos");
        popupAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupAmigosActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupAmigos);

        popupFerramentas.setText("Ferramentas");
        popupFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupFerramentasActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupFerramentas);

        popupRelatorio.setText("Relatório");
        popupRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupRelatorioActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupRelatorio);
        JPop_botoes.add(Separator_botoes);

        popupOpcoes.setText("Opções");
        popupOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupOpcoesActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupOpcoes);

        popupSair.setText("Sair");
        popupSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popupSairActionPerformed(evt);
            }
        });
        JPop_botoes.add(popupSair);

        popup_home_RE.setText("Realizar Emprestimo");
        popup_home_RE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_home_REActionPerformed(evt);
            }
        });
        JPop_Home.add(popup_home_RE);
        JPop_Home.add(Separator_home);

        popup_home_refresh.setText("Refresh");
        popup_home_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_home_refreshActionPerformed(evt);
            }
        });
        JPop_Home.add(popup_home_refresh);

        popup_amigos_cadastrar.setText("Cadastrar Amigo");
        popup_amigos_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_amigos_cadastrarActionPerformed(evt);
            }
        });
        JPop_Amigos.add(popup_amigos_cadastrar);
        JPop_Amigos.add(Separator_amigos);

        popup_amigos_refresh.setText("Refresh");
        popup_amigos_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_amigos_refreshActionPerformed(evt);
            }
        });
        JPop_Amigos.add(popup_amigos_refresh);

        popup_ferramentas_cadastrar.setText("Cadastrar Ferramenta");
        popup_ferramentas_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_ferramentas_cadastrarActionPerformed(evt);
            }
        });
        JPop_Ferramentas.add(popup_ferramentas_cadastrar);
        JPop_Ferramentas.add(Separator_ferramentas);

        popup_ferramentas_refresh.setText("Refresh");
        popup_ferramentas_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popup_ferramentas_refreshActionPerformed(evt);
            }
        });
        JPop_Ferramentas.add(popup_ferramentas_refresh);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        divisoria.setBackground(new java.awt.Color(0, 0, 0));
        divisoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(divisoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, 3, 700));

        JP_Principal.setPreferredSize(new java.awt.Dimension(1575, 300));
        JP_Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JP_PrincipalMouseReleased(evt);
            }
        });
        JP_Principal.setLayout(new java.awt.CardLayout());

        JP_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastrarAmigoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/icone_addA_1.png"))); // NOI18N
        CadastrarAmigoHome.setBorderPainted(false);
        CadastrarAmigoHome.setContentAreaFilled(false);
        CadastrarAmigoHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarAmigoHome.setFocusPainted(false);
        CadastrarAmigoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAmigoHomeActionPerformed(evt);
            }
        });
        JP_Home.add(CadastrarAmigoHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 130, 130));

        CadastrarFerramentaHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/icone_addF.png"))); // NOI18N
        CadastrarFerramentaHome.setBorderPainted(false);
        CadastrarFerramentaHome.setContentAreaFilled(false);
        CadastrarFerramentaHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CadastrarFerramentaHome.setFocusPainted(false);
        CadastrarFerramentaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFerramentaHomeActionPerformed(evt);
            }
        });
        JP_Home.add(CadastrarFerramentaHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 130, 130));

        b_refreshEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/refresh_icon.png"))); // NOI18N
        b_refreshEmprestimos.setBorderPainted(false);
        b_refreshEmprestimos.setContentAreaFilled(false);
        b_refreshEmprestimos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_refreshEmprestimos.setFocusPainted(false);
        b_refreshEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refreshEmprestimosActionPerformed(evt);
            }
        });
        JP_Home.add(b_refreshEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 640, 40, 40));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo_home.setFont(new java.awt.Font("Segoe UI Black", 1, 94)); // NOI18N
        label_titulo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Quiosque_M.B_preto.png"))); // NOI18N
        jPanel1.add(label_titulo_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 670, 130));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/quiosque_Icon-removebg-preview.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 160, 190));

        JP_Home.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        buttonVendas.setText("Vender");
        buttonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVendasActionPerformed(evt);
            }
        });
        JP_Home.add(buttonVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 240, 50));

        buttonDeleteVenda.setText("Deletar Venda");
        buttonDeleteVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteVendaActionPerformed(evt);
            }
        });
        JP_Home.add(buttonDeleteVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 240, 50));

        tableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome do Produto", "Valor", "Quantidade", "Data da venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableVendas);

        JP_Home.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        b_fiado.setText("Vender Fiado");
        b_fiado.setPreferredSize(new java.awt.Dimension(67, 22));
        b_fiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fiadoActionPerformed(evt);
            }
        });
        JP_Home.add(b_fiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 240, 50));

        label_fundo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_Home.add(label_fundo_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 700));

        JP_Principal.add(JP_Home, "Home");

        JP_ListaAmigos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo_amigos.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        label_titulo_amigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Clientes.png"))); // NOI18N
        JP_ListaAmigos.add(label_titulo_amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 320, 50));

        b_cadastrarAmigos.setText("Cadastrar Cliente");
        b_cadastrarAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cadastrarAmigos.setFocusPainted(false);
        b_cadastrarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarAmigosActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(b_cadastrarAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 390, 255, -1));

        table_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_clientes);

        JP_ListaAmigos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 30, 690, 660));

        b_editarAmigo.setText("Editar Cliente");
        b_editarAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_editarAmigo.setFocusPainted(false);
        b_editarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarAmigoActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(b_editarAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 465, 255, -1));

        deleteAmigo.setText("Apagar Cliente");
        deleteAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteAmigo.setFocusPainted(false);
        deleteAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAmigoActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(deleteAmigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 541, 255, -1));

        atualizarTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/refresh_icon.png"))); // NOI18N
        atualizarTabela.setBorderPainted(false);
        atualizarTabela.setContentAreaFilled(false);
        atualizarTabela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarTabelaActionPerformed(evt);
            }
        });
        JP_ListaAmigos.add(atualizarTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 40, 40));

        label_logo_amigos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_logo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/clietela.png"))); // NOI18N
        label_logo_amigos.setToolTipText("");
        JP_ListaAmigos.add(label_logo_amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 260, 250));

        label_fundo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_ListaAmigos.add(label_fundo_amigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1060, 700));

        JP_Principal.add(JP_ListaAmigos, "Lista Amigos");

        JP_ListaFerramentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_titulo_ferramentas.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        label_titulo_ferramentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Produtos_preto.png"))); // NOI18N
        JP_ListaFerramentas.add(label_titulo_ferramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 350, 50));

        table_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Marca", "Preço", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_produtos);

        JP_ListaFerramentas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 690, 560));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/Produtos_resized.png"))); // NOI18N
        jLabel8.setToolTipText("");
        JP_ListaFerramentas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 360, 290));

        b_cadastrarFerramenta.setText("Cadastrar Produto");
        b_cadastrarFerramenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cadastrarFerramenta.setFocusPainted(false);
        b_cadastrarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarFerramentaActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(b_cadastrarFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 250, -1));

        b_editarFerramenta.setText("Editar Produto");
        b_editarFerramenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_editarFerramenta.setFocusPainted(false);
        b_editarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarFerramentaActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(b_editarFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 250, -1));

        b_apagarFerramenta.setText("Apagar Produto");
        b_apagarFerramenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_apagarFerramenta.setFocusPainted(false);
        b_apagarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apagarFerramentaActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(b_apagarFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 250, -1));

        AtualizarFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/refresh_icon.png"))); // NOI18N
        AtualizarFerramentas.setBorderPainted(false);
        AtualizarFerramentas.setContentAreaFilled(false);
        AtualizarFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AtualizarFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarFerramentasActionPerformed(evt);
            }
        });
        JP_ListaFerramentas.add(AtualizarFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 30, 30));

        totalSoma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Total:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(totalSoma);
        if (totalSoma.getColumnModel().getColumnCount() > 0) {
            totalSoma.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JP_ListaFerramentas.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 290, 50));

        label_fundo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_ListaFerramentas.add(label_fundo_ferramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1060, 700));
        JP_ListaFerramentas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        JP_Principal.add(JP_ListaFerramentas, "Lista Ferramentas");

        JP_Relatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Data", "Valor Vendido", "Valor gasto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableRelatorio);

        JP_Relatorio.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 750, 460));

        label_titulo_relatorio.setFont(new java.awt.Font("Counter-Strike", 0, 48)); // NOI18N
        label_titulo_relatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo_relatorio.setText("Relatorio");
        JP_Relatorio.add(label_titulo_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 410, 90));

        totalSomaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Lucro: "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(totalSomaRelatorio);
        if (totalSomaRelatorio.getColumnModel().getColumnCount() > 0) {
            totalSomaRelatorio.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JP_Relatorio.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 290, 50));

        jLabel1.setText("Se houver PREJUIZO, a tabela \"Lucro\" mostrará o valor da divida R$ - XXX");
        JP_Relatorio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 530, -1));

        jButton1.setText("Relatório detalhado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JP_Relatorio.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        label_fundo_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png"))); // NOI18N
        JP_Relatorio.add(label_fundo_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1060, 700));

        JP_Principal.add(JP_Relatorio, "Relatorio");

        getContentPane().add(JP_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 0, 1060, 700));

        JP_Lista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JP_Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JP_ListaMouseReleased(evt);
            }
        });
        JP_Lista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_mudarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/lua_tema.png"))); // NOI18N
        b_mudarTema.setBorderPainted(false);
        b_mudarTema.setContentAreaFilled(false);
        b_mudarTema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_mudarTema.setFocusPainted(false);
        b_mudarTema.setFocusable(false);
        b_mudarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_mudarTemaActionPerformed(evt);
            }
        });
        JP_Lista.add(b_mudarTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, 40, 40));

        b_Home.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/tioPato-removebg-preview.png"))); // NOI18N
        b_Home.setText("Vendas");
        b_Home.setAlignmentY(0.4F);
        b_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_Home.setFocusPainted(false);
        b_Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_HomeActionPerformed(evt);
            }
        });
        JP_Lista.add(b_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 217, 85));

        b_ListaAmigos.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_ListaAmigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/amigos_lp.png"))); // NOI18N
        b_ListaAmigos.setText("   Clientes");
        b_ListaAmigos.setToolTipText("");
        b_ListaAmigos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ListaAmigos.setFocusPainted(false);
        b_ListaAmigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_ListaAmigos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_ListaAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ListaAmigosActionPerformed(evt);
            }
        });
        JP_Lista.add(b_ListaAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 94, 217, 85));

        b_ListaFerramentas.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        b_ListaFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/produtos_ip-removebg-preview.png"))); // NOI18N
        b_ListaFerramentas.setText("              Produtos");
        b_ListaFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ListaFerramentas.setFocusable(false);
        b_ListaFerramentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_ListaFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ListaFerramentasActionPerformed(evt);
            }
        });
        JP_Lista.add(b_ListaFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 185, 217, 85));

        b_relatorio.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/emprestimos_lp.png"))); // NOI18N
        b_relatorio.setText("    Relatório");
        b_relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_relatorio.setFocusable(false);
        b_relatorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_relatorio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_relatorioActionPerformed(evt);
            }
        });
        JP_Lista.add(b_relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 276, 217, 85));

        b_opcoes.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        b_opcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/opcoes_lp.png"))); // NOI18N
        b_opcoes.setText("    Opções");
        b_opcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_opcoes.setFocusPainted(false);
        b_opcoes.setFocusable(false);
        b_opcoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        b_opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_opcoesActionPerformed(evt);
            }
        });
        JP_Lista.add(b_opcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 618, 217, 80));

        label_sair.setFont(new java.awt.Font("Counter-Strike", 0, 36)); // NOI18N
        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_preto.png"))); // NOI18N
        label_sair.setText("X");
        label_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_sairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label_sairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                label_sairMouseExited(evt);
            }
        });
        JP_Lista.add(label_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 30, 40));

        label_indicar_sair.setFont(new java.awt.Font("Counter-Strike", 2, 12)); // NOI18N
        label_indicar_sair.setText("Sair");
        JP_Lista.add(label_indicar_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 40, 40));

        label_botoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/fundo_botoes_branco.png"))); // NOI18N
        JP_Lista.add(label_botoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 230, 710));

        getContentPane().add(JP_Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão de opções
    private void b_opcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_opcoesActionPerformed
        Opcoes opcoes = new Opcoes();

        if (opcoes.estaAberto() == false) {
            opcoes.setVisible(true);
            opcoes.setAberto(true);

        } else if (opcoes.estaAberto() == true) {
            JOptionPane.showMessageDialog(null, "Uma janela de opções já está aberta!", "Não foi possivel abrir a janela", 2);
        }
    }//GEN-LAST:event_b_opcoesActionPerformed

    //Botão Home
    private void b_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_HomeActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Home");

        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = true;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_b_HomeActionPerformed

    //Botão Amigos
    private void b_ListaAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ListaAmigosActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Amigos");

        //Para verificação do PopUp Menu
        cardAmigos = true;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_b_ListaAmigosActionPerformed

    //Botão Produtos
    private void b_ListaFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ListaFerramentasActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Ferramentas");
        controller.listarProdutos();
        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = true;
        cardRelatorio = false;
    }//GEN-LAST:event_b_ListaFerramentasActionPerformed

    //Botão Relatorio
    private void b_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_relatorioActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Relatorio");

        // Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = true;
        controller.relatorio();

    }//GEN-LAST:event_b_relatorioActionPerformed

    //Código para aparecer o Pop-Up menu no Panel das opções (Home, amigos, ferramentas, rank)
    private void JP_ListaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_ListaMouseReleased
        if (evt.isPopupTrigger()) {
            JPop_botoes.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_JP_ListaMouseReleased

    //Ação de PopUp Sair (JPanel Botões)
    private void popupSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_popupSairActionPerformed

    //Indicador de PopUps No panel da direita
    private void JP_PrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JP_PrincipalMouseReleased

        if ((evt.isPopupTrigger()) && (cardHome == true)) {
            JPop_Home.show(this, evt.getX() + 230, evt.getY());
        }

        if ((evt.isPopupTrigger()) && (cardAmigos == true)) {
            JPop_Amigos.show(this, evt.getX() + 230, evt.getY());
        }

        if ((evt.isPopupTrigger()) && (cardFerramentas == true)) {
            JPop_Ferramentas.show(this, evt.getX() + 230, evt.getY());
        }

    }//GEN-LAST:event_JP_PrincipalMouseReleased

    private void b_cadastrarAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarAmigosActionPerformed
        RegistrosAmigos registroAmigos = new RegistrosAmigos();

        //Verificar se já esta aberto
        if (registroAmigos.isAberto() == false) {
            registroAmigos.setAberto(true);

            registroAmigos.setVisible(true);
            registroAmigos.getjBotaoCadastro().setVisible(true);

        } else if (registroAmigos.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }
    }//GEN-LAST:event_b_cadastrarAmigosActionPerformed

////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Mudança de tema!!
    private void b_mudarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_mudarTemaActionPerformed

        try {

            // Obter o Look and Feel atual
            String currentLF = UIManager.getLookAndFeel().getClass().getName();
            System.out.println("tela1 " + currentLF);

            // Verificar se o tema atual é escuro ou claro
            if (currentLF.equals("javax.swing.plaf.nimbus.NimbusLookAndFeel")) {
                // Definir algumas propriedades para o tema claro
                UIManager.put("control", new Color(214, 217, 223));
                UIManager.put("text", new Color(0, 0, 0));
                UIManager.put("nimbusBase", new Color(214, 217, 223));
                UIManager.put("nimbusBlueGrey", new Color(193, 200, 206));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusLightBackground", new Color(214, 217, 223));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusSelectedText", new Color(0, 0, 0));
                UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
                // Se for escuro, mudar para claro

                temaClaro();
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); //Aqui é possível tirar aquele Modelo de inicio padrão

            } else {
                // Definir algumas propriedades para o tema escuro
                UIManager.put("control", new Color(68, 68, 68));
                UIManager.put("text", new Color(214, 217, 223));
                UIManager.put("nimbusBase", new Color(18, 30, 49));
                UIManager.put("nimbusBlueGrey", new Color(48, 57, 67));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
                UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
                // Se for claro, mudar para escuro

                temaEscuro();
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

            }

            // Verificar se o tema atual é o Nimbus claro (era outro tema)
            // Atualizar a aparência da interface do usuário
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_b_mudarTemaActionPerformed

    public static boolean getTema() {
        return tema;
    }

    //IMPORTANTE, caso não funcione, Mude o Caminho dos icones em sua Maquina!
    public void temaClaro() {

        tema = true;

        b_mudarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/lua_tema.png")));

        label_titulo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Quiosque_M.B_preto.png")));
        label_titulo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Clientes.png")));
        label_titulo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Produtos_preto.png")));

        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_preto.png")));

        label_botoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/fundo_botoes_branco.png")));

        label_fundo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        label_fundo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        label_fundo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));
        label_fundo_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_branco_2.png")));

    }

    public void temaEscuro() {

        tema = false;

        b_mudarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/sol_tema.png")));

        label_titulo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Quiosque_M.B_branco.png")));
        label_titulo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Clientes.png")));
        label_titulo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Titulos/Produtos_preto.png")));

        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_branco.png")));

        label_botoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/fundo_botoes_preto.png")));

        label_fundo_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        label_fundo_amigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        label_fundo_ferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));
        label_fundo_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Fundos/plano_de_fundo_preto_2.png")));

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////  

    private void b_editarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarAmigoActionPerformed

        int linhaSelecionada = table_clientes.getSelectedRow();

        if (linhaSelecionada != -1) {

            CarregarCampos();

        } else {

            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }


    }//GEN-LAST:event_b_editarAmigoActionPerformed

    private void atualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarTabelaActionPerformed
        controller.listarClientes();
    }//GEN-LAST:event_atualizarTabelaActionPerformed

    private void deleteAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAmigoActionPerformed

        int linhaSelecionada = table_clientes.getSelectedRow();

        if (linhaSelecionada != -1) {

            camposNaoEditaveis();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um amigo que deseja excluir!");

        }


    }//GEN-LAST:event_deleteAmigoActionPerformed

    //Eventos dos PopUps Menu (JPanel Botões)
    private void popupHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupHomeActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Home");

        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = true;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_popupHomeActionPerformed

    private void popupAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupAmigosActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Amigos");

        //Para verificação do PopUp Menu
        cardAmigos = true;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = false;
    }//GEN-LAST:event_popupAmigosActionPerformed

    private void popupFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupFerramentasActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Lista Ferramentas");

        //Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = true;
        cardRelatorio = false;
    }//GEN-LAST:event_popupFerramentasActionPerformed

    private void popupRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupRelatorioActionPerformed
        CardLayout CL = (CardLayout) JP_Principal.getLayout();
        CL.show(JP_Principal, "Relatorio");

        // Para verificação do PopUp Menu
        cardAmigos = false;
        cardHome = false;
        cardFerramentas = false;
        cardRelatorio = true;
    }//GEN-LAST:event_popupRelatorioActionPerformed

    private void popupOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popupOpcoesActionPerformed
        Opcoes opcoes = new Opcoes();

        if (opcoes.estaAberto() == false) {
            opcoes.setVisible(true);
            opcoes.setAberto(true);

        } else if (opcoes.estaAberto() == true) {
            JOptionPane.showMessageDialog(null, "Uma janela de opções já está aberta!", "Não foi possivel abrir a janela", 2);
        }
    }//GEN-LAST:event_popupOpcoesActionPerformed

    private void b_cadastrarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarFerramentaActionPerformed
        RegistroProdutos registroProdutos = new RegistroProdutos();
        registroProdutos.setPrincipal(this);
        //Verificar se janela já está aberta
        if (registroProdutos.isAberto() == false) {

            registroProdutos.setAberto(true);

            registroProdutos.setVisible(true);
            registroProdutos.getjBotaoCadastroFerramenta().setVisible(true);
            registroProdutos.getjDeleteFerramenta().setVisible(false);

        } else if (registroProdutos.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }

    }//GEN-LAST:event_b_cadastrarFerramentaActionPerformed

    private void b_editarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarFerramentaActionPerformed

        b_editarOuDeletar = true;

        int linhaSelecionada = table_produtos.getSelectedRow();

        if (linhaSelecionada != -1) {

            CarregarCamposFerramentas();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }
    }//GEN-LAST:event_b_editarFerramentaActionPerformed

    private void AtualizarFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarFerramentasActionPerformed
        controller.listarProdutos();

    }//GEN-LAST:event_AtualizarFerramentasActionPerformed

    //Botão de abrir tela para apagar Ferramenta selecionada
    private void b_apagarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apagarFerramentaActionPerformed

        b_editarOuDeletar = false;

        int linhaSelecionada = table_produtos.getSelectedRow();

        if (linhaSelecionada != -1) {
            camposNaoEditaveisFerramentas();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma ferramenta que deseja excluir!");

        }
    }//GEN-LAST:event_b_apagarFerramentaActionPerformed

    private void CadastrarAmigoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAmigoHomeActionPerformed
        RegistrosAmigos RA = new RegistrosAmigos();

        //Verificar se já está aberto
        if (RA.isAberto() == false) {
            RA.setAberto(true);

            RA.setVisible(true);
            RA.getjBotaoCadastro().setVisible(true);

        } else if (RA.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }
    }//GEN-LAST:event_CadastrarAmigoHomeActionPerformed

    private void CadastrarFerramentaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFerramentaHomeActionPerformed
        RegistroProdutos RF = new RegistroProdutos();

        //Verificar se já está aberto
        if (RF.isAberto() == false) {
            RF.setAberto(true);

            RF.setVisible(true);
            RF.getjBotaoCadastroFerramenta().setVisible(true);

        } else if (RF.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }
    }//GEN-LAST:event_CadastrarFerramentaHomeActionPerformed

    private void popup_amigos_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_amigos_cadastrarActionPerformed
        RegistrosAmigos registroAmigos = new RegistrosAmigos();

        registroAmigos.setVisible(true);
        registroAmigos.getjBotaoCadastro().setVisible(true);
    }//GEN-LAST:event_popup_amigos_cadastrarActionPerformed


    private void b_refreshEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refreshEmprestimosActionPerformed
        controller.listarVendas();
    }//GEN-LAST:event_b_refreshEmprestimosActionPerformed

    private void label_sairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseEntered
        label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_vermelho.png")));
        label_indicar_sair.setVisible(true);
    }//GEN-LAST:event_label_sairMouseEntered

    private void label_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseExited

        if (tema == true) {
            label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_preto.png")));
        } else if (tema == false) {
            label_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/I_Icons/I_fechar_branco.png")));
        }

        label_indicar_sair.setVisible(false);
    }//GEN-LAST:event_label_sairMouseExited

    private void label_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_sairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_label_sairMouseClicked

    //RESTO DOS POPUPS MENU 
    //(Home)
    private void popup_home_REActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_home_REActionPerformed

    }//GEN-LAST:event_popup_home_REActionPerformed

    private void popup_home_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_home_refreshActionPerformed

    }//GEN-LAST:event_popup_home_refreshActionPerformed

    //(Amigos) P.S Cadastrar Amigo POPUP se encontra antes no código pois foi feito anteriormente
    private void popup_amigos_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_amigos_refreshActionPerformed
        controller.listarClientes();
    }//GEN-LAST:event_popup_amigos_refreshActionPerformed

    //(Produtos)
    private void popup_ferramentas_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_ferramentas_cadastrarActionPerformed
        RegistroProdutos registroFerramentas = new RegistroProdutos();

        //Verificar se janela já está aberta
        if (registroFerramentas.isAberto() == false) {

            registroFerramentas.setAberto(true);

            registroFerramentas.setVisible(true);
            registroFerramentas.getjBotaoCadastroFerramenta().setVisible(true);
            registroFerramentas.getjDeleteFerramenta().setVisible(false);

        } else if (registroFerramentas.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }

    }//GEN-LAST:event_popup_ferramentas_cadastrarActionPerformed

    private void popup_ferramentas_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popup_ferramentas_refreshActionPerformed
        controller.listarProdutos();
    }//GEN-LAST:event_popup_ferramentas_refreshActionPerformed

    private void buttonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVendasActionPerformed
        ViewVendas vendas = null;
        try {
            vendas = new ViewVendas();
            vendas.setPrincipal(this);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Verificar se já está aberto:
        if (vendas.isAberto() == false) {

            vendas.setAberto(true);
            vendas.setVisible(true);

        } else if (vendas.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }
    }//GEN-LAST:event_buttonVendasActionPerformed

    private void buttonDeleteVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteVendaActionPerformed
        camposNaoEditaveisVendas();
    }//GEN-LAST:event_buttonDeleteVendaActionPerformed

    private void b_fiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fiadoActionPerformed
        VendasFiado vendasFiado = new VendasFiado();

        if (vendasFiado.isAberto() != false) {

            if (vendasFiado.isAberto() == true) {

                JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

            }

        } else {
            vendasFiado.setAberto(true);
            vendasFiado.setVisible(true);
        }

    }//GEN-LAST:event_b_fiadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int setar = tableRelatorio.getSelectedRow();

        if (setar >= 0) {
            String dataVendaString = tableVendas.getModel().getValueAt(setar, 4).toString();
            LocalDate dataVenda = Util.Util.converterData(dataVendaString);
            try {
                Connection conexao = new Conexao().getConnection();
                VendasDAO vendasDAO = new VendasDAO(conexao);
                BigDecimal valorTotal1 = new BigDecimal("0");
                List<Vendas> relatorio = vendasDAO.relatorioVendas(dataVenda);
                //Connection conexao1 = new Conexao().getConnection();
                //ArrayList<Vendas> lista1 = vendasDAO.listarVendas();
                RelatorioDetalhado RD = new RelatorioDetalhado();
                Connection conexao1 = new Conexao().getConnection();
                ProdutoDAO produtoDAO = new ProdutoDAO(conexao1);
                ArrayList<Produtos> lista2 = produtoDAO.listarProdutosOrdenadoPeloId();
                if (RD.isAberto() == false) {
                    RD.setAberto(true);

                    RD.setVisible(true);

                    DefaultTableModel model = (DefaultTableModel) RD.getTableDetalhes().getModel();
                    model.setNumRows(0);
                    //for (Produtos prod : lista2) {

                    // BigDecimal valorTotalVEndaProduto = prod.getPreco();
                    for (int i = 0; i < relatorio.size(); i++) {
                        //for (Vendas vendas : lista1) {
                        BigDecimal valorTotalVEndaProduto = relatorio.get(i).getValorProduto();
                        model.addRow(new Object[]{
                            Util.Util.converterData(relatorio.get(i).getDataVenda()),
                            Util.Util.converterValorBigDecimalparaValorMonetario(relatorio.get(i).getValorProduto())
                        });
                        if (valorTotalVEndaProduto.compareTo(BigDecimal.ZERO) > 0) {
                            valorTotal1 = valorTotal1.add(valorTotalVEndaProduto);
                        }

                        // }
                    }
                    DefaultTableModel model1 = (DefaultTableModel) RD.getLucroRelatorioDetalhado().getModel();
                    model1.setNumRows(0);
                    model1.addRow(new Object[]{
                        Util.Util.converterValorBigDecimalparaValorMonetarioNegativo(valorTotal1)

                    });

                    // }
                    //controller.listarSomatoriaRelatorioDetalhado(valorTotal1);
                } else if (RD.isAberto() == true) {

                    JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

                }

            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    //Fim PopUps
    //PopUp de sair está localizado anteriormente!
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarFerramentas;
    private javax.swing.JButton CadastrarAmigoHome;
    private javax.swing.JButton CadastrarFerramentaHome;
    private javax.swing.JPanel JP_Home;
    private javax.swing.JPanel JP_Lista;
    private javax.swing.JPanel JP_ListaAmigos;
    private javax.swing.JPanel JP_ListaFerramentas;
    private javax.swing.JPanel JP_Principal;
    private javax.swing.JPanel JP_Relatorio;
    private javax.swing.JPopupMenu JPop_Amigos;
    private javax.swing.JPopupMenu JPop_Ferramentas;
    private javax.swing.JPopupMenu JPop_Home;
    private javax.swing.JPopupMenu JPop_botoes;
    private javax.swing.JPopupMenu.Separator Separator_amigos;
    private javax.swing.JPopupMenu.Separator Separator_botoes;
    private javax.swing.JPopupMenu.Separator Separator_ferramentas;
    private javax.swing.JPopupMenu.Separator Separator_home;
    private javax.swing.JButton atualizarTabela;
    private javax.swing.JButton b_Home;
    private javax.swing.JButton b_ListaAmigos;
    private javax.swing.JButton b_ListaFerramentas;
    private javax.swing.JButton b_apagarFerramenta;
    private javax.swing.JButton b_cadastrarAmigos;
    private javax.swing.JButton b_cadastrarFerramenta;
    private javax.swing.JButton b_editarAmigo;
    private javax.swing.JButton b_editarFerramenta;
    private javax.swing.JButton b_fiado;
    private javax.swing.JButton b_mudarTema;
    private javax.swing.JButton b_opcoes;
    private javax.swing.JButton b_refreshEmprestimos;
    private javax.swing.JButton b_relatorio;
    private javax.swing.JButton buttonDeleteVenda;
    private javax.swing.JButton buttonVendas;
    private javax.swing.JButton deleteAmigo;
    private javax.swing.JPanel divisoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel label_botoes;
    private javax.swing.JLabel label_fundo_amigos;
    private javax.swing.JLabel label_fundo_ferramentas;
    private javax.swing.JLabel label_fundo_home;
    private javax.swing.JLabel label_fundo_relatorio;
    private javax.swing.JLabel label_indicar_sair;
    private javax.swing.JLabel label_logo_amigos;
    private javax.swing.JLabel label_sair;
    private javax.swing.JLabel label_titulo_amigos;
    private javax.swing.JLabel label_titulo_ferramentas;
    private javax.swing.JLabel label_titulo_home;
    private javax.swing.JLabel label_titulo_relatorio;
    private javax.swing.JMenuItem popupAmigos;
    private javax.swing.JMenuItem popupFerramentas;
    private javax.swing.JMenuItem popupHome;
    private javax.swing.JMenuItem popupOpcoes;
    private javax.swing.JMenuItem popupRelatorio;
    private javax.swing.JMenuItem popupSair;
    private javax.swing.JMenuItem popup_amigos_cadastrar;
    private javax.swing.JMenuItem popup_amigos_refresh;
    private javax.swing.JMenuItem popup_ferramentas_cadastrar;
    private javax.swing.JMenuItem popup_ferramentas_refresh;
    private javax.swing.JMenuItem popup_home_RE;
    private javax.swing.JMenuItem popup_home_refresh;
    private javax.swing.JTable tableRelatorio;
    private javax.swing.JTable tableVendas;
    private javax.swing.JTable table_clientes;
    private javax.swing.JTable table_produtos;
    private javax.swing.JTable totalSoma;
    private javax.swing.JTable totalSomaRelatorio;
    // End of variables declaration//GEN-END:variables

    public JTable getTable_clientes() {
        return table_clientes;
    }

    public void setTable_clientes(JTable table_clientes) {
        this.table_clientes = table_clientes;
    }

    public void camposNaoEditaveisVendas() {

        DeletarVenda dv = new DeletarVenda(); //DF = DevolverFerramenta

        //Verificar se já esta aberto:
        if (dv.isAberto() == false) {

            dv.setAberto(true);

            dv.setVisible(true);
            dv.getjDevolver().setVisible(true);

            int setar = tableVendas.getSelectedRow();

            dv.getTxtId().setText(tableVendas.getModel().getValueAt(setar, 0).toString());
            dv.getTxtNomeAmigos().setText(tableVendas.getModel().getValueAt(setar, 1).toString());
            dv.getTxtNomeFerramenta().setText(tableVendas.getModel().getValueAt(setar, 2).toString());
            dv.getTxtDataEmprestimo().setText(tableVendas.getModel().getValueAt(setar, 3).toString());
            dv.getTxtDataDevolcao().setText(tableVendas.getModel().getValueAt(setar, 4).toString());
            dv.getTxtNomeAmigos().setEnabled(false);
            dv.getTxtNomeFerramenta().setEnabled(false);
            dv.getTxtDataEmprestimo().setEnabled(false);
            dv.getTxtDataDevolcao().setEnabled(false);

        } else if (dv.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }

    } // Check

    public void CarregarCampos() {
        RegistrosAmigos RA = new RegistrosAmigos(); //RA = Registro Amigos

        //Verificar se já está aberto
        if (RA.isAberto() == false) {

            RA.setAberto(true);

            RA.setVisible(true);
            int setar = table_clientes.getSelectedRow();
            RA.getUpdate().setVisible(true);
            RA.getTxtnome().setText(table_clientes.getModel().getValueAt(setar, 1).toString());
            RA.getTxttelefone().setText(table_clientes.getModel().getValueAt(setar, 2).toString());
            RA.getTxtId().setText(table_clientes.getModel().getValueAt(setar, 0).toString());

        } else if (RA.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }

    } //Check

    public void camposNaoEditaveis() {
        RegistrosAmigos RA = new RegistrosAmigos(); // RA = Registro Amigos

        //Verificar se já esta aberto
        if (RA.isAberto() == false) {
            RA.setAberto(true);

            RA.setVisible(true);
            RA.getjDeleteAmigo().setVisible(true);
            RA.getjBotaoCadastro().setVisible(false);

            int setar = table_clientes.getSelectedRow();
            RA.getUpdate().setVisible(false);
            RA.getTxtnome().setText(table_clientes.getModel().getValueAt(setar, 1).toString());
            RA.getTxttelefone().setText(table_clientes.getModel().getValueAt(setar, 2).toString());
            RA.getTxtId().setText(table_clientes.getModel().getValueAt(setar, 0).toString());
            RA.getTxtnome().setEnabled(false);
            RA.getTxttelefone().setEnabled(false);

        } else if (RA.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }

    } //Check

    public void CarregarCamposFerramentas() {
        RegistroProdutos RF = new RegistroProdutos();

        //Verificar se já está aberto
        if (RF.isAberto() == false) {

            RF.setAberto(true);

            RF.setVisible(true);

            if (b_editarOuDeletar == true) {
                RF.getjDeleteFerramenta().setVisible(false);
                RF.getUpdateFerramenta().setVisible(true);

            } else if (b_editarOuDeletar == false) {
                RF.getUpdateFerramenta().setVisible(false);
                RF.getjDeleteFerramenta().setVisible(true);
            }

            int setar = table_produtos.getSelectedRow();

            RF.getTxtnomeFerramenta().setText(table_produtos.getModel().getValueAt(setar, 1).toString());
            RF.getTxtMarca().setText(table_produtos.getModel().getValueAt(setar, 2).toString());
            RF.getjFormattedTextField1().setText(table_produtos.getModel().getValueAt(setar, 3).toString());
            RF.getTxtQuantidade().setText(table_produtos.getModel().getValueAt(setar, 4).toString());
            RF.getTxtId().setText(table_produtos.getModel().getValueAt(setar, 0).toString());
        } else if (RF.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }

    } //Check

    public void camposNaoEditaveisFerramentas() {
        RegistroProdutos RF = new RegistroProdutos();

        //Verificar se já está aberto
        if (RF.isAberto() == false) {
            RF.setAberto(true);

            RF.setVisible(true);

            RF.getjDeleteFerramenta().setVisible(true);
            RF.getjBotaoCadastroFerramenta().setVisible(false);

            int setar = table_produtos.getSelectedRow();

            RF.getUpdateFerramenta().setVisible(false);
            RF.getTxtnomeFerramenta().setText(table_produtos.getModel().getValueAt(setar, 1).toString());
            RF.getTxtMarca().setText(table_produtos.getModel().getValueAt(setar, 2).toString());
            RF.getjFormattedTextField1().setText(table_produtos.getModel().getValueAt(setar, 3).toString());
            RF.getTxtQuantidade().setText(table_produtos.getModel().getValueAt(setar, 4).toString());
            RF.getTxtId().setText(table_produtos.getModel().getValueAt(setar, 0).toString());
            RF.getTxtnomeFerramenta().setEnabled(false);
            RF.getTxtMarca().setEnabled(false);
            RF.getjFormattedTextField1().setEnabled(false);
            RF.getTxtQuantidade().setEnabled(false);
        } else if (RF.isAberto() == true) {

            JOptionPane.showMessageDialog(null, "Uma janela deste tipo já está aberta!", "Não foi possivel abrir a janela", 2);

        }

    } //Check

    public JTable getTotalSoma() {
        return totalSoma;
    }

    public void setTotalSoma(JTable totalSoma) {
        this.totalSoma = totalSoma;
    }

    public JTable getTable_produtos() {
        return table_produtos;
    }

    public void setTable_produtos(JTable table_produtos) {
        this.table_produtos = table_produtos;
    }

    public JTable getTableRelatorio() {
        return tableRelatorio;
    }

    public void setTableRelatorio(JTable tableRelatorio) {
        this.tableRelatorio = tableRelatorio;
    }

    public JTable getTableVendas() {
        return tableVendas;
    }

    public void setTableVendas(JTable tableVendas) {
        this.tableVendas = tableVendas;
    }

    public ListaClientesProdutosController getListaClientesProdutosController() {
        return this.controller;

    }

    public JTable getTotalSomaRelatorio() {
        return totalSomaRelatorio;
    }

    public void setTotalSomaRelatório(JTable totalSomaRelatorio) {
        this.totalSomaRelatorio = totalSomaRelatorio;
    }

}
