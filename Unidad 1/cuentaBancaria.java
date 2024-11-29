public class cuentaBancaria {
    public static void main(String[] args) {
        int cuentaBancaria = 1000;
        int cantidadRetirar = 200;
        int semana=1;
        

        for(int i=1;i<=4;i++){
            cuentaBancaria-=cantidadRetirar;
            System.out.println("En la semana "+semana+" quedaron "+cuentaBancaria+ " pesos");
            semana++;
        }
    }
}
