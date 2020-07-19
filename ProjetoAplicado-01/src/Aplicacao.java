import componentes.Cliente;
import componentes.Filme;

import javax.swing.*;

public class Aplicacao {

    public static void main(String[] args){

        Cliente cliente1 = new Cliente();

        String nomeCliente = JOptionPane.showInputDialog("Qual o nome do cliente ?");
        String idadeCliente = JOptionPane.showInputDialog("Qual a idade do cliente ?");
        int clienteVip = JOptionPane.showConfirmDialog(null,"É cliente VIP?");
        int existeAutorizacao = JOptionPane.showConfirmDialog(null, "É maior de 18 ou tem autorização dos pais?");


        String nomeFilme = JOptionPane.showInputDialog("Qual o nome do filme ? ");
        String faixaEtariaFilme = JOptionPane.showInputDialog("Qual a faixa etária do filme ?");
        String precoBase = JOptionPane.showInputDialog("Qual o preço base de aluguel ?");

        cliente1.setNome(nomeCliente);
        cliente1.setIdade(Integer.valueOf(idadeCliente));
        cliente1.setVip(clienteVip);
        cliente1.setAutorizacao(existeAutorizacao);

        Filme filme1 = new Filme();
        filme1.setNome(nomeFilme);
        filme1.setFaixaEtaria(Integer.valueOf(faixaEtariaFilme));
        filme1.setPreco(Double.valueOf(precoBase));

        double precoFinal = 0;

        if (clienteVip == 0){
            precoFinal = filme1.getPreco() * 0.8;
            System.out.println("Adicionado desconto VIP de 20%. Valor do item com desconto: R$ " + precoFinal);
            if(existeAutorizacao != 0){
                System.out.println("Cliente menor de 16 anos ou sem autorização dos pais. Não pode alugar. Pedido cancelado.");
            }
        }
        else{
            precoFinal = filme1.getPreco();
            System.out.println("Não foi adicionado desconto VIP. Valor do item sem desconto: R$ " + precoFinal);
        }

        System.out.println("---------------------------------------");
        System.out.println("---------- GERANDO PEDIDO -------------");
        System.out.println("---------------------------------------");
        System.out.println("Nome do cliente : " + cliente1.getNome());
        System.out.println("Produto alugado : " + filme1.getNome());
        System.out.printf("Valor a ser pago: R$ %.2f %n", (precoFinal));
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");








    }
}
