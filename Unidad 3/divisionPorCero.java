import java.util.Scanner;
public class divisionPorCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Ingrese el primer numero: ");
        int numero1=scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2=scanner.nextInt();
        int resultado=numero1/numero2;
        System.out.println("El resultado: "+resultado);
   
           
        }
        catch (ArithmeticException e){
            
            System.out.println("No se puede dividir por 0");
        }
        
        

        scanner.close();
    }
}