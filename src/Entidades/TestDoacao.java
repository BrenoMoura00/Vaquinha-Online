package Entidades;

import Entidades.Donor;
import Entidades.Donate;
import Entidades.Campaign;
import java.time.LocalDate;

public class TestDoacao {

    public static void main(String[] args) {
        // Criar um Donor (Doador) com os parâmetros necessários
        Donor doador = new Donor("Batata", "Batata@email.com", 12345.67, "doador");

        // Criar uma Campaign (Campanha)
        Campaign campanha = new Campaign(1, "Campanha Solidariedade", "Ajuda para os mais necessitados", 5000.00, LocalDate.now(), 20241231, 0.0);

        // Criar uma nova doação com o novo construtor simplificado
        Donate doacao = new Donate(1, 100.0, LocalDate.now(), "Cartão de Crédito");

        // Adicionar a doação à campanha
        campanha.getDonate().add(doacao);

        // Atualizar o valor arrecadado na campanha
        campanha.setArrecadadoValor(campanha.getArrecadadoValor() + doacao.getValor());

        // Exibir detalhes da doação
        System.out.println("Doação Realizada!");
        System.out.println("Nome do Doador: " + doador.getNome());
        System.out.println("Valor da Doação: R$" + doacao.getValor());
        System.out.println("Método de Pagamento: " + doacao.getMetodoPagamento());
        System.out.println("Data da Doação: " + doacao.getDataDoacao());

        // Exibir o valor arrecadado na campanha após a doação
        System.out.println("\nValor arrecadado na campanha após a doação: R$" + campanha.getArrecadadoValor());
    }
}