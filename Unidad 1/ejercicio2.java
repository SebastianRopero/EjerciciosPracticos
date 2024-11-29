public class ejercicio2 {
    public static void main(String[] args) {
        int contador=0;
        for (int i=1;i<=100;i++){
            if (i%2==0) {
                contador++;
              
            }
        }
        System.out.println("El total de numeros pares entre 1 y 100 es: "+contador);
    }
}
