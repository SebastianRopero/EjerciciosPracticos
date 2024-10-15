import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero al que quiere sacar su factorial: ");
        int numero = scanner.nextInt();
        int factorial = 1;

        while (numero > 1) {
            factorial *= numero;
            numero--;

        }
        System.out.println("El factorial del numero es: " + factorial);

    }
}
