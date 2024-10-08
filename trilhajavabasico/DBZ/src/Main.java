public class Main {
    public static void main(String[] args) {
        Saiyan goku = new Saiyan("Goku", "Kamehameha", "Super Saiyan", "Super Saiyan Blue");
        Vilao frieza = new Vilao("Frieza", "Death Ball", "Telecinese", "Supernova");
        
        System.out.println("Informações do Personagem:");
        goku.mostrarInformacoes();
        System.out.println();
        frieza.mostrarInformacoes();
        System.out.println();
        
        goku.ataqueFinal();
        frieza.ataqueFinal();
    }
}
