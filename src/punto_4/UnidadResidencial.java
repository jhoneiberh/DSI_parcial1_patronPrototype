package punto_4;

public class UnidadResidencial implements Cloneable
{
    private String nombre = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public UnidadResidencial clonar() throws CloneNotSupportedException
    {
        return (UnidadResidencial) this.clone();
    }
    
    
}
