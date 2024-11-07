package Service;

import Entidades.Donor;

public class VerificationD extends Donor {

    // Construtor da classe, chamando o construtor da superclasse Donor
    public VerificationD(String nome, String email, double senha, String tipousuario) {
        super(nome, email, senha, tipousuario);
    }

    // Metodo para verificar se o e-mail do doador é válido
    public boolean validarEmail() {
        // Verifica se o e-mail contém um "@" e um "."
        return this.getEmail().contains("@") && this.getEmail().contains(".");
    }

    // Metodo para verificar se a senha é forte (exemplo: pelo menos 8 caracteres)
    public boolean validarSenha() {
        // Checa se a senha tem pelo menos 8 caracteres
        return String.valueOf(this.getSenha()).length() >= 8;
    }

    // Metodo para verificar se o tipo de usuário é permitido
    public boolean validarTipoUsuario() {
        // Suponha que só exista "doador" ou "admin" como tipos de usuários válidos
        return this.getTipousuario().equals("doador") || this.getTipousuario().equals("admin");
    }

    // Metodo que verifica todos os dados
    public boolean validarDados() {
        return validarEmail() && validarSenha() && validarTipoUsuario();
    }
}