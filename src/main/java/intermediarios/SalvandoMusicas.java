package intermediarios;

import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String[] formato = arquivoDoPc.split("\\.");

        if (formato[1].contains("mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }
    }
}
