import java.util.Scanner;
public class media3numeros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1=scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2=scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int numero3=scanner.nextInt();

        double media=(numero1+numero2+numero3)/3;
        System.out.println("La media es: "+media);
    }
   
}
