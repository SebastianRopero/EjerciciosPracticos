
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class raizNegativa {
   
    public static double calcularRaizCuadrada(double numero) throws NumeroNegativoException {
        
        if (numero < 0) {
            throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo: " + numero);
        }
        
       
        return Math.sqrt(numero);
    }
    
    
    public static void main(String[] args) {
        try {
            
            System.out.println("Raíz cuadrada de 16: " + calcularRaizCuadrada(16));
            System.out.println("Raíz cuadrada de 9: " + calcularRaizCuadrada(9));
            
            
            System.out.println("Raíz cuadrada de -4: " + calcularRaizCuadrada(-4));
        } catch (NumeroNegativoException e) {
            
            System.err.println("Error: " + e.getMessage());
        }
    }
}