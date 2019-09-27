/*
ELIMINAR
 */
package P01Mod3Ventas;

import Modelos.ColeccionVentas;
import Modelos.Venta;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Sinigoj
 */
public class Eliminar {
    
    @Test
    public void Eliminar(){
  
        System.out.println("Eliminar");
        String Id="Id";
        Venta venta=new Venta("Id", 8,8);
        ColeccionVentas instance =new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado=true;  
        boolean obtenido=instance.Eliminar(Id);
        Assert.assertEquals(esperado, obtenido);
    }
}

