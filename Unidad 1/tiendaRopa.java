import java.util.Scanner;

public class tiendaRopa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double descuento = 0.85;
        double descuentoAdicional = 0.95;
        int precioCamiseta = 25;
        int precioPantalon = 30;
        double resultado;

        System.out.println("Ingrese el numero de camisetas que desea comprar: ");
        int camiseta=scanner.nextInt();
        System.out.println("Ingrese el numero de pantalones que desea comprar: ");
        int pantalon=scanner.nextInt();

        if (camiseta>=2) {
            int totalCamiseta=precioCamiseta*camiseta;
            totalCamiseta*=descuentoAdicional;
           resultado=((pantalon*precioPantalon)+(totalCamiseta))*descuento;
        } else {
            resultado=((pantalon*precioPantalon)+(camiseta*precioCamiseta))*descuento;
        }

        System.out.println("El total a pagar es de: "+resultado);
        scanner.close();
    }
}
