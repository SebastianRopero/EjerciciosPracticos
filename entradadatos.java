import java.util.Scanner;

public class entradadatos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre=scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad=scanner.nextInt();

        System.out.println("Ingrese su altura: ");
        double altura=scanner.nextDouble();
        System.out.println(" ");

        System.out.println("Su nombre es "+nombre);
        System.out.println("Su edad es "+edad);
        System.out.printf("Su altura es %.2f ",altura);
    }
}