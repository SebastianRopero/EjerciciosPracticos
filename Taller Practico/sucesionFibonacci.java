public class sucesionFibonacci {

    public static void main(String[] args) {
        long numero1=0;
        long numero2=1;
        System.out.println(numero1);
        System.out.println(numero2);
        for (int i=0; i<50; i++){
            
            long numeroTemporal=numero1+numero2;
            System.out.println(numeroTemporal);
            
            numero1=numero2;
            numero2=numeroTemporal;
           

        }

    }
}