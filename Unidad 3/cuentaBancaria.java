
class FondosInsuficientesException extends Exception {
    private double saldoActual;
    private double montoRetirado;

    public FondosInsuficientesException(String mensaje, double saldoActual, double montoRetirado) {
        super(mensaje);
        this.saldoActual = saldoActual;
        this.montoRetirado = montoRetirado;
    }

    
    public double getSaldoActual() {
        return saldoActual;
    }

    public double getMontoRetirado() {
        return montoRetirado;
    }
}


class CuentaBancaria {
    private String titular;
    private double saldo;

   
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de $" + monto + " realizado. Saldo actual: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

   
    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser positivo.");
            return;
        }

        
        if (monto > saldo) {
            throw new FondosInsuficientesException(
                "Fondos insuficientes para realizar el retiro.", 
                saldo, 
                monto
            );
        }

        
        saldo -= monto;
        System.out.println("Retiro de $" + monto + " realizado. Saldo actual: $" + saldo);
    }

    
    public double consultarSaldo() {
        return saldo;
    }

    
    @Override
    public String toString() {
        return "Cuenta de " + titular + " - Saldo: $" + saldo;
    }
}


public class cuentaBancaria {
    public static void main(String[] args) {
        try {
            
            CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);
            
            
            System.out.println(cuenta);

            
            cuenta.depositar(500);

            
            cuenta.retirar(200);

            
            cuenta.retirar(2000);

        } catch (FondosInsuficientesException e) {
            
            System.err.println("Error: " + e.getMessage());
            System.err.println("Saldo actual: $" + e.getSaldoActual());
            System.err.println("Monto intentado retirar: $" + e.getMontoRetirado());
        }
    }
}