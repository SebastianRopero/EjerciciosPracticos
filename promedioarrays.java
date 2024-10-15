import java.util.Scanner;

public class promedioarrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] notas = new int [5]; 
        double suma=0;

        for (int i=0;i<notas.length;i++){
            System.out.println("Ingresa las notas");
            notas [i]=scanner.nextInt();
            suma+=notas[i];
           
        }

        double promedio=suma/5;
        System.out.println("El promedio de sus notas es de: "+promedio);
        
       

       
        

    }
}