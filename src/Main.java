public class Main {

    public static void main(String[] args) {

        // Cria um livro
        Livro livro = new Livro("O Hobbit");

        // Cria um periodico
        Periodico periodico = new Periodico("Revista Ciencia", 10);

        // Mostra os dados do livro
        System.out.println("Livro:");
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Disponivel: " + livro.isDisponivel());

        // Empresta o livro
        livro.emprestar();

        System.out.println("Depois do emprestimo:");
        System.out.println("Disponivel: " + livro.isDisponivel());

        // Devolve o livro
        livro.devolver();

        System.out.println("Depois da devolucao:");
        System.out.println("Disponivel: " + livro.isDisponivel());

        // Mostra os dados do periodico
        System.out.println();
        System.out.println("Periodico:");
        System.out.println("Titulo: " + periodico.getTitulo());
        System.out.println("Volume: " + periodico.getVolume());
    }
}