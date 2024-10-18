class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro " + titulo + " foi emprestado.");
        } else {
            System.out.println("O livro " + titulo + " não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("O livro " + titulo + " foi devolvido.");
    }
}