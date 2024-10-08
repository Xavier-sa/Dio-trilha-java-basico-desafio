public class Saiyan extends Personagem {
    private final String transformacao;
    
    public Saiyan(String nome, String poder, String habilidade, String transformacao) {
        super(nome, poder, habilidade);
        this.transformacao = transformacao;
    }
    
    public String getTransformacao() {
        return transformacao;
    }
    
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Transformação: " + transformacao);
    }
    
    @Override
    public void ataqueFinal() {
        System.out.println(getNome() + " está realizando um ataque final super poderoso!");
    }
}
