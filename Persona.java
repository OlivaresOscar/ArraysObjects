

public class Persona
{
    String nombre;
    String apellido;
    int edad;
    
    // Constructor sin Parametros.
    public Persona()
    {
        
    }
    // Sobrecargando Constructor, Solicitamos nombre, apellido y edad.
    public Persona(String nom, String apell)
    {    
        this.nombre = nom;
        this.apellido = apell;
        
    }
}
