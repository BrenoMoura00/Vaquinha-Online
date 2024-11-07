package Entidades;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Campaign {
   int idcampanha;
   String titulo;
   String descricao;
   double metaValor;
   double arrecadadoValor;
    LocalDate dataInicio;
    int dataFim;
    List<Entidades.Donate> Donate = new ArrayList<>();

//Aqui embaixo vai ficar o construtor

    public Campaign(int idcampanha, String titulo, String descricao, double metaValor, LocalDate dataInicio, int dataFim, double arrecadadoValor) {
        super();
        this.idcampanha = idcampanha;
        this.titulo = titulo;
        this.descricao = descricao;
        this.metaValor = metaValor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.arrecadadoValor = 0;
        this.Donate = new ArrayList<>();


    }
    // Aqui vai ficar os Gets e Sets
    public int getIdcampanha() {
        return idcampanha;

    }
    public void setIdcampanha(int idcampanha) {
        this.idcampanha = idcampanha;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getMetaValor() {
        return metaValor;
    }
    public void setMetaValor(double metaValor) {
        this.metaValor = metaValor;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public int getDataFim() {
        return dataFim;
    }
    public void setDataFim(int dataFim) {
        this.dataFim = dataFim;
    }
    public double getArrecadadoValor() {
        return arrecadadoValor;
    }
    public void setArrecadadoValor(double arrecadadoValor) {
        this.arrecadadoValor = arrecadadoValor;
    }

}
