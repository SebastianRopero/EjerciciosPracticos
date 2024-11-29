import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Bienvenido al MENU, elija su opcion:");
            System.out.println("----------------------------------------");
            System.out.println("1: Resta de dos numeros");
            System.out.println("2: Suma de dos numeros");
            System.out.println("3: Salir del MENU");
            System.out.println("----------------------------------------");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                System.out.print("Ingrese el primer numero: ");
                int numeroResta_1 = scanner.nextInt();
                System.out.print("Ingrese el segundo numero");
                int numeroResta_2 = scanner.nextInt();
                int resultadoResta = numeroResta_1 + numeroResta_2;
                System.out.println("El resultado es: " + resultadoResta);
                System.out.println(" ");

                    break;
                case 2:
                    System.out.print("Ingrese el primer numero: ");
                    int numeroSuma_1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero");
                    int numeroSuma_2 = scanner.nextInt();
                    int resultadoSuma = numeroSuma_1 + numeroSuma_2;
                    System.out.println("El resultado es: " + resultadoSuma);
                    System.out.println(" ");

                    break;

                case 3:
                    System.out.println("Saliendo del programa");

                    break;

                default:
                    System.out.println("Opcion no valida");
                    System.out.println(" ");
                    break;
            }
        } while (n != 3);
        scanner.close();
    }
    
}
