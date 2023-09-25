import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][], matriz2[][], suma[][];

        matriz1 = new int[3][3];
        matriz2 = new int[3][3];

        System.out.println("Digite los datos de la primera matriz: ");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz1[f][c] = entrada.nextInt();
            }
        }

        System.out.println("Digite los datos de la segunda matriz: ");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz2[f][c] = entrada.nextInt();

            }
        }

        suma = new int[3][3];
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                suma [f][c] = matriz1[f][c] + matriz2[f][c];

            }
        }

        System.out.println("La matriz suma ");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println(suma[f][c]+" - ");

            }
        }
    }
}