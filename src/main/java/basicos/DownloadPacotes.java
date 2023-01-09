package basicos;

import java.util.Scanner;

public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        String porcentagem = new String(new char[tamanho]).replace("\0", "/");
        System.out.println(porcentagem);
    }
}
