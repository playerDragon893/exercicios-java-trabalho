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
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
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

}