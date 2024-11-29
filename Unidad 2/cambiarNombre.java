class Persona {
    String nombre;
}

public class cambiarNombre {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.nombre="Sebastian";
        CambiarNombre(persona);
        System.out.println("Nombre despues de cambiar el nombre: "+persona.nombre);
    }

    public static void CambiarNombre (Persona persona){
       persona.nombre="David";         
    }
    
}
