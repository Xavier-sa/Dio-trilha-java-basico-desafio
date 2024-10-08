import java.util.Scanner;
//case 1
public class ControleSalario {
    public static void main(String[] args) {
        // Salário base
        double salarioBase = 2000.00;

        
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar salário pretendido
            System.out.println("Digite o salário pretendido pelo candidato:");
            double salarioPretendido = scanner.nextDouble();

            // Controle de fluxo
            if (salarioBase > salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");// se for menor lig
            } else if (salarioBase == salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");//igual ligo e tento baiza
            } else {
                System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");//nao entro em contato
            }
        } 
    }
}
