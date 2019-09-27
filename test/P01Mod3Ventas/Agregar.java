/*
Listar Test
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
public class Agregar {

    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta=new Venta("Id", 100, 50);
        ColeccionVentas instance=new ColeccionVentas();
        boolean esperado=true;
        boolean obtenido=instance.Agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    } 
}  

