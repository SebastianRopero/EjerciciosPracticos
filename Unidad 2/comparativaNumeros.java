import java.util.Scanner;

public class comparativaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero: ");
        int numero_1 = scanner.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int numero_2 = scanner.nextInt();
        System.out.println("Ingrese tercer numero: ");
        int numero_3 = scanner.nextInt();
        int numero_Mayor=comparativa(numero_1, numero_2, numero_3);
        System.out.println("El numero mayor es: "+numero_Mayor);
        scanner.close();
    }

    public static int comparativa (int numero_1, int numero_2, int numero_3) {
        if (numero_1 > numero_2 && numero_1 > numero_3) {
            return numero_1;
        } else if (numero_2 > numero_1 && numero_2 > numero_3) {
            return numero_2;
        } else {
            return numero_3;
        }
    }

}
