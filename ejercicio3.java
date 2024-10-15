import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bienvenido al menu de operaciones matematicas simples, escoga su opcion:");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1: suma de dos numeros: ");
        System.out.println("2: resta de dos numeros: ");
        System.out.println("3: multiplicacion de dos numeros: ");
        System.out.println("4: division de dos numeros: ");
        System.out.println("------------------------------------------------------------------------");
        int n=scanner.nextInt();

        switch (n) {
            case 1: System.out.println("Ingrese el primer numero: ");
                int suma1=scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                int suma2=scanner.nextInt();
                int totalsuma=suma1+suma2;
                System.out.println("El resultado es: "+totalsuma);
                break;

            case 2:  System.out.println("Ingrese el primer numero: ");
            int resta1=scanner.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            int resta2=scanner.nextInt();
            int totalresta=resta1-resta2;
            System.out.println("El resultado es: "+totalresta);
                break;

            case 3:  System.out.println("Ingrese el primer numero: ");
                int multiplicacion1=scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                int multiplicacion2=scanner.nextInt();
                int totalmultiplicacion=multiplicacion1*multiplicacion2;
                System.out.println("El resultado es: "+totalmultiplicacion);
             break;

            case 4:  System.out.println("Ingrese el primer numero: ");
             int division1=scanner.nextInt();
             System.out.println("Ingrese el segundo numero: ");
             int division2=scanner.nextInt();
             int totaldivision=division1/division2;
             System.out.println("El resultado es: "+totaldivision);
         break;
        
            default:
                break;
        }
    }
}
