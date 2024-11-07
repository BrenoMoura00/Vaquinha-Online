package Entidades;

import java.time.LocalDate;

public class Donate extends Donor {
    private int idDoacao;
    private double valor;
    private LocalDate dataDoacao;
    private String metodoPagamento;

    // Construtor
    public Donate(int idDoacao, double valor, LocalDate dataDoacao, String metodoPagamento) {
        this.idDoacao = idDoacao;
        this.valor = valor;
        this.dataDoacao = dataDoacao;
        this.metodoPagamento = metodoPagamento;
    }

    // Getters
    public int getIdDoacao() {
        return idDoacao;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getDataDoacao() {
        return dataDoacao;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    // Setters
    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataDoacao(LocalDate dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

}