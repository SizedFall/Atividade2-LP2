package atividadeLP2;

public class Livro extends Publicacao {
    private int numeroPaginas;
    private String edicao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, String editora, int quantidadeDisponivel, int numeroPaginas, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantidadeDisponivel);
        this.numeroPaginas = numeroPaginas;
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void imprimirDados() {
        System.out.println("Livro: " + getTitulo() +
                           "\nAutor: " + getAutor() +
                           "\nAno de Publicação: " + getAnoPublicacao() +
                           "\nGênero: " + getGenero() +
                           "\nEditora: " + getEditora() +
                           "\nQuantidade Disponível: " + getQuantidadeDisponivel() +
                           "\nNúmero de Páginas: " + numeroPaginas +
                           "\nEdição: " + edicao +
                           "\nISBN: " + isbn);
    }
}