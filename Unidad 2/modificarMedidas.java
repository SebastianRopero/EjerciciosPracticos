class Rectangulo {
    int alto;
    int ancho;
}

public class modificarMedidas {
        public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        rect.alto = 20;
        rect.ancho = 10;
        System.out.println("Antes de la modificacion: ");
        System.out.println(rect.alto + "," + rect.ancho);
        modificarRectangulo(rect);
        System.out.println("Despues de la modificacion: ");
        System.out.println(rect.alto+","+rect.ancho);

    }

    public static void modificarRectangulo(Rectangulo rect) {
        rect.alto=30;
        rect.ancho=20;
    }
}