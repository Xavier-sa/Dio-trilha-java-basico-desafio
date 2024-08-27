import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)
     {
        //Criando objeto scanner
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         
        //entradas
         
        System.out.println("Digite seu nome: ");

        String nome = scanner.next();

        
        System.out.println("Digite seu sobrenome: ");

        String sobreNome = scanner.next();


        System.out.println("Digite número da conta: ");

        int numeroConta = scanner.nextInt();


        System.out.println("Digite número da Agência: ");

        String numeroAgencia = scanner.next();


        System.out.println("Informe valor de deposito: ");

        double valorDeposito = scanner.nextDouble();

        
        //saidas      
        


        System.out.println("-----------------------------------------");
        System.out.println(" \t               COMPROVANTE                ");
        System.out.println("-----------------------------------------");
        System.out.println("\tOlá " + nome + " " + sobreNome + ",");
        System.out.println();
        System.out.println("\tObrigado por criar uma conta em nosso banco.");
        System.out.println();
        System.out.println("\tSua agência é:        " + numeroAgencia);
        System.out.println();
        System.out.println("\tNúmero da Conta:      " + numeroConta);
        System.out.println();
        System.out.println("\tSaldo de R$           " + String.format("%.2f", valorDeposito));
        System.out.println();
        System.out.println("\tJá está disponível para saque.");
        System.out.println();
        System.out.println("-----------------------------------------");






    }
}