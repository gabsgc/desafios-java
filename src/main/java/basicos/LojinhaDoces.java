package basicos;

import java.util.Scanner;

public class LojinhaDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        int docesRecebidos = doce * 2;

        System.out.printf("O cliente obteve %d doces%n", docesRecebidos);
    }
}
