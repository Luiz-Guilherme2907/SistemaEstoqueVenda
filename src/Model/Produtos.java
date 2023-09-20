package Model;

import java.math.BigDecimal;

/*


author @Ryan / @Caio
 */
public class Produtos {

    private int id;
    private String nome;
    private String marca;
    private int estaEmprestada = 0;
    private BigDecimal valor; //Para buscar valor use getPreco()
    private int quantidade;

    public Produtos() {
    }

    public Produtos(String nome, String marca, BigDecimal valor, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produtos(int id, String nome, String marca, BigDecimal valor, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //POR ALGUM MOTIVO DDESCONHECIDO getValor tava bugando todo o código, então coloquei getPreco
    public BigDecimal getPreco() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getEstaEmprestada() {
        return estaEmprestada;
    }

    public void setEstaEmprestada(int estaEmprestada) {
        this.estaEmprestada = estaEmprestada;
    }

}
