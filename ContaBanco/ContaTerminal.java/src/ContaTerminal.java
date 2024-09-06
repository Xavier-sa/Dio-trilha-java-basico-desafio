public class ContaTerminal {
    public static void main(String[] args) {
        // Primeiro teste
        double saldo = 25;
        double valorSolicitado = 18;

        // Checa se o saldo é suficiente
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Mostra o saldo depois do primeiro saque
        System.out.println("Saldo depois do primeiro saque: " + saldo);

        // Segundo teste
        saldo = 15;
        valorSolicitado = 22;

        // Checa se o saldo é suficiente
        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Mostra o saldo depois do segundo saque
        System.out.println("Saldo depois do segundo saque: " + saldo);
    }
}
