/*
LISTAR
 */
package P01Mod3Ventas;

import Modelos.ColeccionVentas;
import Modelos.Venta;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Victor Sinigoj
 */
public class Listar {

    public Listar() {
    }
    
    @Test
    public void Listar(){
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado=new ArrayList<Venta>();
        ArrayList<Venta> obtenido=instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
    
}
