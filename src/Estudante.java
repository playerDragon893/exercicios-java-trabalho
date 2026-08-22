package src;

import java.util.Scanner;

public class Estudante {

    // Nome do estudante
    private String nome;

    // Array com as 5 notas
    private double[] notas;

    // Construtor da classe
    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    // Metodo para inserir as 5 notas
    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {

            do {
                System.out.print("Digite a nota " + (i + 1) + " (de 0 a 10): ");
                notas[i] = scanner.nextDouble();

                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Nota invalida! Digite uma nota entre 0 e 10.");
                }

            } while (notas[i] < 0 || notas[i] > 10);
        }
    }

    // Metodo para calcular a média
    public double calculaMedia() {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }
    // Metodo para calcular a média ponderada
    public double calculaMedia(int[] pesos) {
        double soma = 0;
        int somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return soma / somaPesos;
    }

    // Metodo para encontrar a menor nota
    public double menorNota() {
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }

    // Metodo para retornar o nome do estudante
    public String getNome() {
        return nome;
    }

    // Metodo para retornar o array de notas
    public double[] getNotas() {
        return notas;
    }
}