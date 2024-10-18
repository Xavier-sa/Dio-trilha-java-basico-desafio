public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println(String.format("Agência: %d", getAgencia()));
        System.out.println(String.format("Número: %d", getNumero()));
        System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }
}