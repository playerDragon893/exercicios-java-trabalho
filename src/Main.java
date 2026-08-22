package src;

public class Main {

    public static void main(String[] args) {

        // Cria 3 estudantes
        Estudante estudante1 = new Estudante("Juan");
        Estudante estudante2 = new Estudante("Maria");
        Estudante estudante3 = new Estudante("Pedro");

        // Insere as notas de cada estudante
        System.out.println("Notas do Juan:");
        estudante1.insereNotas();

        System.out.println("Notas da Maria:");
        estudante2.insereNotas();

        System.out.println("Notas do Pedro:");
        estudante3.insereNotas();

        // Cria um array contendo os 3 estudantes
        Estudante[] estudantes = {
                estudante1,
                estudante2,
                estudante3
        };

        // Pesos das 5 notas
        int[] pesos = {1, 2, 3, 2, 1};

        // Mostra as médias
        System.out.println("\nMedias:");

        for (Estudante estudante : estudantes) {
            System.out.println(
                    estudante.getNome() +
                            " - Media normal: " + estudante.calculaMedia() +
                            " - Media ponderada: " + estudante.calculaMedia(pesos)
            );
        }

        // Chama o metodo do exercício 2
        Estudante[] aprovados = selecionarAprovados(estudantes);

        // Verifica se houve algum aprovado
        if (aprovados == null) {

            System.out.println("\nNenhum estudante foi aprovado.");

        } else {

            System.out.println("\nEstudantes aprovados:");

            for (Estudante estudante : aprovados) {
                System.out.println(
                        estudante.getNome() +
                                " - Media: " + estudante.calculaMedia()
                );
            }
        }
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

        // Se ninguém foi aprovado
        if (quantidadeAprovados == 0) {
            return null;
        }

        // Cria o array somente com os aprovados
        Estudante[] aprovados = new Estudante[quantidadeAprovados];

        // Posição no novo array
        int posicao = 0;

        // Percorre novamente os estudantes
        for (Estudante estudante : estudantes) {

            if (estudante.calculaMedia() >= 6) {

                aprovados[posicao] = estudante;
                posicao++;
            }
        }

        // Retorna os aprovados
        return aprovados;
    }
}