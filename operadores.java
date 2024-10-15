import java.util.Scanner;
public class operadores {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el primer numero ");
        int numero1=scanner.nextInt();

        System.out.println("Ingrese el segundo numero ");
        int numero2=scanner.nextInt();

        System.out.println("Ingrese el tercer numero ");
        int numero3=scanner.nextInt();

        System.out.println("numero 1>numero 2 y numero 1<numero 3: "+ (numero1>numero2 && numero1<numero3));
    }
}
