package intermediarios;

import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[4];

        listaIngredientes = ingredientes.split(";");

        for (String listaIngrediente : listaIngredientes) {
            System.out.println(listaIngrediente);
        }
    }
}
