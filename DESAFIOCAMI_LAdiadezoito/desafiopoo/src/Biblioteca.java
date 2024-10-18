public class Biblioteca {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("The Breaker ", "Daewon C.I");
        Livro livro2 = new Livro("The Breaker:New waves", "Daewon C.I");

        
        Usuario usuario1 = new Usuario("Xavier");
        UsuarioEstudante usuario2 = new UsuarioEstudante("Wellington", "124074");

        
        usuario1.pegarEmprestado(livro1);
        usuario2.pegarEmprestado(livro1);
        usuario1.devolverLivro(livro1);
        usuario2.pegarEmprestado(livro1); 
    }
}
