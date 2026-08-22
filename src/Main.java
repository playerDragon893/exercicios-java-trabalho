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


    // Recebe um array de estudantes e retorna somente os aprovados
    public static Estudante[] selecionarAprovados(Estudante[] estudantes) {

        // Conta quantos estudantes foram aprovados
        int quantidadeAprovados = 0;

        for (Estudante estudante : estudantes) {
            if (estudante.calculaMedia() >= 6) {
                quantidadeAprovados++;
            }
        }

        // Se ninguém foi aprovado, retorna null
        if (quantidadeAprovados == 0) {
            return null;
        }

        // Cria um novo array com o tamanho exato dos aprovados
        Estudante[] aprovados = new Estudante[quantidadeAprovados];

        // Posição onde o próximo aprovado será colocado
        int posicao = 0;

        // Percorre novamente os estudantes
        for (Estudante estudante : estudantes) {

            // Verifica se foi aprovado
            if (estudante.calculaMedia() >= 6) {

                // Coloca o estudante no array de aprovados
                aprovados[posicao] = estudante;

                // Vai para a próxima posição
                posicao++;
            }
        }

        // Retorna o array contendo somente os aprovados
        return aprovados;
    }
}