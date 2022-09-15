package punto_4;

import java.util.Hashtable;

public class UrbanizacionEncantoValle 
{
    private Hashtable tablaUnidades = new Hashtable();

    public UrbanizacionEncantoValle() 
    {
        UnidadResidencial losHelechos = new UnidadResidencialLosHelechos();
        losHelechos.setNombre("Los Helechos");
        this.tablaUnidades.put(losHelechos.getNombre(), losHelechos);
        
        UnidadResidencial lasPalmas = new UnidadResidencialLasPalmas();
        lasPalmas.setNombre("Las Palmas");
        this.tablaUnidades.put(lasPalmas.getNombre(), lasPalmas);
        
        UnidadResidencial lasHeliconias = new UnidadResidencialLasHeliconias();
        lasHeliconias.setNombre("Las Heliconias");
        this.tablaUnidades.put(lasHeliconias.getNombre(), lasHeliconias);
        
        UnidadResidencial losTulipanes = new UnidadResidencialLosTulipanes();
        losTulipanes.setNombre("Los Tulipanes");
        this.tablaUnidades.put(losTulipanes.getNombre(), losTulipanes);
    }
    
    public void agregarUnidadResidencial(String prototiNombre, UnidadResidencial protoUnidad)
    {
        this.tablaUnidades.put(prototiNombre, protoUnidad);
    }
    
    
    public UnidadResidencial buscarUnidad(String prototiNombre)
    {
        UnidadResidencial prototiUnidad = (UnidadResidencial) tablaUnidades.get(prototiNombre);
        return prototiUnidad;
    }
    
    
    
    public UnidadResidencial obtenerClon(String prototiNombre)
    {
        UnidadResidencial prototipoUnidad = (UnidadResidencial)  buscarUnidad(prototiNombre);
        
        try 
        {
            return (UnidadResidencial) prototipoUnidad.clonar();
        } 
        catch (CloneNotSupportedException e) 
        {
            System.out.println("Error al clonar");
            System.exit(0);
        }
         
        
        return null;
                
    }
    
    
    
}
