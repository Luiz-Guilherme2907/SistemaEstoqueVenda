/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author NEX
 */
public class Vendas {

    private int id;
    private int idProduto;
    private BigDecimal valorProduto;
    private LocalDate dataVenda;
    private int quantidade;
    
    public Vendas() {
    }

    public Vendas(int id, int idProduto, BigDecimal valorProduto, LocalDate dataVenda, int quantidade) {
        this.id = id;
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
        this.dataVenda = dataVenda;
        this.quantidade = quantidade;
    }

    public Vendas(int idProduto, BigDecimal valorProduto, LocalDate dataVenda, int quantidade) {
        this.idProduto = idProduto;
        this.valorProduto = valorProduto;
        this.dataVenda = dataVenda;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    

}
