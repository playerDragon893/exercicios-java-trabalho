// Classe Livro herda as caracteristicas de ItemBiblioteca
public class Livro extends ItemBiblioteca {

    // Indica se o livro esta disponivel para emprestimo
    private boolean disponivel;

    // Construtor
    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    // Empresta o livro
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    // Devolve o livro
    public void devolver() {
        disponivel = true;
    }

    // Retorna a disponibilidade do livro
    public boolean isDisponivel() {
        return disponivel;
    }
}