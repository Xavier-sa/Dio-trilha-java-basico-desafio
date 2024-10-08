public class Vilao extends Personagem {
    private final String ataqueEspecial;
    
    public Vilao(String nome, String poder, String habilidade, String ataqueEspecial) {
        super(nome, poder, habilidade);
        this.ataqueEspecial = ataqueEspecial;
    }
    
    public String getAtaqueEspecial() {
        return ataqueEspecial;
    }
    
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Ataque Especial: " + ataqueEspecial);
    }
    
    @Override
    public void ataqueFinal() {
        System.out.println(getNome() + " está realizando um ataque final maligno!");
    }
}
