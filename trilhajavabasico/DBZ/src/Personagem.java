public class Personagem {
    private final String nome;
    private final String poder;
    private final String habilidade;
    
    public Personagem(String nome, String poder, String habilidade) {
        this.nome = nome;
        this.poder = poder;
        this.habilidade = habilidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getPoder() {
        return poder;
    }
    
    public String getHabilidade() {
        return habilidade;
    }
    
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Habilidade: " + habilidade);
    }
    
    public void ataqueFinal() {
        System.out.println(nome + " está realizando um ataque final!");
    }
}
