// Superclasse com as caracteristicas comuns de Livro e Periodico
public class ItemBiblioteca {

    // Atributo comum aos dois tipos
    private String titulo;

    // Construtor
    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
    }

    // Retorna o titulo
    public String getTitulo() {
        return titulo;
    }
}