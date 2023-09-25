import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][], matriz2[][], suma[][]; //Se crean las matrices y sumas

        matriz1 = new int[3][3]; //Se hace la declaracion del espacio de la primer matriz
        matriz2 = new int[3][3]; //Se hace la declaracion del espacio de la primer matriz

        //Se piden los datos de la primera matriz
        System.out.print("Digite los datos de la primera matriz: ");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz1[f][c] = entrada.nextInt();
            }
        }
        //Se piden los datos de la segunda matriz
        System.out.print("Digite los datos de la segunda matriz: ");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz2[f][c] = entrada.nextInt();
            }
        }
        //Se declara la matriz suma el cual va tener un espacio de nxm segun la entrada
        suma = new int[3][3];
        //Se hace la suma de fila por fila y columna por columna de cada matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                suma [f][c] = matriz1[f][c] + matriz2[f][c];

            }
        }
        //Se muestra la matriz suma resultante en consola
        System.out.println("La matriz suma ");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(suma[f][c]+" ");

            }
            System.out.println(" ");
        }
    }
}