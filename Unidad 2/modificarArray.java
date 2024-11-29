public class modificarArray {
    public static void main(String[] args) {
        int[] numeros = { 2, 4, 6, 8, 10 };
        System.out.println("Antes de la modificacion:");
        for (int numero : numeros){           
            System.out.println(numero);
        }
        arrayModificada(numeros);
        System.out.println("Despues de la modificacion:" );
        for (int numero : numeros){
            System.out.println(numero);
        }


    }

    public static void arrayModificada(int [] numeros){
        System.out.println("Dentro del metodo: ");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        numeros[0]=1;
        numeros[1]=3;
        numeros[2]=5;
        numeros[3]=7;
        numeros[4]=9;
    }
}
