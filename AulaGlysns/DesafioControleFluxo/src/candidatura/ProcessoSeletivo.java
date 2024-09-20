package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        List<String> candidatosSelecionados = selecaoCandidatos();
        imprimirSelecionados(candidatosSelecionados);
        tentarContato(candidatosSelecionados);
    }

    static List<String> selecaoCandidatos() {
        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", 
            "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", 
            "DANIELA", "JORGE"
        };

        List<String> candidatosSelecionados = new ArrayList<>();
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados.size() < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados.add(candidato);
            }
            candidatosAtual++;
        }
        return candidatosSelecionados;
    }

    static void imprimirSelecionados(List<String> candidatosSelecionados) {
        System.out.println("\nImprimindo a lista de candidatos selecionados:");
        for (int indice = 0; indice < candidatosSelecionados.size(); indice++) {
            System.out.println("Candidato n°" + (indice + 1) + ": " + candidatosSelecionados.get(indice));
        }
    }

    static void tentarContato(List<String> candidatosSelecionados) {
        for (String candidato : candidatosSelecionados) {
            int tentativas = 0;
            boolean contato = false;

            while (tentativas < 3 && !contato) {
                tentativas++;
                if (contatoCandidato()) {
                    System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " APÓS " + tentativas + " TENTATIVA(S)");
                    contato = true; // Contato foi bem-sucedido
                } else {
                    System.out.println("Tentativa " + tentativas + " com " + candidato + " não foi bem-sucedida.");
                }
            }

            if (!contato) {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato);
            }
        }
    }

    static boolean contatoCandidato() {
        // Simulando a chance de contato com o candidato
        return ThreadLocalRandom.current().nextBoolean(); // 50% de chance de contato
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1500.0, 2500.0); // Gera um valor entre 1500 e 2500
    }
}
