/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author GUI
 */
public class FiadoDTO {

    private int id;
    private String nomeCliente;
    private String produtos;
    private String dataVendaFiado;
    private int quantidade;
    public FiadoDTO() {
    }

    public FiadoDTO(int id, String nomeCliente, String produtos, String dataVendaFiado, int quantidade) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.produtos = produtos;
        this.dataVendaFiado = dataVendaFiado;
        this.quantidade = quantidade;
    }

    public FiadoDTO(String nomeCliente, String produtos, String dataVendaFiado, int quantidade) {
        this.nomeCliente = nomeCliente;
        this.produtos = produtos;
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

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getDataVendaFiado() {
        return dataVendaFiado;
    }

    public void setDataVendaFiado(String dataVendaFiado) {
        this.dataVendaFiado = dataVendaFiado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    
    
}
