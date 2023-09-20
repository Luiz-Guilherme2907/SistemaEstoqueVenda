/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author GUI
 */
public class Fiado {

    private int id;
    private String nomeCliente;
    private int idProduto;
    private LocalDate dataVendaFiado;
    private int quantidade;

    public Fiado() {
    }

    public Fiado(int id, String nomeCliente, int idProduto, LocalDate dataVendaFiado, int quantidade) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.idProduto = idProduto;
        this.dataVendaFiado = dataVendaFiado;
        this.quantidade = quantidade;
    }

    public Fiado(String nomeCliente, int idProduto, LocalDate dataVendaFiado, int quantidade) {
        this.nomeCliente = nomeCliente;
        this.idProduto = idProduto;
        this.dataVendaFiado = dataVendaFiado;
        this.quantidade = quantidade;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public LocalDate getDataVendaFiado() {
        return dataVendaFiado;
    }

    public void setDataVendaFiado(LocalDate dataVendaFiado) {
        this.dataVendaFiado = dataVendaFiado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
}
