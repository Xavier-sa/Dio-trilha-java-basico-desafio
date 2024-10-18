class UsuarioEstudante extends Usuario {
    private String matricula;

    public UsuarioEstudante(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    
    @Override
    public void pegarEmprestado(Livro livro) {
        System.out.println(getNome() + " (Usuario) está tentando pegar o livro: " + livro.getTitulo());
        livro.emprestar();
    }
}
