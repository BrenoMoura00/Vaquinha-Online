package Entidades;

public class Donor {
    String nome;
    String email;
    double senha;
    String tipousuario;

//Aqui a gente fez o Construtor
    public Donor(String nome, String email, double senha, String tipousuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipousuario = tipousuario;



    }
// Aqui a gente vai colocar o Gets e Sets


    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public double getSenha() {

        return senha;
    }

    public void setSenha(double senha) {

        this.senha = senha;
    }

    public String getTipousuario() {

        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {

        this.tipousuario = tipousuario;
    }

}

