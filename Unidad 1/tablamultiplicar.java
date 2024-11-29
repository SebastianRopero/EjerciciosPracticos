import java.util.Scanner;

public class tablamultiplicar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n=scanner.nextInt();
        int contador=1;
        scanner.close();

        for (contador=1;contador<=10; contador++){
            int resultado=n*contador;
            System.out.println(n+"*"+contador+"="+resultado);
        }
      
    }
}
