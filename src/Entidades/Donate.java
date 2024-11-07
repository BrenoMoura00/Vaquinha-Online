package Entidades;

import java.time.LocalDate;

public class Donate extends Donor {
    private int idDoacao;
    private double valor;
    private LocalDate dataDoacao;
    private String metodoPagamento;

    // Construtor simplificado
    public Donate(int idDoacao, double valor, LocalDate dataDoacao, String metodoPagamento) {
        // Chama o construtor da classe Donor com valores padrão
        super("Nome Padrão", "email@dominio.com", 0.0, "doador");

        this.idDoacao = idDoacao;
        this.valor = valor;
        this.dataDoacao = dataDoacao;
        this.metodoPagamento = metodoPagamento;
    }

    // Getters e Setters
    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(LocalDate dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}