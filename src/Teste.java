import br.com.banco.Conta.Conta;
import br.com.banco.Conta.ContaCorrente;
import br.com.banco.Conta.ContaPoupanca;
import br.com.banco.Dados.Cliente;

public class Teste {
    public static void main(String[] args) {
        Cliente ke = new Cliente();
        ke.setNome("Kethlyn");

        Conta cc = new ContaCorrente(ke);
        Conta cp = new ContaPoupanca(ke);

        cc.depositar(100);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}