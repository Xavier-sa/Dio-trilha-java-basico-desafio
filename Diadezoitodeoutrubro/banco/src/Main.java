
public class Main {

    public static void main(String[] args) {
        // Criando contas
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        // Realizando operações
        cc.depositar(100);
        cc.transferir(50, poupanca);

        // Imprimindo os extratos
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}