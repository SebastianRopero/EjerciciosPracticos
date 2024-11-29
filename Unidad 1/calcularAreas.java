import java.util.Scanner;

public class calcularAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione de que poligono desea calcular su area");
        System.out.println("-------------------------------------------------");
        System.out.println("1: Triangulo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Rectangulo");
        System.out.println("-------------------------------------------------");
        int figura = scanner.nextInt();

        if (figura == 1) {
            System.out.println("Ingrese la base de su triangulo");
            double baseTriangulo=scanner.nextDouble();
            System.out.println("Ingrese la altura de su triangulo");
            double alturaTriangulo=scanner.nextDouble();

            double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
            System.out.println("El area de su triangulo es " + areaTriangulo);
        } else if (figura==2) {
            System.out.println("Ingrese la medida del lado de su cuadrado");
            double ladoCuadrado=scanner.nextDouble();

            double areaCuadrado=ladoCuadrado*ladoCuadrado;
            System.out.println("El area de su cuadrado es "+areaCuadrado);
        } else if (figura==3){
            System.out.println("Ingrese la base de su rectangulo");
            double baseRectangulo=scanner.nextDouble();
            System.out.println("Ingrese la altura de su rectangulo");
            double alturaRectangulo=scanner.nextDouble();

            
            double areaRectangulo = (baseRectangulo * alturaRectangulo);
            System.out.println("El area de su rectangulo es " + areaRectangulo);
            
        }

        scanner.close();
    }
}