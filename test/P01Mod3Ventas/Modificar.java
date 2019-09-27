/*
MODIFICAR
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
public class Modificar {
      @Test
    public void Modificar(){
        System.out.println("Modificar");
        Venta venta=new Venta("Codigo", 8, 2);
        ColeccionVentas instance=new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado=true;  
        venta=new Venta("Codigo", 8, 265);
        boolean obtenido=instance.Modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
