package Aula_5;

import javax.swing.JOptionPane;
import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random random = new Random();
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual será o tamanho desse vetor?"));
        int[] vetor = new int[tamanho];
        int soma = 0;
        int multiplos5 = 0;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
            soma += vetor[i];
            if (vetor[i] % 5 == 0) {
                multiplos5++;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        float media = soma / tamanho;
        System.out.println("Média desse vetor: " + media);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d\t", vetor[i]);
        }
        System.out.printf("\nDentro desse vetor, %d números são múltiplos de 5\nO menor valor desse vetor é: %d\n",
                multiplos5,
                menor);
    }
}
