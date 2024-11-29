public class modificarTexto {
    public static void main(String[] args) {
        String textoOriginal = "Soy una cadena de texto ";
        System.out.println("Antes del metodo: " + textoOriginal);
        modificarCadena(textoOriginal);
        System.out.println("Despues del metodo: " + textoOriginal);
    }

    public static void modificarCadena(String texto) {
        texto = texto + "MODIFICADO";
        System.out.println("Dentro del metodo: " + texto);
    }
}
