import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número para saber si es primo o no:");
        int numero = scanner.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

  
        System.out.println("Numeros primos entre 1 y 100");
        for (int i = 2; i <= 100; i++) {
            esPrimo = true;

            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    esPrimo = false;
                    break;

                }
            }

            if (esPrimo) { 
                System.out.print(i + " ");
              } 
        }
         
        scanner.close();
    }

}
