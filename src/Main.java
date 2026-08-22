package src;

public class Main {

    public static void main(String[] args) {

        // Cria um estudante
        Estudante estudante = new Estudante("Juan");

        // Insere as 5 notas pelo teclado
        estudante.insereNotas();

        // Mostra o nome
        System.out.println("Nome: " + estudante.getNome());

        // Mostra as notas
        System.out.println("Notas:");

        for (double nota : estudante.getNotas()) {
            System.out.println(nota);
        }

        // Mostra a média
        System.out.println("Media: " + estudante.calculaMedia());

        // Mostra a menor nota
        System.out.println("Menor nota: " + estudante.menorNota());
    }
}