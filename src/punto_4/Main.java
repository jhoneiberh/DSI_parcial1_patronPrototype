package punto_4;

public class Main 
{
    public static void main(String[] args) 
    {
        UrbanizacionEncantoValle urbanizacionEncanto = new UrbanizacionEncantoValle();
        
        System.out.println("");
        
        // Original Los Helechos
        UnidadResidencial originalLosHelechos = urbanizacionEncanto.obtenerClon("Los Helechos");
        System.out.println("La Unidad original, tiene nombre: "+originalLosHelechos.getNombre());
        
        // Clon Los Helechos
        UnidadResidencial clonLosHelechos = urbanizacionEncanto.obtenerClon("Los Helechos");
        System.out.println("La Unidad clonada, tiene nombre: "+clonLosHelechos.getNombre());
       
        clonLosHelechos.setNombre("New Los Helechos");
        System.out.println("La Unidad clonada, tiene nombre: "+clonLosHelechos.getNombre());
        
        System.out.println("Unidad Original, tiene nombre: "+originalLosHelechos.getNombre()); 
        
        
        System.out.println("");
        
        
        // Original Los Palmas
        UnidadResidencial originalLasPalmas = urbanizacionEncanto.obtenerClon("Las Palmas");
        System.out.println("La Unidad original, tiene nombre: "+originalLasPalmas.getNombre());
        
        // Clon Las Palmas
        UnidadResidencial clonLasPalmas = urbanizacionEncanto.obtenerClon("Las Palmas");
        System.out.println("La Unidad clonada, tiene nombre: "+clonLasPalmas.getNombre());
       
        clonLasPalmas.setNombre("New Las Palmas");
        System.out.println("La Unidad clonada, tiene nombre: "+clonLasPalmas.getNombre());
        
        System.out.println("Unidad Original, tiene nombre: "+originalLasPalmas.getNombre());      
        
        
        
        System.out.println("");
    
    }
    
}
