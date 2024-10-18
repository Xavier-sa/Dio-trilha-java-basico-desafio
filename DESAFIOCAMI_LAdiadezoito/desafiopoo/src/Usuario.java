class Usuario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void pegarEmprestado(Livro livro) {
        System.out.println(nome + " está tentando pegar o livro: " + livro.getTitulo());
        livro.emprestar();
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        System.err.println("---------------------------------------------");
    }
}