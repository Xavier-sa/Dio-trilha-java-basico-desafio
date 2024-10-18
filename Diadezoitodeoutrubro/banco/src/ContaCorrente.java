
public class ContaCorrente extends Conta{ 
    
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        System.err.println(String.format("Agencia: %d", super.agencia)));
        System.err.println(String.format("Conta: %d", super.numero)));
        System.err.println(String.format("saldo: %d.2f", super.saldo)));
    }
}