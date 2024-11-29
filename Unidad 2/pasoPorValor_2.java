import java.util.Scanner;

public class pasoPorValor_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int x=scanner.nextInt();
        System.out.println("El valor de su numero antes de modificar es: "+x);
        incrementar(x);
        System.out.println("El valor de su numero despues de modificar es: "+x);

        scanner.close();
    }

    public static void incrementar(int x){
        x+=1;
        System.out.println("El valor de su numero durante el metodo: "+x);
        
    }
}
