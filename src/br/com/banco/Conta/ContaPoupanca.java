package br.com.banco.Conta;

import br.com.banco.Dados.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("----------------------------");
        System.out.println("==== Extrato Conta Poupança ====");
        super.imprimirInfoComuns();
    }


}
