package br.edu.femass.teste;

import br.edu.femass.model.Cliente;
import br.edu.femass.model.Conta;

import java.sql.SQLOutput;

public class ContaTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas","81618273035");
        System.out.println("Imprimindo dados do Cliente:" +cliente.toString());

        cliente.CriarConta(0D);
        cliente.CriarConta(5000D);

        System.out.println("Imprimindo as contas do cliente");
        for(Conta conta : cliente.getContas()){
            System.out.println("Numero: "+conta.toString());
        }

        Conta conta = cliente.getContas().get(1);

        try {
            conta.creditar(1000D);
            conta.debitar(120D);
            conta.debitar(3000D);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Saldo da conta: "+ conta.getSaldo());
        System.out.println("Historico: \n"+ conta.getHistorico());


    }



}
